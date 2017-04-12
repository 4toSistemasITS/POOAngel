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
public class Inmueble {
    private String ubicacion;
    protected double dimension;
    private double avaluo;
    private int numeroInmueble;
    private boolean servicios_basicos;
    private double latitud;
    private double longitud;

    public Inmueble() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    public int getNumeroInmueble() {
        return numeroInmueble;
    }

    public void setNumeroInmueble(int numeroInmueble) {
        this.numeroInmueble = numeroInmueble;
    }

    public boolean isServicios_basicos() {
        return servicios_basicos;
    }

    public void setServicios_basicos(boolean servicios_basicos) {
        this.servicios_basicos = servicios_basicos;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public double avaluar(){
        return 0.0;
    }
    
    public double comisionarventa(){
        return 0.0;
    }
}
