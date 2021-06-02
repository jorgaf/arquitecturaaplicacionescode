package ec.edu.utpl.ecct.arap.rest.entities;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgaf
 */
@XmlRootElement
public class Email {
    private String direccion;
    private String tipo;

    public Email() {
    }

    public Email(String direccion, String tipo) {
        this.direccion = direccion;
        this.tipo = tipo;
    }
        
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
