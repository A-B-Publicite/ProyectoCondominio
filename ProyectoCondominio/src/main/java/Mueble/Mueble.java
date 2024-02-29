package Mueble;
import java.time.LocalDate;

public abstract class Mueble {
    private boolean estado;
    private double precio;

    public Mueble(boolean estado, float precio) {
        this.estado = estado;
        this.precio = precio;
    }

}