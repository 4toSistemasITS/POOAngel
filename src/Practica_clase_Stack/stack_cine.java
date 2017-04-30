/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_clase_Stack;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel Córdova
 */
public class stack_cine {
    public static void main(String[] args) {
        Stack<Integer> boletos= new Stack<>();
        int opcion;
        System.out.println("Asientos Disponibles\n");
        boletos.add(1);
        boletos.add(2);
        boletos.add(3);
        boletos.add(4);
        vender_Entrada(boletos);
        opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Desea salir:\n1)Si\n2)No"));
        switch(opcion){
            case 1:
                salir_Cine(boletos);
                for (int i= boletos.size()-1; i>=0; i--) {
                    int a;
                    JOptionPane.showMessageDialog(null, "Salió la persona en el asiento "+boletos.get(i));
                    
                }
            case 2:
                System.out.println("----------------\n    Asientos Disponibles\n");
                vender_Entrada(boletos);
        }
        
    }
    
    public static void vender_Entrada(Stack<Integer> boletos){
        stack_cine cine= new stack_cine();
        
        for (int i = 0; i < boletos.size(); i++) {
            System.out.println("Asiento "+boletos.get(i));
        }
    }
    
    public static void salir_Cine(Stack<Integer> boletos){
        stack_cine cine= new stack_cine();
        boletos.pop();
        
        
        
    }
}
