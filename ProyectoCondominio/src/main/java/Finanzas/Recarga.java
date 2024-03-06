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
        this.cantidadDinero = dineroARecargar;
        this.metodoRecarga = metodoDeRecarga;
        this.id = id;

        metodoRecarga.realizarTransaccion();
        fechaRealizacion = LocalDate.now();
    }

    @Override
    public String toString() {
        return "[N. " + id
                + "] | (" + metodoRecarga
                + ", Fecha de realización= " + fechaRealizacion + ")";
    }

    
    public void realizarMovimiento(Cuenta cuentaARecargar) {
        cuentaARecargar.actualizarSaldo(cantidadDinero);
    }

}
