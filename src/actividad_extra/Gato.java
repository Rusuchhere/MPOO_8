/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 * Clase que indica las funciones y metodos de
 * un Gato declaración de la herencia va a
 * heredar lo que tiene la clase padre "Mascota" permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author A2
 */
public class Gato extends Mascota {
    /**
     * Zona de atributos (Encapsulamiento)
     * variable de tipo boolean y entero
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private boolean ronronea;
    private int tamaño;
    private int garras;
    /**
     * Constructor vacío
     */
    public Gato() {
    }
    /**
     * Contructor inicializado con las variables
     * @param ronronea
     * @param tamaño
     * @param garras
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Gato(boolean ronronea, int tamaño, int garras, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.ronronea = ronronea;
        this.tamaño = tamaño;
        this.garras = garras;
    }

    public boolean isRonronea() {
        return ronronea;
    }

    public void setRonronea(boolean ronronea) {
        this.ronronea = ronronea;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        this.garras = garras;
    }
    /**
     * Metodo que muestra una impresion cuando el gato maulla
     */
    public void Maullar (){
        System.out.println("miau miaun ");
    }
    /**
     * Metodo que muestra una impresión cuando el 
     * gato raguna algo o alguien
     */
    public void rasguñar (){
        System.out.println(" desgara ");
    }
    /**
     * Metodo que muestra cuando el gato caza un raton
     */
    public void cazaRatones (){
        System.out.println("guacala");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Gato{" + "ronronea=" + ronronea + ", tama\u00f1o=" + tamaño + ", garras=" + garras + '}';
    }
         
}
