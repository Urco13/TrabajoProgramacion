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
public class ExcepcionRegistroNomBar extends Exception{
    private int error;

    public ExcepcionRegistroNomBar(int error) {
        this.error = error;
    }
    
    @Override
    public String getMessage(){
        switch (this.error) {
            case 1:return "Este campo no puede estar vacio";
            case 2:return "El campo usuario no puede estar vacio";    
            default:return "";
        }
    }
}
