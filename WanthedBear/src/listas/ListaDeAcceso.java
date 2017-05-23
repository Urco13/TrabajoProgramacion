/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.HashMap;


/**
 *
 * @author urco1
 */
public class ListaDeAcceso {
  private static HashMap<String, String> listaAcceso = new HashMap<String,String>();

   public static boolean comprobarClaveNombre(String clave, String nombre){
       boolean resultado = false;
       if (listaAcceso.containsKey(clave) && listaAcceso.containsValue(clave)) {
           return true;
       }
       return resultado;
   }//comprobarUsuario

    public static  void setListaAcceso(String clave,String nombre) {
        listaAcceso.put(clave, nombre);
    }

    public static HashMap getListaAcceso() {
        return listaAcceso;
    }

    

    
    
  
     
   
}//fin class


// public static boolean comprobarClave(String clave, String nombre){
//       boolean resultado =true;
//       if (listaBares.isEmpty()) {
//           return resultado;
//       }else if(listaBares.containsKey(clave)){
//            resultado = false;
//       }
//       return resultado;
//   }//comprobarClave