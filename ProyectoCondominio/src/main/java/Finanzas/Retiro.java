package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;

public class Retiro extends MovimientoMonetario implements Serializable {

    public Retiro(double dineroARetirar, String id, MetodoRecarga metodoDeRecarga) {
        super(dineroARetirar, id, metodoDeRecarga);

        metodoRecarga.realizarTransaccion();
        fechaRealizacion = LocalDate.now();
    }

    @Override
    public String toString() {
        return "[Recarga N. " + id
                + "] | (" + metodoRecarga
                + ", fecha de realización= " + fechaRealizacion + ")";
    }

    @Override
    public void realizarMovimiento(Cuenta cuentaARecargar) {
        cuentaARecargar.actualizarSaldo(cantidadDinero);
    }

}
