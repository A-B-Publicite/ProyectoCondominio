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
    private ObligacionFinanciera obligacionFinanciera;

    public Pago(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void pagar(ObligacionFinanciera obligacionFinancieraAPagar) {

        obligacionFinanciera = obligacionFinancieraAPagar;

        cuenta.debitar(obligacionFinanciera.getMonto());

        // TODO: Cambiar cuando cambien lo del admin
        if (cuenta.getCuentaAdministrador() != null) {
            cuenta.getCuentaAdministrador().depositar(obligacionFinanciera.getMonto());
        }

        obligacionFinanciera.cambiarEstado("completado");


        cuenta.agregarRegistro(new Registro(this));

        cuenta.eliminarObligacion(obligacionFinanciera);
    }

    @Override
    public String toString() {
        return "Pago = (" +
                this.obligacionFinanciera +
                ')';
    }
}