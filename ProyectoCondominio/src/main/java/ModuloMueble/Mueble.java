
package ModuloMueble;
import java.time.LocalDate;

public class Mueble {
    public String tipo;
    public int cantidad;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    
    // Constructor
    public Mueble(String tipo, int cantidad,LocalDate fechaInicio, LocalDate fechaFinal) {
    	 this.tipo = tipo;
         this.cantidad = cantidad;
         this.fechaInicio = fechaInicio;
         this.fechaFinal = fechaFinal;
    }

    // Métodos getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


}
