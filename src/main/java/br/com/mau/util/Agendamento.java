/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.util;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import br.com.mau.model.Agenda;
import br.com.mau.jobs.*;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobKey;
import org.quartz.TriggerBuilder;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdScheduler;

/**
 *
 * @author Mauricio
 */
public class Agendamento extends Thread{
    
    private Trigger trigger;
    private Job job;
    private SchedulerFactory factory;
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Agendamento.class);
    private Scheduler scheduler = null;

    public Agendamento() {
        try {
            this.scheduler = StdSchedulerFactory.getDefaultScheduler();
            //scheduler.start();
        } catch (SchedulerException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Scheduler getEscalonador(){
        return scheduler;
    }
    
    public void escalonarAgenda(Agenda agenda){
        Scheduler escalonador = getEscalonador();
        
        try {
            //Tarefa para iniciar o processo de irrigação
            JobDetailImpl jobInicio = new JobDetailImpl();
            jobInicio.setGroup(agenda.getNome().concat("Inicio"));
            jobInicio.setJobClass(StartIrrigationJob.class);
            jobInicio.setKey(JobKey.jobKey(agenda.getNome().concat("Inicio")));
            
            //Tarefa para finalizar o processo de irrigação
            JobDetailImpl jobTermino = new JobDetailImpl();
            jobTermino.setGroup(agenda.getNome().concat("Termino"));
            jobTermino.setJobClass(StopIrrigationJob.class);
            jobTermino.setKey(JobKey.jobKey(agenda.getNome().concat("Termino")));
            
            Calendar calendarInicio = Calendar.getInstance();
            calendarInicio.setTime(agenda.getHora_inicio());      
            
            Calendar calendarTermino = Calendar.getInstance();
            calendarTermino.setTime(agenda.getHora_fim());            
            
            Trigger inicioTrigger = TriggerBuilder.newTrigger()
                    .withIdentity("inicioTrigger", agenda.getNome().concat("Inicio"))
                    .withSchedule(CronScheduleBuilder.cronSchedule(calendarInicio.get(Calendar.SECOND) +" "+calendarInicio.get(Calendar.MINUTE)+" "+calendarInicio.get(Calendar.HOUR)+" * * ?"))
                    .build();
            
            Trigger terminoTrigger = TriggerBuilder.newTrigger()
                    .withIdentity("terminoTrigger",agenda.getNome().concat("Termino"))
                    .withSchedule(CronScheduleBuilder.cronSchedule(calendarTermino.get(Calendar.SECOND) +" "+calendarTermino.get(Calendar.MINUTE)+" "+calendarTermino.get(Calendar.HOUR)+" * * ?"))
                    .build();
           
            
            escalonador.scheduleJob(jobInicio, inicioTrigger);
            escalonador.scheduleJob(jobTermino, terminoTrigger);
           
            
            log.info("Escalonador iniciou o processo!!");
        
//    
 
        } catch (SchedulerException ex) {
            ex.printStackTrace();
           log.error(ex.getMessage());          
        }
    }
     public void escalonarAgenda2(Agenda agenda){        
        
        try {
            Scheduler escalonador = StdSchedulerFactory.getDefaultScheduler();
            //Tarefa para iniciar o processo de irrigação
            JobDetailImpl jobInicio = new JobDetailImpl();
            jobInicio.setGroup(agenda.getNome().concat("Inicio"));
            jobInicio.setJobClass(StartIrrigationJob.class);
            jobInicio.setKey(JobKey.jobKey(agenda.getNome().concat("Inicio")));
            
            //Tarefa para finalizar o processo de irrigação
            JobDetailImpl jobTermino = new JobDetailImpl();
            jobTermino.setGroup(agenda.getNome().concat("Termino"));
            jobTermino.setJobClass(StopIrrigationJob.class);
            jobTermino.setKey(JobKey.jobKey(agenda.getNome().concat("Termino")));
            
            Calendar calendarInicio = Calendar.getInstance();
            calendarInicio.setTime(agenda.getHora_inicio());      
            
            Calendar calendarTermino = Calendar.getInstance();
            calendarTermino.setTime(agenda.getHora_fim());            
            
           
            Trigger inicioTrigger = TriggerBuilder.newTrigger()
                    .withIdentity("inicioTrigger", agenda.getNome().concat("Inicio"))
                    .withSchedule(CronScheduleBuilder.cronSchedule(calendarInicio.get(Calendar.SECOND) +" "+calendarInicio.get(Calendar.MINUTE)+" "+calendarInicio.get(Calendar.HOUR)+" * * ?"))
                    .build();
            
            Trigger terminoTrigger = TriggerBuilder.newTrigger()
                    .withIdentity("terminoTrigger",agenda.getNome().concat("Termino"))
                    .withSchedule(CronScheduleBuilder.cronSchedule(calendarTermino.get(Calendar.SECOND) 
                     +" "+calendarTermino.get(Calendar.MINUTE)
                     +" "+calendarTermino.get(Calendar.HOUR)+" * * ?"))
                    .build();
            
             escalonador.scheduleJob(jobInicio, inicioTrigger);
             escalonador.scheduleJob(jobTermino, terminoTrigger);
            
            log.debug("Escalonador iniciou o processo!!");
        
//            Thread.sleep(60L * 1000L); 
//            
//            escalonador.shutdown(true);
 
        } catch (SchedulerException ex) {
           log.error(ex.getMessage());
           ex.printStackTrace();
        }
    }
    public List getJobGroupNames(){
        List groups = null;
        
        try {
            groups = getEscalonador().getJobGroupNames();
        } catch (SchedulerException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return groups;
    }
    
    
    
    
}
