/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

import java.io.Serializable;

/**
 *
 * @author alejo
 */
public class EstadoPendiente implements EstadoObligacion, Serializable {

    @Override
    public void cambiarEstado(ObligacionFinanciera obligacionFinanciera, String senial) {
        if(senial.equals("completado")){
            obligacionFinanciera.setEstado(new EstadoCompletado());
        }
        if(senial.equals("atrasado")){
            obligacionFinanciera.setEstado(new EstadoAtrasado());
        }

    }

    @Override
    public String toString() {
        return "pendiente";
    }
}
