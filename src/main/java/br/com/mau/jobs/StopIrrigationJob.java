/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.jobs;

import br.com.mau.command.ControllerInvoker;
import br.com.mau.command.impl.StopSystemCommand;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author Mauricio
 */
public class StopIrrigationJob implements Job{

    private ControllerInvoker invoker;
    
    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        System.out.println("A irrigação foi encerrada!!");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        JOptionPane.showMessageDialog(null, "Irrigação Encerrada!!",""+f.format(jec.getFireTime()),JOptionPane.INFORMATION_MESSAGE);
        invoker = new ControllerInvoker();
        invoker.storeAndExecuteCommand(new StopSystemCommand());
    }
    
}
