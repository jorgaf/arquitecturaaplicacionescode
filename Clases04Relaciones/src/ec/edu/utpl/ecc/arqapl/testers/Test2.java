/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapl.testers;

import ec.edu.utpl.ecc.arqapl.entities.Orden;
import ec.edu.utpl.ecc.arqapl.entities.OrderLine;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jorgaf
 */
public class Test2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Clases04RelacionesPU");
        EntityManager em = emf.createEntityManager();
        
        Orden o = new Orden();
        List<OrderLine> orderLines = new ArrayList<>();
        
        orderLines.add(new OrderLine("Marcador", 0.34, 3));
        orderLines.add(new OrderLine("Borrador", 0.50, 1));
        orderLines.add(new OrderLine("Clip", 0.04, 25));
        
        o.setOrderLines(orderLines);
        
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        
        em.close();
        
    }
    
}
