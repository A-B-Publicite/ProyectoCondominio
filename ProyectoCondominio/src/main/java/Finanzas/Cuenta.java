package Finanzas;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public void recargarSaldo(double abono, MetodoRecarga metodoDeRecarga) {
        Recarga recarga = new Recarga(abono, String.valueOf(contadorRecargas++), metodoDeRecarga);
        recarga.recargar(this);
        recargas.add(recarga);
    }

    public void pagarObligacionFinanciera(ObligacionFinanciera obligacionFinanciera) {
        
        if (esSaldoMayorOIgualMonto(obligacionFinanciera.getMonto())) {
            Pago nuevoPago = new Pago(this);
            nuevoPago.pagarObligacionFinanciera(obligacionFinanciera, cuentaAdministrador);
            pagos.add(nuevoPago);
            JOptionPane.showMessageDialog(null, "SE REALIZO EL PAGO CON EXITO");
        } else {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE PARA PAGAR LA OBLIGACION.");
        }
    }

    public void pagarContrato(double precioContrato) {
        if (esSaldoMayorOIgualMonto(precioContrato)) {
            Pago nuevoPago = new Pago(this);
            nuevoPago.pagarContrato(precioContrato);
            pagos.add(nuevoPago);
            JOptionPane.showMessageDialog(null, "SE REALIZO EL PAGO CON EXITO");
        } else {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE PARA PAGAR EL CONTRATO.");
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


    @Override
    public String toString() {
        String salida = "";
        salida = "================  CUENTA ==================\n";

        return salida += "Saldo Actual= " + saldo;
    }

    public void setCuentaDePago(Cuenta cuentaAdministrador) {
        this.cuentaAdministrador = cuentaAdministrador;
    }


    public String mostrarRegistros() {
        String salida = "";
        for (Pago pago : pagos) {
            salida += pago + "\n"; // Ahora esto imprimirá el formato ajustado de cada pago
        }
        return salida;
    }

    public ObligacionFinanciera recuperarObligacion(String idPago) {
        return gestorObligaciones.recuperarObligacion(idPago);
    }

    public String mostrarObligaciones() {
        return gestorObligaciones.mostrarObligaciones();
    }


}