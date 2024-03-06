
package Inmueble;

import Administracion.Servicio;
import ModuloMuebles.Mueble;

/**
 *
 * @author issac
 */
public class Mantenimiento {
    private static int contadorIds = 0;
    private Object objetoM;
    private int idAlquiler;
    private boolean finalizado = false;
    private int cantidad;
    private String ObjetoMantenimiento;
    private String tipoMantenimiento;
    private double precioTotal;
    Condominio condominio;
    Servicio servicio;
    
    public Mantenimiento(Condominio condominio){
        this.condominio=condominio;
    }

    public Mantenimiento() {
    }
    
    public void ActualizarMantenimiento(int idAlquiler, int cantidad, String ObjetoMantenimiento, String tipoMantenimiento, double precioTotal) {
        this.idAlquiler = idAlquiler;
        this.finalizado = true;
        this.ObjetoMantenimiento = ObjetoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        this.precioTotal = precioTotal;
        //servicio.ejecutarMantenimiento(cantidad, ObjetoMantenimiento); 
        
    }
    
    public void actualizar(Object objeto) {
        for(Object objetoMueblesInmuebles : condominio.getMueblesEInmuebles()) {
            if(objetoMueblesInmuebles.equals(objeto)) {
                if(objetoMueblesInmuebles instanceof Mueble) {
                    Mueble mueble = (Mueble) objetoMueblesInmuebles;
                    mueble.setNecesitaMantenimiento(false);
                } else if(objetoMueblesInmuebles instanceof InmuebleComun) {
                    InmuebleComun inmueble = (InmuebleComun) objetoMueblesInmuebles;
                    inmueble.setNecesitaMantenimiento(false);
                }
                objetoM=objeto;
            }
        }
    }

    public Object getObjetoM() {
        return objetoM;
    }

    
    public static int getContadorIds() {
        return contadorIds;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }
    
    public boolean isFinalizado() {
        return finalizado;
    }
    
    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }
    
    public String getTipoObjetoMantenimiento() {
        return ObjetoMantenimiento;
    }
    
    public double getPrecioTotal() {
        return precioTotal;
    }
    
    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }
    
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }
    
    public void setObjetoMantenimiento(String ObjetoMantenimiento) {
        this.ObjetoMantenimiento = ObjetoMantenimiento;
    }

    @Override
    public String toString() {
        StringBuilder EstadoMantenimiento = new StringBuilder();
        EstadoMantenimiento.append("---Mantenimiento---\n");
        EstadoMantenimiento.append("ID de Alquiler: ").append(idAlquiler).append("\n");
        EstadoMantenimiento.append("Finalizado: ").append(finalizado).append("\n");
        EstadoMantenimiento.append("ObjetoMantenimiento: ").append(ObjetoMantenimiento).append("\n");
        EstadoMantenimiento.append("tipoMantenimiento: ").append(tipoMantenimiento).append("\n");
        EstadoMantenimiento.append("Precio Total: ").append(precioTotal).append("\n");
        
        return EstadoMantenimiento.toString();
    }
    
    
    
}
