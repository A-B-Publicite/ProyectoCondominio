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
    private ObligacionFinanciera obligacionFinanciera;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double monto;

    public Pago(Cuenta cuenta) {
       this.cuenta = cuenta;       
    }

    public void pagarObligacionFinancieraResidente(ObligacionFinanciera obligacionFinancieraAPagar, Cuenta cuentaAdministrador) {
        double monto = obligacionFinanciera.getMonto();
        //cuneta.verificar retiro
        cuentaOrigen.debitar(monto);
        cuentaAdministrador.depositar(monto);
        cuentaDestino = cuentaAdministrador;
        cuentaAdministrador.agregarRegistro(this);
        obligacionFinanciera.cambiarEstado("completado");
        
        cuenta.eliminarObligacion(obligacionFinanciera);
    }

    @Override
    public String toString() {
        return "Pago = (" +
                this.obligacionFinanciera +
                ')';
    }
}