/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author urco1
 */
public class ListaUsuarios {
    private static ArrayList<Usuario>listaBares = new ArrayList<Usuario>();
    
    
    /**
     * 
     * @param nombreBar
     * @return boolean
     */
    public static boolean comprobarNombreBar(String nombreBar){
        boolean result = true;
        if (listaBares.isEmpty()) {
            return result;
        }else{
            for (Usuario u : listaBares) {
                if (u.getNombreBar().equalsIgnoreCase(nombreBar)) {
                    return result=false;
                }
            }
        }
        return result; 
    }//comprobarNombre
    
    /**
     * 
     * @param nombreUsuario
     * @return boolean
     */
    public static boolean comprobarUsuario(String nombreUsuario){
        boolean result = true;
        for (Usuario u : listaBares) {
            if (u.getUsuario().equalsIgnoreCase(nombreUsuario)) {
                return result=false;
            }
        }
        return result;
    }//comprobarUsuario

    /**
     * 
     * @param usuario 
     */
    public static void llenarLista(Usuario usuario){
        listaBares.add(usuario);
    }//llenarLista
    
    
    /**
     * 
     */
    public static void listarUsuarios(){
        if (listaBares.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else{
            for (Usuario u : listaBares) {
                System.out.println(u.toString());
                System.out.println(listaBares.indexOf(u));
            }
        }
        
    }//fin listarUsuarios
    
    public static Usuario cogerUsuario(String usuario){
         Usuario miUsuario = null;
        for (Usuario u : listaBares) {
            if (usuario.equals(u.getUsuario())) {
               miUsuario = listaBares.get(listaBares.indexOf(u));    
            }
        }
        return miUsuario;
    }//cogerUsuario
    
}//fin listaUsuarios




//    public static boolean comprobarContrasena(String contrasena){
//        boolean result = true;
//        for (Usuario u : listaBares) {
//            if (u.getContrasena().equalsIgnoreCase(contrasena)) {
//                return result=false;
//            }
//        }
//        return result;
//    }