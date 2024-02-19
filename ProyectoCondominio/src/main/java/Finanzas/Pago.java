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

    public Pago(ObligacionFinanciera obligacionFinanciera, Cuenta cuenta) {
        this.cuenta = cuenta;
        ObligacionFinanciera obligacionFPagada = pagar(obligacionFinanciera);
        this.obligacionFinanciera = obligacionFPagada;
        cuenta.agregarRegistro(new Registro(this));
    }

    public ObligacionFinanciera pagar(ObligacionFinanciera obligacionFinanciera) {
        cuenta.debitar(obligacionFinanciera.getMonto());
        if (cuenta.getCuentaAdministrador() != null) {
            cuenta.getCuentaAdministrador().depositar(obligacionFinanciera.getMonto());
        }
        obligacionFinanciera.cambiarEstado();

        cuenta.eliminarObligacion(obligacionFinanciera);

        return obligacionFinanciera;
    }

    @Override
    public String toString() {
        return "Pago = (" +
                this.obligacionFinanciera +
                ')';
    }
}