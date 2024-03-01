package ModuloMuebles;

import Administracion.Perfil;
import java.io.Serializable;

/**
 *
 * @author Grupo3
 */
public class Alquiler implements Serializable {

    private static int contadorIds = 0;

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

    public Alquiler(Perfil usuario, String tipoMueble, int cantidad, Fecha fechaInicio, Fecha fechaFin) {
        this.idAlquiler = ++contadorIds;
        this.usuario = usuario;
        this.devolucion = false;
        this.tipoMueble = tipoMueble;
        this.cantidad = cantidad;
        this.precioTotal = 0;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.inventario = null;
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

    public boolean alquilar() {
        double precioMueble = 0.0;

        if (inventario != null && !inventario.estaVacia()) {

            precioMueble = inventario.verificarDisponibilidad(this.tipoMueble, this.cantidad);
            inventario.actualizarDisponibilidad(this.tipoMueble, this.cantidad, this.devolucion);
        }
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        precioTotal = cantidad * precioMueble;
        return precioTotal != 0;
    }

    public double calcularPrecioTotal(String tipo, int cantidad) {
        double precioMueble = 0.0;
        if (inventario != null && !inventario.listaMuebles.isEmpty()) {
            precioMueble = inventario.verificarDisponibilidad(tipo, cantidad);
        }
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        return cantidad * precioMueble;
    }

    @Override
    public String toString() {
        StringBuilder factura = new StringBuilder();
        factura.append("******************* Factura de Alquiler *******************\n");
        factura.append("ID de Alquiler: ").append(idAlquiler).append("\n");
        factura.append("Fecha de Inicio: ").append(fechaInicio).append("\n");
        factura.append("Fecha de Fin: ").append(fechaFin).append("\n");
        factura.append("Usuario: ").append(usuario).append("\n");
        factura.append("Tipo de Mueble: ").append(tipoMueble).append("\n");
        factura.append("Cantidad: ").append(cantidad).append("\n");
        factura.append("Precio Unitario: ").append(calcularPrecioTotal(tipoMueble, cantidad)).append("\n");
        factura.append("Precio Total: ").append(precioTotal).append("\n");
        factura.append("Devolución: ").append(devolucion).append("\n");

        factura.append("*******************************************************");

        return factura.toString();
    }

}
