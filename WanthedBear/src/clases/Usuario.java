/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import listas.ListaUsuarios;

/**
 *
 * @author urco1
 */
public class Usuario {
    private String nombreBar;
    private String usuario;
    private String contrasena;

    public Usuario(String nombreBar, String usuario, String contrasena) {
        
        if (ListaUsuarios.comprobarNombreBar(nombreBar)) {
            this.nombreBar = nombreBar;
        }else{
            
        }
        if (ListaUsuarios.comprobarUsuario(usuario)) {
            this.usuario = usuario;
        }else{
            
        }
        if (contrasena.length()<2) {
            
        }else{
            this.contrasena = contrasena;
        }
        
    }//fin constructor

    public String getNombreBar() {
        return nombreBar;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombreBar(String nombreBar) {
        this.nombreBar = nombreBar;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
    public String toString(){
        return "Nombre bar: "+getNombreBar()+" Usuario: "+getUsuario()+" Contraseña: "
                +getContrasena();
    }
    
}//main
