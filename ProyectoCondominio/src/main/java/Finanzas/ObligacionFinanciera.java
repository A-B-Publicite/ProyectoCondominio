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

public abstract class ObligacionFinanciera {
    private EstadoObligacion estado;
    private double monto;
    private LocalDate fechaCreacion;
    private String descripcion;
    private String idObligacion;

    public ObligacionFinanciera(double valor, LocalDate fechaCreacion, String descripcion, String idObligacion) {
        monto = calcularMonto(valor);
        this.fechaCreacion = fechaCreacion;
        estado = new EstadoPendiente();
        this.descripcion = descripcion;
        this.idObligacion = idObligacion;
    }

    public abstract double calcularMonto(double monto);
/// TODO otro constructor para la multa

    public void cambiarEstado() {
        estado.cambiarEstado(this);
    }


    public void setEstado(EstadoObligacion estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "id obligacion: " + idObligacion +
                ", estado = " + estado +
                ", monto= " + monto +
                ", fechaCreacion= " + fechaCreacion +
                ", descripcion= '" + descripcion + "'";
    }

    public double getMonto() {
        return monto;
    }

    public String getIdObligacion() {
        return idObligacion;
    }
}
