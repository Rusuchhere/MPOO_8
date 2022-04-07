/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que indica las funciones y metodos de 
 * una Persona declaracion de la herencia va 
 * a heredar lo que tiene la clase padre "SerVivo" permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author A2
 */
public class Persona extends SerVivo{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo entero, cadena y boolean
     * privadas para solo acceder a ellas por medio 
     * de metodos de la misma clase
     */
    private int alto;
    private String ojos;
    private boolean delgado;
    /**
     * Constructor vacío
     */
    public Persona() {
    }
    /**
     * Contructor inicializado con las variables
     * @param alto
     * @param Ojos
     * @param delgado
     * @param nombre
     * @param edad 
     */
    public Persona(int alto, String Ojos, boolean delgado, String nombre, int edad) {
        super(nombre, edad);
        this.alto = alto;
        this.ojos = Ojos;
        this.delgado = delgado;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String Ojos) {
        this.ojos = Ojos;
    }

    public boolean isDelgado() {
        return delgado;
    }

    public void setDelgado(boolean delgado) {
        this.delgado = delgado;
    }
    /**
     * Metodo que muestra una impresión cuando 
     * la persona siente empatia
     */
    public void empatia (){
        System.out.println("se como te sientes");
    }
    /**
     * Metodo que muestra una impresión cuando
     * la persona crea algo inova
     */
    public void inovar (){
        System.out.println("cree la rueda");
    }
    /**
     * Metodo que muestra una impresión cuando
     * la persona razona 
     */
    public void razonamiento (){
        System.out.println("estoy pensando");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Persona{" + "alto=" + alto + ", ojos=" + ojos + ", delgado=" + delgado + '}';
    }
    
}
