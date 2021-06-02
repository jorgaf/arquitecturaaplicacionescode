/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.arqapl.entities.queries;

import ec.edu.utpl.arqapl.entities.views.CostoEnvio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author jorgaf
 */
public class QryCostoEnvio {
    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("Clases05JPQLPU");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<CostoEnvio> qry;
        CostoEnvio cost;
        
        qry = em.createNamedQuery("PurchaseOrder.getCostByCustomerId", CostoEnvio.class);
        qry.setParameter("customerId", 1);        
        cost = qry.getSingleResult();
        
        
        System.out.printf("%s %f\n",
                cost.getName(),
                cost.getTotalCost());
        
        em.close();
        
    }
    
}
