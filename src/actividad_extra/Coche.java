/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 *Clase sin herencia 
 * que ayudará a selecccionar lugares
 *´para Mascota y Persona
 * @author A2
 */
public class Coche {
    private int color;
    private int modelo;
    private String marca;
    
    /**
     * Constructor vacío
     */
    public Coche() {
    }
    /**
     * Constructor inicializado
     * con las variables
     * @param color
     * @param modelo
     * @param marca
     
     */
    public Coche(int color, int modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    /**
     * Método simple que inidica el
     * encendido del coche 
     */
    public void encender(){
        System.out.println("Coche encendido");
    }
    
    /**
     * Método simple que inidica
     * cuando el coche acelera 
     */
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    
    /**
     * Método simple que inidica
     * cuando el coche se apaga
     */
    public void apagar(){
        System.out.println("Coche apagado ZZzzZ");
    }
    
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", modelo=" + modelo + ", marca=" + marca +'}';
    }

}
