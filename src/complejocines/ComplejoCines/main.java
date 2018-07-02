/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocines.ComplejoCines;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guada
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        List<String> actores = new ArrayList<>();
        actores.add("Richard Ayoade");
        actores.add("Chris O'Dowd");
        
        Pelicula theITCrowd = new Pelicula("The IT Crowd", "ATP", 40, "Yo qué sé...", actores, "Humor", 2005, "Inglaterra");
        
       
        
        
    }
    
}
