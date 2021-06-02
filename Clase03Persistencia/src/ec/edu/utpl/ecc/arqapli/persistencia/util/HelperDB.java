/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jorgaf
 */
public final class HelperDB {
    private static EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("Clase03PersistenciaPU");
    private static EntityManager em = null;
    
    
    public static EntityManager getEntityManager(){
        if(em == null){
            em = emf.createEntityManager();
        }
        
        return em;
    }
}
