package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class ObligacionFinanciera implements Observable, Serializable {

    private List<GestorObligaciones> observadores = new ArrayList<>();
    protected EstadoObligacion estado;
    protected double monto;
    protected LocalDate fechaCreacion;
    protected String descripcion;
    protected String idObligacion;

    public ObligacionFinanciera(double valor, LocalDate fechaCreacion, String descripcion, String idObligacion) {
        monto = calcularMonto(valor);
        this.fechaCreacion = fechaCreacion;
        estado = new EstadoPendiente(this);
        this.descripcion = descripcion;
        this.idObligacion = idObligacion;
    }

    public abstract double calcularMonto(double valor);

    @Override
    public void notificarCambioEstado(ObligacionFinanciera obligacion) {
        for (GestorObligaciones observador : observadores) {
            observador.crearNuevaAlicuota(obligacion);
        }
    }

    public void agregarObservador(GestorObligaciones observador) {
        observadores.add(observador);
    }

    public void setEstado(EstadoObligacion estado) {
        this.estado = estado;
    }

    public EstadoObligacion getEstado() {
        return estado;
    }

    public double getMonto() {
        return monto;
    }

    public String getIdObligacion() {
        return idObligacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
