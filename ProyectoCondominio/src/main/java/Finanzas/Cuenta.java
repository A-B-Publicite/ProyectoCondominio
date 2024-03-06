package Finanzas;

import java.io.Serializable;
import java.util.ArrayList;

public class Cuenta implements Serializable {

    private ArrayList<Pago> pagos = new ArrayList<>();
    private ArrayList<Recarga> recargas = new ArrayList<>();
    private double saldo = 0;
    private int contadorRecargas = 1;
    private Cuenta cuentaAdministrador;
    private GestorObligaciones gestorObligaciones;

    public Cuenta() {
        gestorObligaciones = new GestorObligaciones(this);
    }

    public void actualizarSaldo(double dinero) {
        saldo += dinero;
    }

    public GestorObligaciones getGestorObligaciones() {
        return gestorObligaciones;
    }

    public void recargarDinero(double dineroARecargar, MetodoRecarga metodoDeRecarga) {
        Recarga recarga = new Recarga(dineroARecargar, String.valueOf(contadorRecargas++), metodoDeRecarga);
        recarga.realizarMovimiento(this);
        recargas.add(recarga);
    }

    public void pagarObligacionFinanciera(ObligacionFinanciera obligacionFinanciera) {
        if (esSaldoMayorOIgualMonto(obligacionFinanciera.getMonto())) {
            Pago nuevoPago = new Pago(this);
            nuevoPago.pagarObligacionFinanciera(obligacionFinanciera, cuentaAdministrador);
            pagos.add(nuevoPago);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void pagarServicio(double monto, String tipo) {
        if (esSaldoMayorOIgualMonto(monto)) {
            Pago nuevoPago = new Pago(this);
            nuevoPago.pagar(monto, tipo, cuentaAdministrador);
            pagos.add(nuevoPago);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public boolean esSaldoMayorOIgualMonto(double monto) {
        return saldo >= monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String mostrarRecargas() {
        String salida = "";

        for (Recarga recarga : recargas) {
            salida += recarga + "\n";
        }
        return salida;
    }

    public Cuenta getCuentaAdministrador() {
        return cuentaAdministrador;
    }

    public void setCuentaDePago(Cuenta cuentaAdministrador) {
        this.cuentaAdministrador = cuentaAdministrador;
    }

    public String mostrarPagos() {
        String salida = "";

        for (Pago pago : pagos) {
            salida += pago + "\n";
        }

        return salida;
    }

    public ObligacionFinanciera getObligacion(String idPago) {
        return gestorObligaciones.getObligacion(idPago);
    }

    public String mostrarObligaciones() {
        return gestorObligaciones.mostrarObligaciones();
    }

}
