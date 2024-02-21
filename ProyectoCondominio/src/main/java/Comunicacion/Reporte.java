/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import java.util.Obverser;

public abstract class Reporte implements Observer {

    private Perfil multa;

    public Reporte(ObligacionFinanciera multa) {
        this.multa = multa;
    }
    

    
    public void enviar(){
        
    };
    
    public void agregar(){
        
    }
    
    public abstract void mostrar();
}

