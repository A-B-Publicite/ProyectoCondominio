/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import java.io.Serializable;

public class Comparacion implements Serializable{

    public Comparacion(){
    }
    
    public void compararValidar(String receptor, Autorizacion autorizacion){            
        if(!compararAutorizador(receptor,autorizacion.getAutorizador())){
            System.out.println("Este perfil no esta autorizado para aprobar esta autorizacion");
            return;}
        autorizacion.validar();
    }
    
    public boolean compararAutorizado(String autorizado, Autorizacion autorizacion){      
        return autorizacion.getAutorizado().equals(autorizado);
    }
    
    public boolean compararAutorizador(String receptor, String autorizador){      
        return receptor.equals(autorizador);
    }
}
