/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.ecc.arqapli.persistencia.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jorgaf
 */
@Entity
public class Libro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private double precio;
    private String descripcion;
    private String isbn;
    private int nroPaginas;
    private boolean esIlustrado;

    public Libro() {
    }

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
        
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the nroPaginas
     */
    public int getNroPaginas() {
        return nroPaginas;
    }

    /**
     * @param nroPaginas the nroPaginas to set
     */
    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    /**
     * @return the esIlustrado
     */
    public boolean isEsIlustrado() {
        return esIlustrado;
    }

    /**
     * @param esIlustrado the esIlustrado to set
     */
    public void setEsIlustrado(boolean esIlustrado) {
        this.esIlustrado = esIlustrado;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    
    
    
}
