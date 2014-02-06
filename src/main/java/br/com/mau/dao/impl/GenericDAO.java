/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Mauricio
 */
public class GenericDAO<PK, T> {
    
    private EntityManager em;
    private Class classFind;

    public GenericDAO(EntityManager manager, Class c) {
        this.em = manager;
        this.classFind = c;
    }
    
    
    public T getByID(PK pk){
        return (T) this.em.find(classFind, pk);
    }
   
    public void save(T entity){
        try {
            this.em.getTransaction().begin();
            this.em.persist(entity);       
            this.em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        
    }
    
    public void update(T entity){
        this.em.getTransaction().begin();
        this.em.merge(entity);
        this.em.getTransaction().commit();
    }
    
    public void delete(PK pk){
        this.em.getTransaction().begin();
        T entity = (T) this.em.find(classFind,pk );
        this.em.remove(entity);
        this.em.getTransaction().commit();
    }
    
    public List<T> findAll(){
        return this.em.createQuery("Select e From " + classFind.getName()+ " e").getResultList();
    }
    
    public List<T> findByName(String name){
        return this.em.createQuery("Select e From " + classFind.getName()+ " e Where e.nome like '%"+name+"%'").getResultList();
    }
    
    public T authenticate(String login, String senha){
       Query q =  em.createQuery("Select e from "+classFind.getName()+ " e where e.login = :login and e.senha = :senha");
       q.setParameter("login", login);
       q.setParameter("senha", senha);
       
       return (T) q.getSingleResult();             
    }
    
     public Long getLastIdRecord(){
        return (Long) this.em.createQuery("Select max(id) from "+classFind.getName()).getSingleResult();        
    }
     
    public void close(){
        this.em.close();
    }
    
}
