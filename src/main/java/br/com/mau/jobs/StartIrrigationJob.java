/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import br.com.mau.command.*;
import br.com.mau.command.impl.*;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class StartIrrigationJob implements Job{
    
    private ControllerInvoker invoker;

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        System.out.println("A irrigação foi iniciada!!");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        JOptionPane.showMessageDialog(null, "Irrigação Iniciada!!",""+f.format(jec.getFireTime()),JOptionPane.INFORMATION_MESSAGE);
        invoker = new ControllerInvoker();
        invoker.storeAndExecuteCommand(new StartSystemCommand());
    }
    
}
