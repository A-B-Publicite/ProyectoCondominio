package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;

public class Multa extends ObligacionFinanciera implements Serializable {

    public Multa(double valorAlicuotaAtrasada, String descripcion, String id) {
        super(valorAlicuotaAtrasada, LocalDate.now(), descripcion, id);
    }

    @Override
    public double calcularMonto(double valorAlicuotaAtrasada) {
        return 10 + (valorAlicuotaAtrasada * 0.15);
    }

    @Override
    public String toString() {
        return "[Obligacion N. " + idObligacion
                + "] | Multa = ("
                + "Estado= " + estado
                + ", Monto= " + monto
                + ", Fecha de creacion= " + fechaCreacion
                + ", Descripcion= '" + descripcion + "')";
    }

}
