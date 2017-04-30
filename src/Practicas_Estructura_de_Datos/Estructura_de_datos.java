/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas_Estructura_de_Datos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel Córdova
 */
public class Estructura_de_datos {
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList<>();
        for(int i=0; i< 10; i++){
            lista.add("vacio");
        }
        imprimirArrayList_ascendente(lista);
        lista.add(6,"uno");
        lista.add(3,"dos");
        lista.add(2,"tres");
        lista.add(8,"cuatro");
        lista.add(1,"cinco");
//        imprimirArrayList(lista);
        System.out.println("--------------");
        imprimirArrayList_ascendente(lista);
        lista.remove(1);
        lista.set(8, "hola");
        System.out.println("--------------");
        imprimirArrayList_ascendente(lista);
    }
    public static void imprimirArrayList(ArrayList<String> lista){
        for (String valor : lista) {
            System.out.println(valor);
        }
    }

    public static void imprimirArrayList_ascendente(ArrayList<String> lista){
        for (int i = lista.size()-1; i >=0; i--) {
            System.out.println(lista.get(i)+ " Posicion "+i);
        }
    }
}
