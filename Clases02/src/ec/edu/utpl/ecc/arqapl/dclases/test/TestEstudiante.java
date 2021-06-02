/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapl.dclases.test;

import ec.edu.utpl.ecc.arqapl.dclases.Estudiante;
import ec.edu.utpl.ecc.arqapl.dclases.Telefono;
import java.util.List;


/**
 *
 * @author jorgaf
 */
public class TestEstudiante {

    public static void main(String[] args) {
        Estudiante est = new Estudiante("1100333511", "Martínez", "Fidel");
        Telefono fono1 = new Telefono("2570275", "CNT", 'N');
        est.addTelefono(fono1);
        est.addTelefono(fono1);
        est.addTelefono(new Telefono("0997654321", "Movistar", 'M'));
        System.out.printf("%s %s\n",
                est.getApellidos(),
                est.getNombres());
        for (Telefono fono : est.getTelefonos()) {
            System.out.printf("\tNro: %s (%c)\n",
                    fono.getNro(),
                    fono.getTipo());
        }
        //printFonoByType('N', est.getTelefonos());
        System.out.printf("%d teléfono de tipo M\n",
                countFonoByType('M', est.getTelefonos()));
        

        Estudiante est1 = new Estudiante("11000222200", "Rueda", "Reinaldo");

    }

    public static void printFonoByType(char tipo, List<Telefono> fonos) {
        for (Telefono fono : fonos) {
            if (fono.getTipo() == tipo) {
                System.out.printf("\tNro: %s (%c)\n",
                        fono.getNro(),
                        fono.getTipo());
            }
        }
    }
    
    public static int countFonoByType(char tipo, List<Telefono> fonos) {
        int count = 0;
        for (Telefono fono : fonos) {
            if (fono.getTipo() == tipo) {
                count ++;
            }
        }
        return count;
    }
}
