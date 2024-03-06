package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;

public class Recarga implements Serializable {

    private final String id;
    private MetodoRecarga metodoRecarga;
    private LocalDate fechaRealizacion;
    private Cuenta cuenta;
    private double cantidadDinero;

    public Recarga(double dineroARecargar, String id, MetodoRecarga metodoDeRecarga) {
        this.cantidadDinero = cantidadDinero;
        this.metodoRecarga = metodoDeRecarga;
        this.id = id;
        metodoRecarga.realizarTransaccion();
        fechaRealizacion = LocalDate.now();
    }

    @Override
    public String toString() {
        return "[Recarga N. " + id
                + "] | (" + metodoRecarga
                + ", fecha de realización= " + fechaRealizacion + ")";
    }

    public void recargar(Cuenta cuentaARecargar) {
        cuentaARecargar.actualizarSaldo(cantidadDinero);
    }

}
