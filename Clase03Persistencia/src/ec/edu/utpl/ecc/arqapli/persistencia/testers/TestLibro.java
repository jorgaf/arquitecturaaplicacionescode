/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.testers;

import ec.edu.utpl.ecc.arqapli.persistencia.entities.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jorgaf
 */
public class TestLibro {
    public static void main(String[] args) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("Clase03PersistenciaPU");
        EntityManager em = emf.createEntityManager();
        
        Libro l = new Libro("Patrónes de Diseño", "2345678912301");
        
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        
        em.close();
    }
}
