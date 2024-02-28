package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;

public class Multa extends ObligacionFinanciera {


    public Multa(double valorAlicuotaAtrasada, String descripcion, String id) {
        super(valorAlicuotaAtrasada, LocalDate.now(), descripcion, id);
    }
    @Override
    public void cambiarEstado(String senial) {
        estado.cambiarEstado(this, senial);
    }
    @Override
    public double calcularMonto(double valorAlicuotaAtrasada) {
        return valorAlicuotaAtrasada * 2.25;
    }

    @Override
    public String toString() {
        return "[Obligacion N. " + idObligacion +
                "] | Multa = (" +
                ", estado= " + estado +
                ", monto= " + monto +
                ", fechaCreacion= " + fechaCreacion +
                ", descripcion= '" + descripcion + "')";
    }

}
