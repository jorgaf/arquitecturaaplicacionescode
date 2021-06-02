/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.ecct.arap.rest.util;

import ec.edu.utpl.ecct.arap.rest.entities.Email;
import ec.edu.utpl.ecct.arap.rest.entities.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgaf
 */
public class DataBase {
private final List<Estudiante> db;
    
    public DataBase() {
        Estudiante est;
        
        db = new ArrayList<>();
        
        est = new Estudiante("1101332621", "Brito", "Alam");        
        est.addCorreo(new Email("123@utpl.edu.ec", "Universidad"));        
        db.add(est);
        
        est = new Estudiante("0901338621", "Caicedo", "Antonio");
        est.addCorreo(new Email("acaicedo@gmail.com", "Trabajo"));
        est.addCorreo(new Email("acaicedo123@hotmail.com", "Personal"));
        db.add(est);
        
        est = new Estudiante("1701332629", "Montero", "Christian");
        est.addCorreo(new Email("cmontero@coursera.com", "Personal"));
        est.addCorreo(new Email("christian.montero@ecuafutbol.org", "Trabajo"));
        est.addCorreo(new Email("monteroc@gmail.com", "Empresa"));
        db.add(est);
        
        est = new Estudiante("0721362633", "Quiñones", "Edmundo");        
        est.addCorreo(new Email("equinonez@utpl.edu.ec", "Universidad"));        
        db.add(est);
       
    }
    
    public List<Estudiante> getAllEstudiantes(){
        return db;
    }
    
    public Estudiante getEstudiante(String cedula){
        for(Estudiante e : db){
            if(e.getCedula().equals(cedula)){
                return e;
            }
        }
        
        return null;
    }        
    
}
