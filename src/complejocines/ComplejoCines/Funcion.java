/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocines.ComplejoCines;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Guada
 */
public class Funcion {
    
    private Date diaDeSemana;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private Sala sala;
    private Pelicula pelicula;
    private List<Entrada> entradas;
    private String tipo;

    
    
    public Funcion(Date diaDeSemana, LocalTime horaInicio, LocalTime horaFinal, Sala sala, Pelicula pelicula, List<Entrada> entradas, String tipo) {
        this.diaDeSemana = diaDeSemana;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.sala = sala;
        this.pelicula = pelicula;
        this.entradas = entradas;
        this.tipo = tipo;
    }

    public Date getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(Date diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int capacidadSala(){
        return this.sala.getCantidadDeButacas();
    }
    
    public int butacasDisponibles(){
        return this.capacidadSala() - this.entradas.size();
    }
    
    public int cantidadEntradasVendidas(){
        return this.entradas.size();
    }

    public void comenzoFuncion(){
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        int horaActualHora = horaActual.getHour();
        int minutosActual = horaActual.getMinute();
        int horaInicioFuncion = this.horaInicio.getHour();
        int minutosInicioFuncion = this.horaInicio.getMinute();
        int duracionHora = horaActualHora - horaInicioFuncion;
        System.out.println(duracionHora);
    }
    
}
