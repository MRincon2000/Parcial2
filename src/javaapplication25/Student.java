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
public class Student extends Advanced {

    private int numeroCarnet;
    private String institucion;
public double getPrecio(){
    return this.precio;
    
}   

    public Student(int numero,boolean r, int numeroC, String institucion) {
        super(numero,r);
       if(r==true){
            
        
        this.precio= 15.00;
    }
        if(r==false){
            this.precio=20.00;
        }
        
        
       
        this.numeroCarnet=numeroC;
        this.institucion=institucion;
    }
    @Override
    public int getNumero() {
       return this.numero;
    }
}
