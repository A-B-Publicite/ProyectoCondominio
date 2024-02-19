/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
public class Pago {
    private Cuenta cuenta;
    private Registro registro;

    public Pago(Registro registro, Cuenta cuenta) {
        this.registro = registro;
        this.cuenta = cuenta;
    }

    public void pagar(ObligacionFinanciera obligacionFinanciera) {
        obligacionFinanciera.cambiarEstado();
        // si el estado es completado pasa al registro
        registro.registrar(obligacionFinanciera);
        cuenta.eliminarObligacion(obligacionFinanciera);
        //this.cuenta = ;
       //eliminarObligacion(obligacionFinanciera);

    }
}