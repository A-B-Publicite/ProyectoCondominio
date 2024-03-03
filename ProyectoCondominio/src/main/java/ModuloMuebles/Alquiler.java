package ModuloMuebles;

import Administracion.Perfil;
import java.io.Serializable;

public class Alquiler implements Serializable {

    private static int contadorIds = 0;

    private int idAlquiler;
    private Perfil administrador;
    private boolean finalizado;
    private String tipoMueble;
    private int cantidad;
    private double precioTotal;
    private Fecha fechaInicio;
    private Fecha fechaFin;

    public Alquiler() {
    }

    public Alquiler(Perfil usuario, String tipoMueble, int cantidad, Fecha fechaInicio, Fecha fechaFin) {
        this.idAlquiler = ++contadorIds;
        this.administrador = usuario;
        this.finalizado = false;
        this.tipoMueble = tipoMueble;
        this.cantidad = cantidad;
        this.precioTotal = 0;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public Perfil getUsuario() {
        return administrador;
    }

    public boolean isDevolucion() {
        return finalizado;
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
    
    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public void setUsuario(Perfil usuario) {
        this.administrador = usuario;
    }

    public void setDevolucion(boolean devolucion) {
        this.finalizado = devolucion;
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

    @Override
    public String toString() {
        StringBuilder factura = new StringBuilder();
        factura.append("******************* Factura de Alquiler *******************\n");
        factura.append("ID de Alquiler: ").append(idAlquiler).append("\n");
        factura.append("Fecha de Inicio: ").append(fechaInicio).append("\n");
        factura.append("Fecha de Fin: ").append(fechaFin).append("\n");
        factura.append("Usuario: ").append(administrador).append("\n");
        factura.append("Tipo de Mueble: ").append(tipoMueble).append("\n");
        factura.append("Cantidad: ").append(cantidad).append("\n");
        factura.append("Precio Unitario: ").append(precioTotal).append("\n");
        factura.append("Precio Total: ").append(precioTotal).append("\n");
        factura.append("Devolución: ").append(finalizado).append("\n");

        factura.append("*******************************************************");

        return factura.toString();
    }

}
