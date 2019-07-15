/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author Estudiante
 */
public class Wallup implements Tickets{

    private double precio;
    private int numero;
    
    @Override
    public double getPrecio() {
      return this.precio;
    }

    public Wallup(int numero) {
      
        this.numero = numero;
        this.precio=50.00;
    }

    @Override
    public int getNumero() {
       return this.numero;
    }
    
}
