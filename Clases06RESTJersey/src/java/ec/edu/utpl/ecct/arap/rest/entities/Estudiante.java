/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.ecct.arap.rest.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorgaf
 */
@XmlRootElement
public class Estudiante {
    private String cedula;
    private String apellidos;
    private String nombres;
    private List<Email> correos;

    public Estudiante() {
        correos = new ArrayList<>();
    }

    public Estudiante(String cedula, String apellidos, String nombres) {
        this();
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    
    

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public void addCorreo(Email e){
        this.correos.add(e);
    }

    public List<Email> getCorreos() {
        return correos;
    }

    public void setCorreos(List<Email> correos) {
        this.correos = correos;
    }
    
    
}
