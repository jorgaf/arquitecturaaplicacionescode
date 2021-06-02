/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.util;

import ec.edu.utpl.ecc.arqapli.persistencia.entities.Libro;

/**
 *
 * @author jorgaf
 */
public class FacadeLibro {
    public Libro create(Libro l){
        HelperDB.getEntityManager().getTransaction().begin();
        HelperDB.getEntityManager().persist(l);
        HelperDB.getEntityManager().getTransaction().commit();
        
        return l;
    }
    
    public Libro read(Long id){
        return HelperDB.getEntityManager().find(Libro.class, id);
    }
    
    public Libro updateTitle(String title, Long id){        
        Libro l = read(id);
        
        l.setTitulo(title);
        HelperDB.getEntityManager().getTransaction().begin();
        HelperDB.getEntityManager().merge(l);
        //HelperDB.getEntityManager().flush();
        HelperDB.getEntityManager().getTransaction().commit();
        return l;
    }
    
    public void delete(Long id){
        Libro l = read(id);
        HelperDB.getEntityManager().remove(l);
    }  
    
    public void close(){
        HelperDB.getEntityManager().close();
    }
}