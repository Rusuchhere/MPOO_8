/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_extra;

/**
 *
 * @author alumno
 */
public class Piloto extends Persona{
    private String tipoLicencia;
    private boolean sentidoOrientación;
    private boolean reflejos ;
    
    public Piloto() {
    }

    public Piloto(String tipoLicencia, boolean sentidoOrientación, boolean reflejos, int alto, String Ojos, boolean delgado, String nombre, int edad) {
        super(alto, Ojos, delgado, nombre, edad);
        this.tipoLicencia = tipoLicencia;
        this.sentidoOrientación = sentidoOrientación;
        this.reflejos = reflejos;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public boolean isSentidoDeLaOrientación() {
        return sentidoOrientación;
    }

    public void setSentidoDeLaOrientación(boolean sentidoDeLaOrientación) {
        this.sentidoOrientación = sentidoDeLaOrientación;
    }

    public boolean isReflejos() {
        return reflejos;
    }

    public void setReflejos(boolean reflejos) {
        this.reflejos = reflejos;
    }
    public void maniobrar (){
        System.out.println("run run runnn");
    }
    public void Perderse (){
        System.out.println("busca en donde estamos");
    }
    public void velocidad (){
        System.out.println("flash  flash");
    }

    @Override
    public String toString() {
        return "Piloto{" + "tipoLicencia=" + tipoLicencia + ", sentidoDeLaOrientaci\u00f3n=" + sentidoOrientación + ", reflejos=" + reflejos + '}';
    }
    
    
}
