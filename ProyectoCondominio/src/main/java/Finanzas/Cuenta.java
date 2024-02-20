/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Cuenta {
    private ArrayList<ObligacionFinanciera> obligacionesFinancieras = new ArrayList<>();
    private ArrayList<Registro> registros = new ArrayList<>();
    private ArrayList<Recarga> recargas = new ArrayList<>();
    private double saldo = 0;
    private int contador = 1;
    private Cuenta cuentaAdministrador;

    public Cuenta(Cuenta cuentaAdministrador) {
        this.cuentaAdministrador = cuentaAdministrador;
    }

    public ObligacionFinanciera aniadirObligacion(double valor, String descripcion, String tipo) {

        switch (tipo.toLowerCase(Locale.ROOT)) {
            case "alicuota":
                ObligacionFinanciera alicuota = new Alicuota(valor, descripcion, String.valueOf(contador++));
                obligacionesFinancieras.add(alicuota);
                return alicuota;
            case "cuotacontrato":
                ObligacionFinanciera cuotaContrato = new CuotaContrato(valor, descripcion, String.valueOf(contador++));
                obligacionesFinancieras.add(cuotaContrato);
                return cuotaContrato;
            /*
            case "multa":
                ObligacionFinanciera multa = new Multa(valor, descripcion, String.valueOf(contador++));
                obligacionesFinancieras.add(multa);
                return multa;
             */
            default:
                return null;
        }
    }


    public void recargarSaldo(int abono, String numeroTarjeta) {
        Recarga recarga = new Recarga(abono, numeroTarjeta);
        saldo += abono;
        recargas.add(recarga);
    }


    public void pagar(ObligacionFinanciera obligacionFinanciera) {
        Pago pago = new Pago(this);
        pago.pagar(obligacionFinanciera);

        // Todo: aqui se crea la nueva alicuota?
        if (obligacionFinanciera instanceof Alicuota) {
            // Si es del tipo Alicuota, añade la obligación con los parámetros específicos
            this.aniadirObligacion(400, "", "Alicuota");
        }
    }

    public void eliminarObligacion(ObligacionFinanciera obligacion) {
        ObligacionFinanciera encontrada = null;

        for (ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            if (Objects.equals(obligacionFinanciera.getIdObligacion(), obligacion.getIdObligacion())) {
                encontrada = obligacionFinanciera;
                //                obligacionesFinancieras.remove(obligacionFinanciera);
                break;
            }
        }

        obligacionesFinancieras.remove(encontrada);
    }

    //TODO: para qué esta función??
    public ObligacionFinanciera recuperarObligacion(String idObligacion) {
        for (Finanzas.ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            if (Objects.equals(obligacionFinanciera.getIdObligacion(), idObligacion)) {
                return obligacionFinanciera;
            }
        }
        return null;
    }

    public String mostrarObligaciones() {
        String salida = "";
        if (cuentaAdministrador != null) {
            salida = "================  OBLIGACION RESIDENTE ==================\n";
        } else {
            salida = "================  OBLIGACION ADMINISTRADOR ==================\n";
        }

        for (ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            salida += obligacionFinanciera + "\n";
        }
        return salida;
    }

    public String mostrarRegistros() {
        String salida = "";
        if (cuentaAdministrador != null) {
            salida = "================  REGISTRO RESIDENTE ==================\n";
        } else {
            salida = "================  REGISTRO ADMINISTRADOR ==================\n";
        }

        for (Registro registro : registros) {
            salida += registro + "\n";
        }
        return salida;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void debitar(double monto) {
        saldo -= monto;
    }

    public void agregarRegistro(Registro registro) {
        registros.add(registro);
    }


    public Cuenta getCuentaAdministrador() {
        return cuentaAdministrador;
    }

    @Override
    public String toString() {
        String salida = "";
        if (cuentaAdministrador != null) {
            salida = "================  CUENTA RESIDENTE ==================\n";
        } else {
            salida = "================  CUENTA ADMINISTRADOR ==================\n";
        }
        return salida += "Saldo= " + saldo;
    }
}