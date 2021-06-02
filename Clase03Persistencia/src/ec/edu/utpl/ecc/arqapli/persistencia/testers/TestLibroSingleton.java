/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.testers;

import ec.edu.utpl.ecc.arqapli.persistencia.entities.Libro;
import ec.edu.utpl.ecc.arqapli.persistencia.util.HelperDB;


/**
 *
 * @author jorgaf
 */
public class TestLibroSingleton {
    public static void main(String[] args) {
        Libro l = new Libro("Título", "123");
        HelperDB.getEntityManager().getTransaction().begin();
        HelperDB.getEntityManager().persist(l);
        HelperDB.getEntityManager().getTransaction().commit();
        HelperDB.getEntityManager().close();
    }
    
}
