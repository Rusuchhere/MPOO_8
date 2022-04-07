/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase que indica las funciones y metodos de 
 * un Cuadrilatero declaracion de la herencia va 
 * a heredar lo que tiene la clase padre "Poligono" permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo float y enteros 
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private int alfa, beta;
    private float a, b;
    private float base, altura;
    /**
     * Constructor vacío
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor inicializado con las variables
     * @param base
     * @param altura 
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float perimetro() {
        return 2*a + 2*b;
    }
    
    @Override
    public float area(){
        return base*altura;
    }
    /**
     * Sobre carga
     * Modificar o sobreescribir el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
