/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_hashmap_ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Angel Córdova
 */
public class Practica_hashmap {
    public static void main(String[] args) {
        HashMap<String, String> hola=new HashMap<>();
        hola.put("nombre", "angel");
        hola.put("apellido","cordova" );
        for (Map.Entry<String, String> variable_local : hola.entrySet()) {
            String key = variable_local.getKey();
            String value = variable_local.getValue();
            System.out.println("clave: "+key+" valor: "+value);
        }
        
        System.out.println(hola.get("nombre"));
        System.out.println(hola.containsValue("angel"));
        
    }
    
    public static void imprimirArrayList(ArrayList<String> lista){
        for (Object valor : lista) {
            System.out.println(valor);
        }
    }
    
    public static void imprimirArrayListReverso(ArrayList<String> lista){
        
    }
}
