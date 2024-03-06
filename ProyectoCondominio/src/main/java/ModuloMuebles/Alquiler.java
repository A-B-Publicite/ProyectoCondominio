package ModuloMuebles;

import Administracion.Perfil;
import Administracion.Residente;
import java.io.Serializable;

public class Alquiler implements Serializable {

    private static int contadorIds = 0;

    private int idAlquiler;
    private Residente usuario;
    private boolean finalizado;
    private String tipoMueble;
    private int cantidad;
    private double precioTotal;
    private int dias;

    public Alquiler() {
    }

    public Alquiler(Residente usuario, String tipoMueble, int cantidad, int dias) {
        this.idAlquiler = ++contadorIds;
        this.usuario = usuario;
        this.finalizado = false;
        this.tipoMueble = tipoMueble;
        this.cantidad = cantidad;
        this.precioTotal = 0;
        this.dias = dias;
    }

    public static int getContadorIds() {
        return contadorIds;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public Residente getUsuario() {
        return usuario;
    }

    public boolean isFinalizado() {
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

    public int getDias() {
        return dias;
    }

    public static void setContadorIds(int contadorIds) {
        Alquiler.contadorIds = contadorIds;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public void setUsuario(Residente usuario) {
        this.usuario = usuario;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
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

    public void setDias(int dias) {
        this.dias = dias;
    }

 

    @Override
    public String toString() {
        StringBuilder factura = new StringBuilder();
        factura.append("*** Factura de Alquiler ***\n");
        factura.append("ID de Alquiler: ").append(idAlquiler).append("\n");
        factura.append("Usuario: ").append(usuario.getNombresCompletos()).append("\n");
        factura.append("Tipo de Mueble: ").append(tipoMueble).append("\n");
        factura.append("Cantidad: ").append(cantidad).append("\n");
        //factura.append("Precio Unitario: ").append(precioTotal).append("\n");
        factura.append("Precio Total: ").append(precioTotal).append("\n");
        factura.append("Devolución: ").append(finalizado).append("\n");

        factura.append("***************************\n");

        return factura.toString();
    }

}
