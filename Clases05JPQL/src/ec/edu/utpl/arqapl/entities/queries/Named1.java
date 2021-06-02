/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.arqapl.entities.queries;

import ec.edu.utpl.arqapl.entities.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author jorgaf
 */
public class Named1 {
    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("Clases05JPQLPU");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Customer> qry;
        List<Customer> results;
        
        qry = em.createNamedQuery("Customer.findAll", Customer.class);
        results = qry.getResultList();
        
        for(Customer c : results){
            System.out.printf("%d %s %s\n",
                    c.getCustomerId(),
                    c.getName(),
                    c.getEmail());
        }
        
        Customer cliente;
        qry = em.createNamedQuery("Customer.findByCustomerId", Customer.class);
        qry.setParameter("customerId", 1);
        cliente = qry.getSingleResult();
        System.out.printf("%d %s %s\n",
                    cliente.getCustomerId(),
                    cliente.getName(),
                    cliente.getEmail());
        
        em.close();
    }
    
}
