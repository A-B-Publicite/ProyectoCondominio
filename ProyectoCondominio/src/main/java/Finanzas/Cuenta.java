
package Finanzas;

import java.io.Serializable;
/**
 *
 * @author alejo
 */import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.time.ZoneId;
import java.util.Date;

public class Cuenta implements Serializable{
    private ArrayList<ObligacionFinanciera> obligacionesFinancieras = new ArrayList<>();
    private ArrayList<Pago> registros = new ArrayList<>();
    private ArrayList<Recarga> recargas = new ArrayList<>();
    private double saldo = 0;
    private int contadorObligaciones = 1;
    private int contadorRecargas = 1;
    private Cuenta cuentaAdministrador;

    private double valorInicialAlicuota;
    public Cuenta() {
    }

    public void pagarObligacionFinancieraResidente(ObligacionFinanciera obligacionFinanciera) {

        Pago nuevoPago = new Pago(this);

        nuevoPago.pagarObligacionFinancieraResidente(obligacionFinanciera, cuentaAdministrador);
        registros.add(nuevoPago);

    }

    public void pagarContratoAdministrador(double Preciocontrato) {
        Pago nuevoPago = new Pago(this);
      //  double monto = contrato.getPrecioContrato();
        nuevoPago.pagarContrato(Preciocontrato);
    }

    public ObligacionFinanciera aniadirObligacion(double valor, String descripcion, String tipo) {

        switch (tipo.toLowerCase(Locale.ROOT)) {
            case "alicuota":
                if (contadorObligaciones == 1) { // Asumiendo que es la primera obligación añadida
                    valorInicialAlicuota = valor; // Almacena el valor inicial
                }
                Alicuota alicuota = new Alicuota(valor, descripcion, String.valueOf(contadorObligaciones++));
                obligacionesFinancieras.add(alicuota);
                alicuota.agregarObservador(this);
                programarSiguienteAlicuota(alicuota);
                return alicuota;
            case "multa":
                ObligacionFinanciera multa = new Multa(valor, descripcion, String.valueOf(contadorObligaciones++));
                obligacionesFinancieras.add(multa);
                return multa;

            default:
                return null;
        }
    }


    public void programarSiguienteAlicuota(Alicuota alicuota) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String descripcion = alicuota.descripcion; // Usa la descripción de la alicuota actual o actualízala según sea necesario
                // Utiliza valorInicialAlicuota para la nueva Alicuota
                aniadirObligacion(valorInicialAlicuota, descripcion, "alicuota");
            }
        }, Date.from(alicuota.fechaLimite.atZone(ZoneId.systemDefault()).toInstant()));
    }

    public void actualizar(ObligacionFinanciera obligacionAtrasada) {
        if (obligacionAtrasada instanceof Alicuota && obligacionAtrasada.getEstado() instanceof EstadoAtrasado) {
            double valorAlicuotaAtrasa = obligacionAtrasada.getMonto();
            aniadirObligacion(valorAlicuotaAtrasa, "Multa de la alicuota atrasada numero " + obligacionAtrasada.idObligacion, "multa");
        }
    }


    public void recargarSaldo(double abono) {
        Recarga recarga = new Recarga(abono, String.valueOf(contadorRecargas++));
        saldo += abono;
        recargas.add(recarga);
    }

    //tarjeta
    public void recargarSaldo(double abono, String numeroTarjeta, String pin) {
        Recarga recarga = new Recarga(abono, numeroTarjeta, pin, String.valueOf(contadorRecargas++));
        saldo += abono;
        recargas.add(recarga);
    }

    //transferencia
    public void recargarSaldo(double abono, String numeroCuentaOrigen) {
        Recarga recarga = new Recarga(abono, numeroCuentaOrigen, String.valueOf(contadorRecargas++));
        saldo += abono;
        recargas.add(recarga);
    }

    public double getSaldo() {
        return saldo;
    }
    /*
    public void pagar(ObligacionFinanciera obligacionFinanciera) {
        Pago pago = new Pago(this);
        pago.pagar(obligacionFinanciera);

        // Todo: aqui se crea la nueva alicuota?
        if (obligacionFinanciera instanceof Alicuota) {
            // Si es del tipo Alicuota, añade la obligación con los parámetros específicos
            this.aniadirObligacion(400, "", "Alicuota");
        }
    }*/

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

        for (Pago registro : registros) {
            salida += registro + "\n";
        }
        return salida;
    }

    public String mostrarRecargas() {
        String salida = "";
        salida = "================  RECARGAS RESIDENTE ==================\n";


        for (Recarga recarga : recargas) {
            salida += recarga + "\n";
        }
        return salida;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void debitar(double monto) {
        saldo -= monto;
    }

    public void agregarRegistro(Pago pago) {
        registros.add(pago);
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
}