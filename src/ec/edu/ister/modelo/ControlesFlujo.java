/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author alexis 08
 */
public class ControlesFlujo {
    public static boolean getCheck(){
    boolean check = true;
    if(check==true)
    
        return true;
    else
        return false;
    }
    public static void comparacionFor(){
        for (int i = 1; i < 100; i++) {
            if(i%75 ==0 && i%25 ==0){
                System.out.println(i+",");  
      }
    }
        for (int i = 1; i < 100; i++) {
            if(i%75 ==0)
                System.out.println(i+",");
            
        }
    }
    public static void unirFor(){
        for (int i = 1; i < 6; i+=2) {
            for (int j = 0; j < 3; j++) {
                if(i + j > 4){
                    break;
                }
                System.out.println( i* j);
                
            }
            
        }
    }
    public static void ifMejorado(){
        do {   
            int valor = Integer.parseInt(JOptionPane.showInternalInputDialog(null, "ingrese su estado de animo del 0 al 10"));
        String result;
        result =(valor <=10 && valor >=7)?"Emoncionado"
                +"":(valor <= 6 && valor >=4)?"alegre":"triste";
            int x = JOptionPane.showConfirmDialog(null,"continuar");
            
        } while (true);
         
        
    }
    
  }

   

        
   

