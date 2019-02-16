/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaMVC.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sistemaMVC.model.domain.Cliente;

/**
 *
 * @author carlo
 */
public class ClienteDao {
    
    private EntityManager em;
    
    public ClienteDao () {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("SistemaMVCPU");
        em = emf.createEntityManager();
    }
    
    public void salvar(Cliente cliente){
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
    }
    
    
    
    
    
    
    
    
}
