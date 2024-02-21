/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */import java.time.LocalDate;
public class Pago {
    private LocalDate fechaPago;
    private ObligacionFinanciera obligacionFinanciera;
    private Cuenta cuenta;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double monto;

    public Pago(Cuenta cuenta) {
        this.cuentaOrigen = cuenta;
        this.fechaPago = LocalDate.now();
    }

    public void pagarObligacionFinancieraResidente(ObligacionFinanciera obligacionFinancieraAPagar, Cuenta cuentaAdministrador) {
        this.obligacionFinanciera = obligacionFinancieraAPagar;
        double monto = obligacionFinancieraAPagar.getMonto();
        //cuneta.verificar retiro
        cuentaOrigen.debitar(monto);


        cuentaAdministrador.depositar(monto);
        cuentaDestino = cuentaAdministrador;
       // cuentaDestino.depositar(monto);
        cuentaAdministrador.agregarRegistro(this);
        obligacionFinancieraAPagar.cambiarEstado("completado");

        cuentaOrigen.eliminarObligacion(obligacionFinancieraAPagar);
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
        return "Pago = (" +
                this.fechaPago +
                ')';
    }

    public void pagarContrato(double precioContrato) {
        monto = precioContrato;
        cuentaOrigen.debitar(monto);
        cuentaOrigen.agregarRegistro(this);
        //cuentaOrigen.agregarFecha(cuentaOrigen);
    }
    
}