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
    private Servicio servicio;
    private Object objeto;
    

    public Contrato(Double precioContrato, String descripcion, String fechaInicio, String fechaFin, Object objeto) {
        this.fechaContrato = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yy"));
        this.precioContrato = precioContrato;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aprobacionNumero1 = false;
        this.aprobacionNumero2 = false;
        this.servicio = null;
        this.objeto = objeto;

    }

    public void iniciar() {
        this.servicio = new Servicio();
        servicio.ejecutar(objeto);
    }

    public void terminar() {
        servicio = null;
    }

    @Override
    public String toString() {
        return "Contrato{" + "fechaContrato=" + fechaContrato + ", precioContrato=" + precioContrato + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    public double getPrecioContrato() {
        return precioContrato;
    }

    public boolean compararDescripcion(String descripcionContratoAPagar) {
        if (descripcionContratoAPagar.equals(this.descripcion) ) {
            return true;
        }
        return false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void darAprobacion() {
        /*if(!aprobacionNumero1){
            aprobacionNumero1 = true;
        } else {
            aprobacionNumero2 = true;
        }*/
        aprobacionNumero1 = true;
        aprobacionNumero2 = true;

    }

    public boolean estaAprobado() {
       return aprobacionNumero1 && aprobacionNumero2;
    }
 
}
