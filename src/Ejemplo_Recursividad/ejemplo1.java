/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Recursividad;

/**
 *
 * @author Angel Cordova
 */
public class ejemplo1 {
   
    public int recursivo(int numero, int limite){
            int valor;
            if(numero< limite){
                numero += 2;
                System.out.println("ja/n");
                valor= recursivo(numero, limite);
            }else{
                valor = numero;
            }
            return valor;
        
        }
    public static void main(String[] args) {
        int numero= 3;
        int limite = 10;
        int resultado= 0;
        ejemplo1 ob= new ejemplo1();
        resultado= ob.recursivo(numero, limite);
        System.out.println(resultado);
    }
}
