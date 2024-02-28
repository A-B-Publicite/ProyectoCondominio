package Administracion;

import java.awt.PopupMenu;
import java.io.Serializable;
import java.time.LocalDate;


public class Contrato implements Serializable {
    private String fechaContrato;
    private Double precioContrato;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private boolean aprobacionNumero1;
    private boolean aprobacionNumero2;
    

    public Contrato(Double precioContrato, String descripcion, String fechaInicio, String fechaFin) {
        this.fechaContrato = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yy"));
        this.precioContrato = precioContrato;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aprobacionNumero1 = false;
        this.aprobacionNumero2 = false;

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

    public String getDescripcion() {
        return descripcion;
    }

    void darAprobacion() {
        if(!aprobacionNumero1){
            aprobacionNumero1 = true;
        } else {
            aprobacionNumero2 = true;
        }
    }


    
    
}
