/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.communication;

import br.com.mau.model.Ambiente;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.mau.dao.impl.GenericDAO;
import br.com.mau.controller.PersistenceController;
import java.util.Date;

/**
 * 
 *
 * @author Mauricio
 */
public class BluetoothCommunicator implements Communicator, SerialPortEventListener{
    
    private Ambiente a = new Ambiente();
    private GenericDAO genericDAO;
    private PersistenceController persistenceController;
    private SerialPort serialPort;
    private String saida = "", humidity = "", temperature = "", luminosity = "";
    private static final String PORT_NAMES[] = {
                        "/dev/tty.usbserial-A9007UX1", // Mac OS X
            "/dev/ttyUSB0", // Linux
            "COM4", "COM7",// Windows   
            "COM13","COM14",// Windows   
            "/dev/rfcomm0" // Ubuntu Bluetooth
    };
    private ArrayList<CommPortIdentifier> ports;
    
    private BufferedReader reader;
    private static InputStream input;
    private static OutputStream output;
    private static final int TIME_OUT = 2000;   
    private static final int DATA_RATE = 9600;

    public BluetoothCommunicator() {
        persistenceController = new PersistenceController();
        persistenceController.loadPersistenceContext();
        this.genericDAO = new GenericDAO(persistenceController.getPersistenceContext(),
        Ambiente.class);
    }
    
    

    @Override
    public void initialize() {
        Enumeration portIdentifers = getAvailablePorts();
        
        CommPortIdentifier port = null;
        String portName = "";
        ports = new ArrayList<CommPortIdentifier>();
        
        while (portIdentifers.hasMoreElements()) {            
            CommPortIdentifier currentPortId = (CommPortIdentifier) portIdentifers.nextElement();
            for (String name : PORT_NAMES) {
                if(currentPortId.getName().equals(name)){
                    port = currentPortId;
                    ports.add(currentPortId); 
                    portName = name;
                    break;
                }
            }
        }
        
    }

    public ArrayList<CommPortIdentifier> getPorts() {
        return ports;
    }
    
    @Override
    public boolean connect(CommPortIdentifier objectPort) {
        try {
            //CommPortIdentifier port = (CommPortIdentifier) objectPort;
            // open serial port, and use class name for the appName.
            serialPort = (SerialPort) objectPort.open(this.getClass().getName(),
                    TIME_OUT);
            
            // set port parameters
            serialPort.setSerialPortParams(DATA_RATE,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);

        
            // open the streams
            input = serialPort.getInputStream();
            reader = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
            output = serialPort.getOutputStream();

            // add event listeners
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);            
            
            return true;
            
        } catch (PortInUseException | UnsupportedCommOperationException | IOException | TooManyListenersException e) {
            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
    
    public boolean connect(CommPortIdentifier objectPort,int data_rate ) {
        try {
            
            serialPort = (SerialPort) objectPort.open(this.getClass().getName(),
                    TIME_OUT);
            
            
            // set port parameters
            serialPort.setSerialPortParams(data_rate,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);

        
            // open the streams
            input = serialPort.getInputStream();
            reader = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
            output = serialPort.getOutputStream();

            // add event listeners
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);            
            System.out.println("Sistema rodando na porta: "+serialPort.getName());
            
            return true;
            
        } catch (PortInUseException | UnsupportedCommOperationException | IOException | TooManyListenersException e) {
            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
            
        }
        return false;
    }
    

    @Override
    public void close() {
       if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
        }
    }

    @Override
    public Enumeration getAvailablePorts() {
        return CommPortIdentifier.getPortIdentifiers();
    }

    @Override
    public synchronized void write(int cmd) {
        if(output != null){
            try {                                
                output.write(cmd);
                output.flush();
                
            } catch (IOException ex) {
                Logger.getLogger(BluetoothCommunicator.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
                System.out.println("Não foi possível enviar o comando");
            }
    }
    
    public static synchronized void escreve(String cmd){
        if(output != null){
            try {                                
                output.write(cmd.getBytes());
                //output.flush();
                
            } catch (IOException ex) {
                Logger.getLogger(BluetoothCommunicator.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
                System.out.println("Não foi possível enviar o comando");
            }
    }
    
    public Ambiente readAmbiente(){
        return a;
    }

    @Override
    public synchronized void serialEvent(SerialPortEvent spe) {
        
        if(spe.getEventType() == SerialPortEvent.DATA_AVAILABLE){
            try {
                
                int available = input.available();//                                
				byte chunk[] = new byte[available];//                                
				//input.read(chunk, 0, available);//
//                                String inputLine = new String(chunk);
                                String inputLine = reader.readLine();
                                
                                System.out.println("reader: "+inputLine);                
                               // System.out.println(inputLine.toUpperCase());
                                Ambiente ambiente = trataResposta(inputLine);
                                
                                if(ambiente != null){
                                    genericDAO.save(ambiente);
                                    System.out.println("ambiente atual foi salvo!!");
                                }
                                else{
                                    System.out.println("Nenhuma informação foi salva!!");
                                }
                                
            } catch (Exception ex) {
                try {
                    Thread.sleep(200);
                } catch (Exception e) {                    
                    System.out.println("Error: "+ex.getMessage());
                }
            }
        }
    }

    private Ambiente trataResposta(String inputLine) {
        
        System.out.println(inputLine.length());
        
            if(inputLine.length() < 18){
                saida = inputLine;
                humidity = "";
                temperature = "";
                luminosity = "";
                
                humidity = saida.substring(saida.indexOf("U")+2,saida.indexOf("T")-1);
                temperature = saida.substring(saida.indexOf("T")+2,saida.lastIndexOf(".")+2);
                
                System.out.println("humidity: "+ humidity +" - temperature: "+ temperature);
                
               // luminosity = saida.substring(saida.indexOf("L")+2, saida.lastIndexOf(".")+2);
                java.sql.Date currentDate = new java.sql.Date(new Date().getTime());
                
                Ambiente ambiente = new Ambiente();
                ambiente.setRecordDate(currentDate);
                ambiente.setHumidity(Float.parseFloat(humidity));
                ambiente.setTemperature(Float.parseFloat(temperature));
                //a.setLuminosity(Float.parseFloat(luminosity));
                
                return ambiente;
            }
            return null;
    }
      
}
