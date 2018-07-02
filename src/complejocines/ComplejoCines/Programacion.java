/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocines.ComplejoCines;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Guada
 */
public class Programacion {
   
    private List<Funcion> funciones;
    private Date fechaCreacion;
    private Date fechaInicio;
    private Date fechaFin;

    public Programacion(List<Funcion> funciones, Date fechaCreacion, Date fechaInicio, Date fechaFin) {
        this.funciones = funciones;
        this.fechaCreacion = fechaCreacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

   
    
    
    
}
