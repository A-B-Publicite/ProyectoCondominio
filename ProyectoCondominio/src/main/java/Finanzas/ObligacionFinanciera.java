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
    protected EstadoObligacion estado;
    protected double monto;
    protected LocalDate fechaCreacion;
    protected String descripcion;
    protected String idObligacion;

    public ObligacionFinanciera(double valor, LocalDate fechaCreacion, String descripcion, String idObligacion) {
        //Valor corresponde a m2, valorMulta, valorCuota.
        monto = calcularMonto(valor);
        this.fechaCreacion = fechaCreacion;
        estado = new EstadoPendiente();
        this.descripcion = descripcion;
        this.idObligacion = idObligacion;
    }

    public EstadoObligacion getEstado() {
        return estado;
    }

    public abstract double calcularMonto(double monto);

    public abstract void cambiarEstado(String senial);

    public void setEstado(EstadoObligacion estado) {
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public String getIdObligacion() {
        return idObligacion;
    }

    @Override
    public String toString() {
        return "ObligacionFinanciera{" +
                "estado=" + estado +
                ", monto=" + monto +
                ", fechaCreacion=" + fechaCreacion +
                ", descripcion='" + descripcion + '\'' +
                ", idObligacion='" + idObligacion + '\'' +
                '}';
    }
}