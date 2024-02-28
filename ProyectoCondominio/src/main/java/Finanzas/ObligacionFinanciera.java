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
        //Valor corresponde a m2, valorBaseMulta
        monto = calcularMonto(valor);
        this.fechaCreacion = fechaCreacion;
        estado = new EstadoPendiente();
        this.descripcion = descripcion;
        this.idObligacion = idObligacion;
    }

    public void agregarObservador(GestorObligaciones observador) {
        observadores.add(observador);
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void notificarCambioEstado(ObligacionFinanciera obligacion) {
        for (GestorObligaciones observador : observadores) {
            observador.crearNuevaAlicuota(obligacion);
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
        return "ObligacionFinanciera{"
                + "estado=" + estado
                + ", monto=" + monto
                + ", fechaCreacion=" + fechaCreacion
                + ", descripcion='" + descripcion + '\''
                + ", idObligacion='" + idObligacion + '\''
                + '}';
    }
}
