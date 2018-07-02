/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocines.ComplejoCines;

import java.util.List;

/**
 *
 * @author Guada
 */
public class Pelicula {
  
    private String titulo;
    private String calificacion;
    private int duracion;
    private String director;
    private List <String> actores;
    private String genero;
    private int año;
    private String paisDeOrigen;
    
    public Pelicula(String titulo, String calificacion, int duracion, String director, List <String> actores, String genero, int año, String paisDeOrigen){
        this.titulo = titulo;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
        this.año = año;
        this.paisDeOrigen = paisDeOrigen;
    }
    
    public void duracion(int a){
        this.duracion = a;
    }
    
    public void calificacion(String a){
        this.calificacion = a;
    }
    
}
