/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.entidades.test;

import ec.edu.utpl.ecc.arqapli.persistencia.entidades.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jorgaf
 */
public class DemoGrabar {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Demo001PU");
        EntityManager em = emf.createEntityManager();
        
        Libro l1 = new Libro();
        l1.setTitulo("El señor de los añillos");
        l1.setDescripcion("Basado en la historia de un sobreviviente de la segunda guerra mundial");
        l1.setPrecio(70.5);
        l1.setEsIlustrado(true);
        
        em.getTransaction().begin();
        em.persist(l1);
        em.getTransaction().commit();
        
        em.close();
    }
    
}
