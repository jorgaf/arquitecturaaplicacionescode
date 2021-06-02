/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapl.testers;

import ec.edu.utpl.ecc.arqapl.entities.Cliente;
import ec.edu.utpl.ecc.arqapl.entities.Direccion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jorgaf
 */
public class Test1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clases04RelacionesPU");
        EntityManager em = emf.createEntityManager();
        
        Cliente c1 = new Cliente();
        Direccion d1 = new Direccion();
        
        c1.setLastName("Corbacho");
        c1.setFirstName("José");
        
        
        d1.setCity("Loja");
        d1.setCountry("Ecuador");
        d1.setStreet1("Calle Paris");
        
        c1.setDireccion(d1);
        
        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();
        
        
        em.close();
    }
    
}
