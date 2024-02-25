package Administracion;

import java.io.Serializable;
import java.time.LocalDate;


public class Contrato implements Serializable {
    private LocalDate fechaContrato;
    private double precioContrato;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    

    public Contrato(LocalDate fechaContrato, double precioContrato, String descripcion, String fechaInicio, String fechaFin) {
        this.fechaContrato = fechaContrato;
        this.precioContrato = precioContrato;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        
        
    }

    public void iniciar() {
        System.out.print("Se inicio el contrato");
    }

    public void terminar() {
        System.out.print("Se termino el contrato");
    }

    @Override
    public String toString() {
        return "Contrato{" + "fechaContrato=" + fechaContrato + ", precioContrato=" + precioContrato + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    public void pagar(){
        System.out.print("Se pago el contrato");
    }
    public double getPrecioContrato() {
        return precioContrato;
    }

    boolean compararDescripcion(String descripcionContratoAPagar) {
        return (descripcion == null ? descripcionContratoAPagar == null : descripcion.equals(descripcionContratoAPagar));
    }
    
    
}
