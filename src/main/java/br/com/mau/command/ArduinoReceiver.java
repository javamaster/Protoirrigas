package br.com.mau.command;
import br.com.mau.communication.BluetoothCommunicator;
import br.com.mau.model.Ambiente;

/**
 *
 * @author Mauricio
 */
public class ArduinoReceiver {
    
    private static boolean statusSystem = false;
    private BluetoothCommunicator communicator;
    public static final Integer ON = 1, OFF = 0, READ = 2;
    

    public ArduinoReceiver() {
        communicator = new BluetoothCommunicator();
        communicator.initialize();
    }
    
    
    public boolean startSystem(){
        if(statusSystem == false){
            boolean connection = communicator.connect();
            if(connection){                
                communicator.write(ArduinoReceiver.ON);
                System.out.println("Comando enviado: "+ArduinoReceiver.ON);
                statusSystem = true;
                return true;
            }
            else{
                System.out.println("Não foi possivel se connectar!!");
                return false;
            }
        }
        return false;
    }
    
    public boolean stopSystem(){
        if(statusSystem){
                communicator.write(ArduinoReceiver.OFF);
                communicator.close();
                System.out.println("Comando enviado: "+ArduinoReceiver.OFF);
                return true;         
        }            
        return false;
    }
    
    public Ambiente readData(){
        if(statusSystem){
           communicator.write(ArduinoReceiver.READ);
           Ambiente a = communicator.readAmbiente();
           return a;
        }
        return null;
    }
    
    public void close(){
        communicator.close();
    }
    
}
