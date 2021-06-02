/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapl.dclases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgaf
 */
public class Estudiante {

    private String cedula;
    private String apellidos;
    private String nombres;
    private List<Telefono> telefonos;

    private Estudiante() {
        telefonos = new ArrayList<>();
    }

    public Estudiante(String cedula, String apellidos, String nombres) {
        this();
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public Estudiante(String cedula, String apellidos) {
        this();
        this.cedula = cedula;
        this.apellidos = apellidos;
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

    /**
     * @return the telefonos
     */
    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void addTelefono(Telefono fono) {
//        boolean existe = false;
//        
//        for (Telefono f : telefonos) {
//            if (f.getNro().equals(fono.getNro())) {
//                existe = true;
//            }
//        }
//        if (!existe) { //exist == false
//            telefonos.add(fono);
//        }
        if(!telefonos.contains(fono)){
            telefonos.add(fono);
        }
    }
}
