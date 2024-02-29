package Mueble;
import java.time.LocalDate;
import java.util.Date;
public class Silla extends Mueble{

    public Silla(boolean estado, float precio) {
        super(estado, precio);
    }

    public boolean isEstado() {
        return estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
