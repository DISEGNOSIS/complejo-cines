/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocines.ComplejoCines;

import java.util.Date;

/**
 *
 * @author Guada
 */
public class Entrada {
    
    private int numeroVenta;
    private Date fechaVenta;
    private Funcion funcion;
    private String tipo;
    private int precio;

    public Entrada(int numeroVenta, Date fechaVenta, Funcion funcion, String tipo, int precio) {
        this.numeroVenta = numeroVenta;
        this.fechaVenta = fechaVenta;
        this.funcion = funcion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
    
    
    
}
