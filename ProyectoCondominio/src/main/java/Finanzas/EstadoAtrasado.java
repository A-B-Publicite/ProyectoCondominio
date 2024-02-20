/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
public class EstadoAtrasado implements EstadoObligacion {
    @Override
    public void cambiarEstado(ObligacionFinanciera obligacionFinanciera, String senial) {
        obligacionFinanciera.setEstado(new EstadoCompletado());
    }

    @Override
    public String toString() {
        return "atrasado";
    }
}
