/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

public class Comparacion {

    public Comparacion() {
    }
    
    public void compararValidar(String receptor, String autorizador, Autorizacion autorizacion){            
        if(!receptor.equals(autorizador)){
            System.out.println("Este perfil no esta autorizado para aprobar esta autorizacion");
            return;}
        autorizacion.validar();
    }
    
    public boolean compararAutorizado(String autorizado, Autorizacion autorizacion){      
        return autorizacion.getAutorizado().equals(autorizado);
    }
}
