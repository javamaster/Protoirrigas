/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.command.impl;

import br.com.mau.command.ArduinoReceiver;
import br.com.mau.command.Command;

/**
 *
 * @author Mauricio
 */
public class StopSystemCommand implements Command{

    private ArduinoReceiver receiver = new ArduinoReceiver();
            
    @Override
    public void execute() {       
        boolean result = receiver.stopSystem();
        if (!result) {
            System.out.println("Não foi possivel se conectar");
        }
    }    
}
