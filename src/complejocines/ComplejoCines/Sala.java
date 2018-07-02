/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocines.ComplejoCines;

/**
 *
 * @author Guada
 */
public class Sala {
    
    private int numero;
    private int cantidadDeButacas;

    public Sala(int numero, int cantidadDeButacas, boolean enUso) {
        this.numero = numero;
        this.cantidadDeButacas = cantidadDeButacas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadDeButacas() {
        return cantidadDeButacas;
    }

    public void setCantidadDeButacas(int cantidadDeButacas) {
        this.cantidadDeButacas = cantidadDeButacas;
    }

    
    
    
    
    
    
    
}
