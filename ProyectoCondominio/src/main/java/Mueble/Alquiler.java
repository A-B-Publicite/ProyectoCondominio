package Mueble;

import Administracion.Perfil;
import Administracion.Fecha;

/**
 *
 * @author kedos
 */
public class Alquiler {

    private int idAlquiler;
    private Perfil usuario;
    private boolean devolucion;
    private float precioTotal;
    private Fecha fechaInicio;
    private Fecha fechaFin;

    public Alquiler() {
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Perfil getUsuario() {
        return usuario;
    }

    public void setUsuario(Perfil usuario) {
        this.usuario = usuario;
    }

    public boolean isDevolucion() {
        return devolucion;
    }

    public void setDevolucion(boolean devolucion) {
        this.devolucion = devolucion;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    

    public void calcularTotal() {

    }

    public void getFechaFin() {

    }

}
