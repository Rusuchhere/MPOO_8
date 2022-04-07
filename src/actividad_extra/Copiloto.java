/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 *Clase que hereda de Persona 
 * @author alumno
 */
public class Copiloto extends Persona {
    /**
     * Zona de atributos (Encapsulamiento)
     * variable de tipo boolean y objeto de tipo String
     */
    private boolean camino;
    private String dormir;
    private boolean buenAcompañante;
    
    /**
     * Constructor vacío
     */

    public Copiloto() {
    }
    /**
     * Constructor inicializado
     * con las variables
     */
    public Copiloto(boolean camino, String dormir, boolean buenAcompañante, int alto, String Ojos, boolean delgado, String nombre, int edad) {
        super(alto, Ojos, delgado, nombre, edad);
        this.camino = camino;
        this.dormir = dormir;
        this.buenAcompañante = buenAcompañante;
    }

    public boolean isCamino() {
        return camino;
    }

    public void setCamino(boolean camino) {
        this.camino = camino;
    }

    public String getDormir() {
        return dormir;
    }

    public void setDormir(String dormir) {
        this.dormir = dormir;
    }

    public boolean isBuenAcompañante() {
        return buenAcompañante;
    }

    public void setBuenAcompañante(boolean buenAcompañante) {
        this.buenAcompañante = buenAcompañante;
    }
    /**
     * Método para indicar al piloto
     */
    public void aconsejaPiloto (){
        System.out.println("ve hacia la derecha");
    }
    /**
     * Método para mantener 
     * despierto al piloto
     */
    public void mantenerAlertaPiloto (){
        System.out.println("No te duermas");
    }
    /**
     * Método para hacer cosas por el piloto
     */
    public void facilitarCosasAlPiloto (){
        System.out.println("Yo contesto el telefono");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Copiloto{" + "camino=" + camino + ", dormir=" + dormir + ", buenAcompa\u00f1ante=" + buenAcompañante + '}';
    }
    
}
