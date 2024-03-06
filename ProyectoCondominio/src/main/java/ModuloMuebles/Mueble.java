package ModuloMuebles;

import java.io.Serializable;

/**
 *
 * @author Grupo3 hola
 */
public abstract class Mueble implements Serializable {

    private boolean estado;
    private double precio;
    private boolean necesitaMantenimiento;
    
    public Mueble(double precio) {
        this.estado = true;
        this.precio = precio;
        this.necesitaMantenimiento = false;
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

    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }

    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }



    public abstract boolean esTipo(String tipo);

    @Override
    public String toString() {
        return "Mueble{" + "estado=" + estado + ", precio=" + precio + ", necesitaMantenimiento=" + necesitaMantenimiento + '}';
    }
    
    
}
