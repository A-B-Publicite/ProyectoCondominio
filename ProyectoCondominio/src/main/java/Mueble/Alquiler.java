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

    public double calcularPrecioTotal(String tipo,int cantidad) {
        double precioMueble = 0.0;
        if (inventario != null && !inventario.listaMuebles.isEmpty()) {
            precioMueble = inventario.verificarDisponibilidad(tipo, cantidad);
        }
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        return  cantidad * precioMueble;
    }
    
    public int getIdAlquiler() {
        return idAlquiler;
    }

    public Perfil getUsuario() {
        return usuario;
    }

    public boolean isDevolucion() {
        return devolucion;
    }

    public String getTipoMueble() {
        return tipoMueble;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public void setUsuario(Perfil usuario) {
        this.usuario = usuario;
    }

    public void setDevolucion(boolean devolucion) {
        this.devolucion = devolucion;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }


    
   

    @Override
    public String toString() {
        return "Alquiler{" + "idAlquiler=" + idAlquiler + ", usuario=" + usuario + ", devolucion=" + devolucion + ", tipoMueble=" + tipoMueble + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", inventario=" + inventario + '}';
    }
    
    

}
