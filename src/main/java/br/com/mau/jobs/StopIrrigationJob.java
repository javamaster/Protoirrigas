/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.jobs;

import br.com.mau.command.ControllerInvoker;
import br.com.mau.command.impl.StopSystemCommand;
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
        invoker = new ControllerInvoker();
        invoker.storeAndExecuteCommand(new StopSystemCommand());
    }
    
}
