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
public class triangulo implements Figura_geometrica{

    @Override
    public double area() {
        return 15;
    }

    @Override
    public double perimetro(double valor) {
        return valor *3;
    }
    
}
