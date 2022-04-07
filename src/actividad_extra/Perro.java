/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 *Clase que indica las funciones y metodos de 
 * un perro declaracion de la herencia va 
 * a heredar lo que tiene la clase padre "Mascota" permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author A2
 */
public class Perro extends Mascota{
    /**
     * Zona de atributos (Encapsulamiento)
     * variable de tipo boolean 
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private boolean colaCortada;
    private boolean tirarPelo;
    private boolean agresivo;
    /**
     * Constructor vacío
     */
    public Perro() {
    }
    /**
     * Constructor inicializado con las vairables
     * @param colaCortada
     * @param tirarPelo
     * @param agresivo
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Perro(boolean colaCortada, Boolean tirarPelo, boolean agresivo, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
        this.tirarPelo = tirarPelo;
        this.agresivo = agresivo;
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }

    public Boolean getLabrar() {
        return tirarPelo;
    }

    public void setLabrar(Boolean labrar) {
        this.tirarPelo = tirarPelo;
    }

    public boolean isAgresivo() {
        return agresivo;
    }

    public void setAgresivo(boolean agresivo) {
        this.agresivo = agresivo;
    }
    /**
     * Metodo que muestra una impresión cuando el Perro corre
     */        
    public void correr (){
        System.out.println("Corriendo");
    }
    /**
     * Metodo que muestra una impresión cuando el perro
     * corretea al aguien
     */
    public void corretear (){
        System.out.println("Te estoy persiguiendo");
    }
    /**
     * Metodo que muestra una impresion cuando el perro 
     * protege a alguien
     */
    public void proteger (){
        System.out.println("Guaf guaf");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribir el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Perro{" + "colaCortada=" + colaCortada + ", tirarPelo=" + tirarPelo + ", agresivo=" + agresivo + '}';
    }
    
    
}
