/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.arqapl.entities.views;

import java.math.BigDecimal;

/**
 *
 * @author jorgaf
 */
public class CostoEnvio {
    private String name;
    private BigDecimal totalCost;

    public CostoEnvio(String name, BigDecimal totalCost) {
        this.name = name;
        this.totalCost = totalCost;
    }        

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the totalCost
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
    
    
    
}
