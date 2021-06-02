/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.testers;

import ec.edu.utpl.ecc.arqapli.persistencia.entities.Libro;
import ec.edu.utpl.ecc.arqapli.persistencia.util.FacadeLibro;

/**
 *
 * @author jorgaf
 */
public class TestLibroFacade {
    public static void main(String[] args) {
        FacadeLibro fLibro = new FacadeLibro();
//        Libro l1 = new Libro("Mi Libro", "01");
//        System.out.printf("Antes de grabar l1(id): %d\n", l1.getId());
//        l1 = fLibro.create(l1);
//        System.out.printf("Después de l1(id): %d\n", l1.getId());
//        Libro l;
//        
//        l = fLibro.read(1L);
//        System.out.printf("Título: %s\n", l.getTitulo());
        
        Libro l = fLibro.updateTitle("Platero y Yo 2", 2L);
        System.out.printf("Título: %s\n", l.getTitulo());
        
        fLibro.close();
    }
    
}
