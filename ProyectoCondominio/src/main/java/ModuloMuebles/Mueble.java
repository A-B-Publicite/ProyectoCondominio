package ModuloMuebles;

import java.io.Serializable;

/**
 *
 * @author Grupo3
 */
public abstract class Mueble implements Serializable {

    private boolean estado;
    private double precio;
    private boolean mantenimiento;

    public Mueble(double precio) {
        this.estado = true;
        this.precio = precio;
        this.mantenimiento = true;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    
}
