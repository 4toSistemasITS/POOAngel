/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_estructura_de_datos_ej1;

import java.util.ArrayList;

/**
 *
 * @author Angel Córdova
 */
public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>();
        for(int i=0; i< 7; i++){
            lista.add("");
        }
        lista.set(0, "Cálculo");
        lista.set(1, "Programación");
        lista.set(2, "BDD");
        lista.set(3, "Análisis de Sistemas");
        lista.set(4, "Inglés");
        lista.set(5, "Hardware");
        imprimirArrayList_ordenado(lista);
        
    }
    public static void imprimirArrayList_ordenado(ArrayList<String> lista){
        ArrayList<String> lista2=new ArrayList<>();
        String cad, cad2;
        int cont=0;
        int dimension_pe=0;
        
        for(int i= lista.size()-1; i>=0; i--){
            cad= lista.get(i);
            if(dimension_pe > cad.length()){
                cont += 1;
            }else{
                
            }
            dimension_pe= cad.length();
            lista2.add(cont, cad);
        }
    }
}
