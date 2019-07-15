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
public class Advanced implements Tickets {
protected int numero;
protected double precio;
    @Override
    public double getPrecio() {
        return this.precio;
    }

    public Advanced(int numero, boolean r) {
        this.numero = numero;
        if(r==true){
            
        
        this.precio= 30.00;
    }
        if(r==false){
            this.precio=40.00;
        }
    }
        @Override
    public int getNumero() {
       return this.numero;
    }
}
