/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_hashmap_ej1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel Córdova
 */
public class Ejemplo_1 {
    
    public static void main(String[] args) {
        segundo_Met();
//        HashMap<String, String> login= new HashMap<>();
//        login.put("Usuario", "ac123");
//        login.put("Contraseña","12345");
//        login.put("Nombres", "Angel Gabriel");
//        login.put("Apellidos", "Cordova Romero");
//        login.put("Especialidad", "Analisis Sistemas");
//        login.put("Ciclo", "Cuarto");
//        for (Map.Entry<String, String> var : login.entrySet()) {
//            String key = var.getKey();
//            String value = var.getValue();
//            Scanner sc= new Scanner(System.in);
//            System.out.println("Ingrese su usuario: ");
//            String usuario= sc.nextLine();
//            System.out.println("Ingrese su contraseña: ");
//            String contraseña= sc.nextLine();
//            if(login.get("Usuario").equals(usuario) && login.get("Contraseña").equals(contraseña)){
//                System.out.println("\n--------Bienvenido "+usuario+" --------");
//                System.out.println(login.get("Nombres"));
//                System.out.println(login.get("Apellidos"));
//                System.out.println(login.get("Especialidad"));
//                System.out.println(login.get("Ciclo"));
//                break;
//            }else{
//                JOptionPane.showMessageDialog(null, "Los datos son incorrectos");
//                
//            }
//        }
//        
   }
    public static void segundo_Met(){
        HashMap<Integer, String> login= new HashMap<>();
        login.put(1, "ac123");
        login.put(2,"12345");
        login.put(3, "Angel Gabriel");
        login.put(4, "Cordova Romero");
        login.put(5, "Analisis Sistemas");
        login.put(6, "Cuarto");
        for (Map.Entry<Integer, String> var : login.entrySet()) {
            int key = var.getKey();
            String value = var.getValue();
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingrese su usuario: ");
            String usuario= sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contraseña= sc.nextLine();
            if(login.get(1).equals(usuario) && login.get(2).equals(contraseña)){
                System.out.println("\n--------Bienvenido "+usuario+" --------");
                System.out.println(login.get(3));
                System.out.println(login.get(4));
                System.out.println("Especialidad: "+login.get(5));
                System.out.println("Ciclo:"
                        + ""
                        + " "+login.get(6));
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Los datos son incorrectos, intente nuevamente.");
                
            }
        }
        }
}
