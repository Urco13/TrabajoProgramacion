/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wanthedbear;


import clases.Usuario;
import ventanas.Inicio;

/**
 *
 * @author urco1
 */
public class WanthedBear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MarcaCerveza cerveza= MarcaCerveza.ESTRELLA;
        System.out.println(cerveza.name());
        
        
    }//fin main
    public enum MarcaCerveza{
           ESTRELLA, SUPER, CORONITA, MAHOU
       }
    
    
}//fin class
