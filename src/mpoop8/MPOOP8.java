/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop8;
/**
 * Archivo principal
 */
import figuras.Cuadrilatero;
import figuras.Poligono;
import figuras.Triangulo;

import actividad_extra.Mascota;
import actividad_extra.Persona;
import actividad_extra.Gato;
import actividad_extra.Perro;
import actividad_extra.Copiloto;
import actividad_extra.Piloto;

import actividad_extra.Coche;

public class MPOOP8 {

    public static void main(String[] args) {
        Poligono poligono = new Poligono();
        System.out.println(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        Object objeto = new Object();
        System.out.println(objeto);
        objeto = new Poligono();
        System.out.println(objeto);
        objeto = new Triangulo();
        System.out.println(objeto);
        
        getPoligono(new Triangulo());
        getPoligono(new Cuadrilatero());
        getPoligono(new Poligono());
       
        System.out.println("####Actividad extra###");
        
        getPersona(new Piloto());
        getPersona(new Copiloto());
        getPersona(new Persona());
        getMascota(new Perro());
        getMascota(new Gato());
        getMascota(new Mascota());
         
    }
    
    public static void getPoligono(Poligono pol) {
        if (pol instanceof Triangulo){
            System.out.println("El poligono es un triangulo");
        }else if (pol instanceof Cuadrilatero){
            System.out.println("El poligono es un cuadrilatero");
        }else {
            System.out.println("Es otra figura");
        }
    }
   
    public static void getMascota(Mascota mas){
        if (mas instanceof Perro){
            System.out.println("La mascota es un perro va en el asiento 3T");
        }else if (mas instanceof Gato) {
            System.out.println("La mascota es un gato va en el asiento 4T");    
        }else{
            System.out.println("Eso otro animal");
        }
    }
    
    public static void getPersona(Persona per){
        if (per instanceof Piloto){
            System.out.println("La persona es un Piloto va en el asiento 1D");
        }
        else if(per instanceof Copiloto){
            System.out.println("La persona es un copiloto va en el asiento 2D");    
        }
    }
   
}
    
        




