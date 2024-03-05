package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;

public class Recarga extends MovimientoMonetario implements Serializable {

    public Recarga(double dineroARecargar, String id, MetodoRecarga metodoDeRecarga) {
        super(dineroARecargar, id, metodoDeRecarga);

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
