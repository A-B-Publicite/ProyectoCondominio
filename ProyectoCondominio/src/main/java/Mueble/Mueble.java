package Mueble;
import java.time.LocalDate;

public abstract class Mueble {
    boolean estado;
    float precio;

    public Mueble(boolean estado, float precio) {
        this.estado = estado;
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public float getPrecio() {
        return precio;
    }
    
    
}