/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */

import java.io.Serializable;
import java.time.LocalDate;

public class Pago implements Serializable {
    private LocalDate fechaPago;
    private ObligacionFinanciera obligacionFinanciera;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double monto;

    public Pago(Cuenta cuenta) {
        this.cuentaOrigen = cuenta;
        this.fechaPago = LocalDate.now();
    }

    public void pagarObligacionFinancieraResidente(ObligacionFinanciera obligacionFinancieraAPagar, Cuenta cuentaAdministrador) {

         monto = obligacionFinancieraAPagar.getMonto();

        if (cuentaOrigen.getSaldo() >= monto )
        {
            cuentaOrigen.debitar(monto);
            cuentaAdministrador.depositar(monto);
            cuentaDestino = cuentaAdministrador;

           obligacionFinancieraAPagar.cambiarEstado("completado");

            cuentaOrigen.eliminarObligacion(obligacionFinancieraAPagar);

        }
        else
        {
            System.out.println("Saldo insuficiente en la cuenta , Recarge el saldo ");

        }
        obligacionFinanciera = obligacionFinancieraAPagar;

    }
/*
    public void pagar(ObligacionFinanciera obligacionFinancieraAPagar) {

        obligacionFinanciera = obligacionFinancieraAPagar;

        // cuenta. verificar dinero en saldo.
        cuenta.debitar(obligacionFinanciera.getMonto());

        // TODO: Cambiar cuando cambien lo del admin
        if (cuenta.getCuentaAdministrador() != null) {
            cuenta.getCuentaAdministrador().depositar(obligacionFinanciera.getMonto());
        }

        obligacionFinanciera.cambiarEstado("completado");


        cuenta.agregarRegistro(new Registro(this));

        cuenta.eliminarObligacion(obligacionFinanciera);
    }
*/
    @Override
    public String toString() {
        return  "PAGO REALIZADO: " + "Fecha:" +
                this.fechaPago + " Monto: " + monto+
               "\n"+ " Cuenta origen: "+ cuentaOrigen +  " \nCuenta Admin: " + cuentaDestino +"\n------------------------------------------" ;
    }

    public void pagarContrato(double precioContrato) {
        monto = precioContrato;
        cuentaOrigen.debitar(monto);
        cuentaOrigen.agregarRegistro(this);

    }

}