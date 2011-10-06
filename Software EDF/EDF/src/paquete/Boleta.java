/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Date;

/**
 *
 * @author Felipe7
 */
public class Boleta {
    private int numBoleta;
    private int numMat;
    private String mesPago;
    private Date fecBoleta;

    /**
     * @return the numBoleta
     */
    public int getNumBoleta() {
        return numBoleta;
    }

    /**
     * @param numBoleta the numBoleta to set
     */
    public void setNumBoleta(int numBoleta) {
        this.numBoleta = numBoleta;
    }

    /**
     * @return the numMat
     */
    public int getNumMat() {
        return numMat;
    }

    /**
     * @param numMat the numMat to set
     */
    public void setNumMat(int numMat) {
        this.numMat = numMat;
    }

    /**
     * @return the mesPago
     */
    public String getMesPago() {
        return mesPago;
    }

    /**
     * @param mesPago the mesPago to set
     */
    public void setMesPago(String mesPago) {
        this.mesPago = mesPago;
    }

    /**
     * @return the fecBoleta
     */
    public Date getFecBoleta() {
        return fecBoleta;
    }

    /**
     * @param fecBoleta the fecBoleta to set
     */
    public void setFecBoleta(Date fecBoleta) {
        this.fecBoleta = fecBoleta;
    }
    
}
