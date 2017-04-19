/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcion;

/**
 *
 * @author Angel Cordova
 */
public class exepcionAngel extends Exception{

    public exepcionAngel(String message) {
        super(message);
    }
    
    public static void validar_Longitud(String nombre, int cantidad) throws exepcionAngel{
        if(nombre.length() < cantidad){
            throw new exepcionAngel("La longitud no es valida");
        }
    }
    
    public static void validar_Letra(String nombre, String letra) throws exepcionAngel{
        if(!nombre.contains(letra)){
            throw new exepcionAngel("el archivo no contiene una letra "+ letra);
        }
    }
    
    public static void validar_positivos(int numero1, int numero2) throws exepcionAngel{
        if((numero1+numero2)<0){
            throw new exepcionAngel("El resultado de la suma no es positiva.");
        }
    }
}
