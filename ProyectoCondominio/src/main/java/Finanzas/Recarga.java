package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;

public class Recarga implements Serializable {

    private final String id;
    private MetodoRecarga metodoRecarga;
    private LocalDate fechaRealizacion; 
    private Cuenta cuenta;
    private double abono;

    public Recarga(double abono, String id, MetodoRecarga metodoDeRecarga) {
        this.abono = abono;
        this.metodoRecarga = metodoDeRecarga;
        this.id = id;
        metodoRecarga.realizarTransaccion();
        fechaRealizacion = LocalDate.now();
    }

    public void recargar(Cuenta cuentaARecargar) {
        cuentaARecargar.actualizarSaldo(abono);
    }

    @Override
    public String toString() {
        return "[Recarga N. " + id
                + "] | (" + metodoRecarga + 
                "fecha de realización: " + fechaRealizacion + ")";
    }

}
