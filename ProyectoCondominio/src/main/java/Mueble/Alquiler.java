package Mueble;

import Administracion.Perfil;

public class Alquiler {

    private int idAlquiler;
    private Perfil usuario;
    private boolean devolucion;
    private String tipoMueble;
    private double cantidad;
    private double precioTotal;
    private Fecha fechaInicio;
    private Fecha fechaFin;

    private Inventario inventario;

    public Alquiler() {
    }

    public Alquiler(int idAlquiler, Perfil usuario, boolean devolucion, String tipoMueble, double cantidad, double precioTotal, Fecha fechaInicio, Fecha fechaFin) {
        this.idAlquiler = idAlquiler;
        this.usuario = usuario;
        this.devolucion = devolucion;
        this.tipoMueble = tipoMueble;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void calcularTotal() {
        double precioMueble = 0.0;

        if (inventario != null && !inventario.listaMuebles.isEmpty()) {

            precioMueble = inventario.listaMuebles.verificarDisponibilidad(this.tipoMueble, this.cantidad);
        }

        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        precioTotal = cantidad * precioMueble;

    }

    public void getFechaFin() {

    }

}
