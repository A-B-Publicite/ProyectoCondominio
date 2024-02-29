package Mueble;
import java.time.LocalDate;
public class Mesa extends Mueble{

    public Mesa(boolean estado, float precio) {
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
