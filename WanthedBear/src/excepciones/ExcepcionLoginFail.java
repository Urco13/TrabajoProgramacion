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
public class ExcepcionLoginFail extends Exception{
    private int error;

    public ExcepcionLoginFail(int error) {
        this.error = error;
    }
    
    @Override
    public String getMessage(){
        switch (error) {
            case 1:return "El usuario o la contraseña no son correctos";
            default:return "";
        }
    }
}
