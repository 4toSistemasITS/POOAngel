/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmueblepolimorfismo;

/**
 *
 * @author Angel Cordova
 */
public class Terreno extends Inmueble{
    private String tiposuelo;
    private double codigocatastral;
    private boolean cerramiento;

    public String getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(String tiposuelo) {
        this.tiposuelo = tiposuelo;
    }

    public double getCodigocatastral() {
        return codigocatastral;
    }

    public void setCodigocatastral(double codigocatastral) {
        this.codigocatastral = codigocatastral;
    }

    public boolean isCerramiento() {
        return cerramiento;
    }

    public void setCerramiento(boolean cerramiento) {
        this.cerramiento = cerramiento;
    }
    
    public static void main(String[] args) {
        Terreno terreno= new Terreno();
        
    }
    
}
