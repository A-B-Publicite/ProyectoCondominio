/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Perfil;
import java.io.Serializable;

/**
 *
 * @author MARQUEZ
 */
public class Validacion implements Serializable{
    
    public void validar(Perfil receptor, Autorizacion autorizacion){          
        Comparacion comparacion = new Comparacion();
        if(!comparacion.compararAutorizador(receptor.getNombreApellido(),autorizacion)){
            System.out.println("Este perfil no esta autorizado para aprobar esta autorizacion");
            return;}        
        autorizacion.validar();
    }  
    
}
