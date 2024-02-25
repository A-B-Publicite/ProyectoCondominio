/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class ObligacionFinanciera implements Observable, Serializable {
    private List<Cuenta> observadores = new ArrayList<>();
    protected EstadoObligacion estado;
    protected double monto;
    protected LocalDate fechaCreacion;
    protected String descripcion;
    protected String idObligacion;


    public ObligacionFinanciera(double valor, LocalDate fechaCreacion, String descripcion, String idObligacion) {
        //Valor corresponde a m2, valorBaseMulta
        monto = calcularMonto(valor);
        this.fechaCreacion = fechaCreacion;
        estado = new EstadoPendiente();
        this.descripcion = descripcion;
        this.idObligacion = idObligacion;
    }

    public void agregarObservador(Cuenta observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarCambioEstado(ObligacionFinanciera obligacion) {
        for (Cuenta observador : observadores) {
            observador.actualizar(obligacion);
        }
    }

    public EstadoObligacion getEstado() {
        return estado;
    }

    public abstract double calcularMonto(double valor);

    public void cambiarEstado(String senial) {
    }

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