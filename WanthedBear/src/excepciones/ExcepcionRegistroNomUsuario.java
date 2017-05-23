/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author urco1
 */
public class ExcepcionRegistroNomUsuario extends Exception{
    private int error;

    public ExcepcionRegistroNomUsuario(int error) {
        this.error = error;
    }
    
    public String getMenssage(){
        switch (error) {
            case 1:return "Este campo no puede estar vacio";
            default:return "";
        }
    }
    
}
