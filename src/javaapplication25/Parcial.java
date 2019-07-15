/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Parcial {

    
    private ArrayList <Tickets>tiquetes;

    public Parcial() {
    
    this.tiquetes= new ArrayList<>();
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
  
      Parcial k= new Parcial();  
        
        try{
            k.nuevoTiquete(12345);
           
        }
        catch(TicketNumberException t){
            System.out.println(t.getMessage());
        }
                try{
        k.nuevoTiquete(12346);
           
        }
        catch(TicketNumberException t){
            System.out.println(t.getMessage());
        }
              try{
        k.nuevoTiquete(5678, false);
           
        }
        catch(TicketNumberException t){
            System.out.println(t.getMessage());
        }        
          try{
          k.nuevoTiquete(3456, false, 1032, "unal");    
           
        }
        catch(TicketNumberException t){
            System.out.println(t.getMessage());
        }        
                
      k.ventasporclase(3);
      k.ventasporclase(1);
      k.ventasporclase(2);
     
           
          
    }
    
    public void nuevoTiquete(int numero) throws TicketNumberException{
       
       
            Wallup w= new Wallup(numero);
        
        for(int i=0;i<this.tiquetes.size();i++)
        if (numero==this.tiquetes.get(i).getNumero()){
            throw new TicketNumberException("Numero no valido");
        }
        this.tiquetes.add(w);
        
    }
       
  public void nuevoTiquete(int numero, boolean r) throws TicketNumberException{
      
        Advanced a= new Advanced(numero,r);
         for(int i=0;i<this.tiquetes.size();i++)
        if (numero==this.tiquetes.get(i).getNumero()){
            throw new TicketNumberException("Numero no válido");
        }
        this.tiquetes.add(a);
    }
  public void nuevoTiquete(int numero, boolean r, int numeroC, String institucion) throws TicketNumberException{
      Student s= new Student(numero,r,numeroC,institucion);
      
   for(int i=0;i<this.tiquetes.size();i++)
        if (numero==this.tiquetes.get(i).getNumero()){
            throw new TicketNumberException("Numero no valido");
        }
        this.tiquetes.add(s);
        
    }
  public  void ventasporclase(int clase) {
     
      double r=0;
      
      if (clase==1){
          for(int y=0;y<this.tiquetes.size();y++){
              if(this.tiquetes.get(y) instanceof Wallup){
              r=r+this.tiquetes.get(y).getPrecio();
          }
          }
            System.out.println("Total de ventas por Wall-up:  "+r);
      }
      else if(clase==2){
          for(int v=0;v<this.tiquetes.size();v++){
              if(this.tiquetes.get(v) instanceof Advanced){
              r=r+this.tiquetes.get(v).getPrecio();
       }   
          
      }
  System.out.println("Total de ventas por Advanced:  "+r);
  } 
       else if(clase==3){
          for(int m=0;m<this.tiquetes.size();m++){
              if(this.tiquetes.get(m) instanceof Student){
              r=r+this.tiquetes.get(m).getPrecio();
       }   
          
      }
     System.out.println("Total de ventas por Student:  "+r);     
  }
        else{
            System.out.println("entrada no valida");
        }
  }
}
    
    

