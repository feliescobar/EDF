/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Date;
import java.sql.*;

/**
 *
 * @author Felipe7
 */
public class Jugador {

    private String direccion;
    private String estado;
    private Date fecnac;
    private String nombre;
    private String rut;
    private int telefono;
    
    public Jugador(String direccion,String estado,Date fecnac,String nombre,String rut,int telefono){
        this.direccion = direccion;
        this.estado = estado;
        this.fecnac = fecnac;
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
    }   
    
    public void agregarJugador(){
        
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
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the fecnac
     */
    public Date getFecnac() {
        return fecnac;
    }

    /**
     * @param fecnac the fecnac to set
     */
    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
