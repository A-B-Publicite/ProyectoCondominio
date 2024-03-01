package ModuloMuebles;

import java.io.Serializable;

public class Carpa extends Mueble implements Serializable {

    public Carpa(double precio) {
        super(precio);
    }

    @Override
    public void setMantenimiento(boolean mantenimiento) {
        super.setMantenimiento(mantenimiento);
    }

    @Override
    public boolean isMantenimiento() {
        return super.isMantenimiento();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setEstado(boolean estado) {
        super.setEstado(estado);
    }

    @Override
    public boolean isEstado() {
        return super.isEstado();
    }

}
