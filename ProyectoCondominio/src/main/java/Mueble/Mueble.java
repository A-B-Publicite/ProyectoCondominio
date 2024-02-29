package Mueble;
import java.time.LocalDate;

public abstract class Mueble {
    private boolean estado;
    private double precio;


    public Mueble(double precio) {
        this.estado = true;
        this.precio = precio;
    }



    public Mueble(float precio) {
        this.estado = true;
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}