/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapl.dclases;

import java.util.Objects;

/**
 *
 * @author jorgaf
 */
public class Telefono {
    private String nro;
    private String operador;
    private char tipo;

    public Telefono() {
    }

    public Telefono(String nro, String operador, char tipo) {
        this.nro = nro;
        this.operador = operador;
        this.tipo = tipo;
    }    

    /**
     * @return the nro
     */
    public String getNro() {
        return nro;
    }

    /**
     * @param nro the nro to set
     */
    public void setNro(String nro) {
        this.nro = nro;
    }

    /**
     * @return the operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(String operador) {
        this.operador = operador;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (!Objects.equals(this.nro, other.nro)) {
            return false;
        }
        return true;
    }
}
