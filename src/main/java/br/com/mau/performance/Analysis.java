/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.performance;

import com.jhlabs.image.LightFilter;
import java.util.ArrayList;
import br.com.mau.model.Ambiente;

/**
 *
 * @author Mauricio
 */
public class Analysis {
    
    public static void main(String[] args) {
        
        ArrayList<Ambiente> ambientes = inicializar();
        String temperaturas = null;
        
        //Iniciando o contador de tempo e memoria
        final long tempoInicial = System.nanoTime();
        final long memoriaInicial = Runtime.getRuntime().freeMemory();
        
        //Algoritmo que sera testado
        for(int i =0; i <ambientes.size();i++){
            String s = String.valueOf(ambientes.get(i).getTemperature());
            String tempers = i+"-"+s+"testes"; 
        }
              
        
        //Finalizando o contador de tempo e memoria
        final long tempoFinal = System.nanoTime();
        final long memoriaFinal = Runtime.getRuntime().freeMemory();
        
        
        // Calculo de tempo e memoria utilizada
        final long tempoTotal = tempoInicial - tempoFinal;
        final long memoriaTotal = memoriaInicial - memoriaFinal;
        
        System.out.println("Tempo de processamento:" + tempoTotal);
        System.out.println("Memoria utilizada:" + Runtime.getRuntime().freeMemory());
        
    }

    private static ArrayList<Ambiente> inicializar() {
        
        ArrayList<Ambiente> ambientes = new ArrayList();
        
        for(int i =0; i<100; i++){
            
            Ambiente a = new Ambiente();
            a.setHumidity(10.0f);
            a.setTemperature(25);
            a.setLuminosity(300);
            
            ambientes.add(a);        
            
        }
        return ambientes;
    }
    
}
