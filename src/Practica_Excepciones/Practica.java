/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Excepciones;

import exepcion.exepcionAngel;
import java.util.Scanner;

/**
 *
 * @author Angel Cordova
 */
public class Practica {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = -34;
        
        
        try {
            exepcionAngel.validar_positivos(numero1, numero2);
        } catch (exepcionAngel ex) {
            System.out.println(ex);
        }
    }
    
}
