/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototirrigas;

import br.com.mau.communication.BluetoothCommunicator;
import br.com.mau.communication.Communicator;
import br.com.mau.dao.impl.GenericDAO;
import br.com.mau.model.Ambiente;
import br.com.mau.model.Cultura;
import br.com.mau.model.Setor;
import br.com.mau.model.Usuario;
import br.com.mau.util.JPAUtil;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mauricio
 */
public class Teste {
    
    public static void main(String[] args) {
        
        
//        EntityManagerFactory fac = Persistence.createEntityManagerFactory("irrigas_PU");
//        EntityManager manager = fac.createEntityManager();
//        manager.getTransaction().begin();
        //manager.clear();
        EntityManager manager1 = JPAUtil.createEntityManager();
         
//        JPAUtil.beginTransaction();
        GenericDAO dao = new GenericDAO(manager1, Cultura.class);
//        Cultura cultura = new Cultura();
//        cultura.setNome("Alface");
//        cultura.setCategoria("Hortaliça");
//        cultura.setDescricao("Qualidade A");
////        
//        Cultura c = (Cultura)dao.findByName("Feijão").get(0);
//        System.out.println("Cultura recuperada: "+c);
//        
//        Setor setor = new Setor();
//        setor.setComprimento(12.00);
//        setor.setLargura(5);
//        setor.setDescricao("Cultivo de cereais");
//        setor.setNome("MauMau");
//        setor.setCultura(c);
////        
//        Ambiente a = new Ambiente();
//        a.setLuminosity(300f);
//        a.setRecordDate(new Timestamp(new Date().getTime()));
//        a.setTemperature(20f);
//        
//        
        
//        dao.save(setor);
//        
//        ArrayList<Cultura> lista = (ArrayList<Cultura>) dao.findAll();
//        
//        for (Cultura e : lista) {
//            System.out.println("Cultura: "+e.getNome());
//        }
        
        Usuario user = (Usuario) dao.authenticate("mauricio", "85b46260dceeabc219d3ea85e8beb8f8");
        
        System.out.println(user);
//        //Busca por um setor especifico
//        Setor s = (Setor) dao.getByID(62L);
//        
//        // Adiciona o ambiente no setor
//        s.getAmbientes().add(a);
//        s.setNome("Leguminosas");
//  
////       manager.persist(setor);        
//        //Atualiza o setor
//        
//          dao.update(s);
////        manager.getTransaction().commit();
////        
////      
//        
//       
//         
//                
//        for (Iterator it = dao.findAll().iterator(); it.hasNext();) {
//            Setor setorx = (Setor) it.next();
//            System.out.println(setorx.toString());
//        }
//        
//        //dao.delete(s);
//        JPAUtil.commit();
//        
//        

        
//        ControllerInvoker invoker = new ControllerInvoker();
//        
//        Command cmd = new StartSystemCommand();
//        
//        invoker.storeAndExecuteCommand(cmd);
        
//        Communicator comm = new BluetoothCommunicator();
//        comm.initialize();
//        comm.write(0);
//        
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        comm.write(2);
        
    }
}
