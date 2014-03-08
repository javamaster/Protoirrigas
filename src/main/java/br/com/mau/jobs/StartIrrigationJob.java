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

/**
 *
 * @author Mauricio
 */
public class StartIrrigationJob implements Job{
    
    private ControllerInvoker invoker;

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        System.out.println("A irrigação foi iniciada!!");
        invoker = new ControllerInvoker();
        invoker.storeAndExecuteCommand(new StartSystemCommand());
    }
    
}
