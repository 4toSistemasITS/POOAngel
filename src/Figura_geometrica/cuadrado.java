/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura_geometrica;

/**
 *
 * @author Angel Cordova
 */
public class cuadrado implements Figura_geometrica{

    @Override
    public double area() {
        return 16;
    }

    @Override
    public double perimetro(double valor) {
        return valor *2;
    }
    
}
