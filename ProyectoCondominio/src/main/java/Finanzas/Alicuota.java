/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
import java.time.LocalDate;

public class Alicuota extends ObligacionFinanciera {
    protected LocalDate fechaLimite;
    public Alicuota(double metrosCuadrados, String descripcion, String id) {
        super(metrosCuadrados, LocalDate.now(), descripcion, id);
        fechaLimite = LocalDate.now().plusDays(30);
    }

    @Override
    public double calcularMonto(double metrosCuadrados) {
        return metrosCuadrados * 0.25;
    }


    @Override
    public String toString() {
        return "[Obligacion N. " + idObligacion +
                "] | Alicuota = (" +
                "fechaLimite= " + fechaLimite +
                ", estado= " + estado +
                ", monto= " + monto +
                ", fechaCreacion= " + fechaCreacion +
                ", descripcion= '" + descripcion + "')";
    }
}
