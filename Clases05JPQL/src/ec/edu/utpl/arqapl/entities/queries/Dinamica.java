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
import javax.persistence.Query;

/**
 *
 * @author jorgaf
 */
public class Dinamica {

    public static void main(String[] args) {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("Clases05JPQLPU");
        EntityManager em = emf.createEntityManager();

        Query qry;
        List<Customer> results;

        qry = em.createQuery("SELECT c FROM Customer c");
        results = qry.getResultList();

        for (Customer c : results) {
            System.out.printf("%d %s %s\n",
                    c.getCustomerId(),
                    c.getName(),
                    c.getEmail());
        }

        em.close();
    }
}
