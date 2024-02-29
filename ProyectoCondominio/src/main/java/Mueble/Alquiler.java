package Mueble;

import Administracion.Perfil;

public class Alquiler {

    private int idAlquiler;
    private Perfil usuario;
    private boolean devolucion;
    private String tipoMueble;
    private int cantidad;
    private double precioTotal;
    private Fecha fechaInicio;
    private Fecha fechaFin;

    private Inventario inventario;

    public Alquiler() {
    }

    public Alquiler(int idAlquiler, Perfil usuario, String tipoMueble, int cantidad, Fecha fechaInicio, Fecha fechaFin) {
        this.idAlquiler = idAlquiler;
        this.usuario = usuario;
        this.devolucion = false;
        this.tipoMueble = tipoMueble;
        this.cantidad = cantidad;
        this.precioTotal = 0;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.inventario = null;
    }

    public boolean alquilar() {
        double precioMueble = 0.0;

        if (inventario != null && !inventario.listaMuebles.isEmpty()) {

            precioMueble = inventario.verificarDisponibilidad(this.tipoMueble, this.cantidad);
            inventario.actualizarDisponibilidad(this.tipoMueble, this.cantidad, this.devolucion);
        }

        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        precioTotal = cantidad * precioMueble;
        return precioTotal!=0;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
   

    @Override
    public String toString() {
        return "Alquiler{" + "idAlquiler=" + idAlquiler + ", usuario=" + usuario + ", devolucion=" + devolucion + ", tipoMueble=" + tipoMueble + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", inventario=" + inventario + '}';
    }
    
    

}
