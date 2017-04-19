/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_1;

import exepcion.exepcionAngel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel Cordova
 */
public class Ejemplo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo= new File("frases.txt");
        
        
        try {
            exepcionAngel.validar_Letra(archivo.getName(), "z");
        } catch (exepcionAngel ex) {
            System.out.println(ex);
        }
        FileReader fr;
        String salida="";
        try {
            fr = new FileReader(archivo);
            BufferedReader br= new BufferedReader(fr);
            while((salida=br.readLine()) != null){
                System.out.println(salida);
            }
       
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo_1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    
    }
    
}
