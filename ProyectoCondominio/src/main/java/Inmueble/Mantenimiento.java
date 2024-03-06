/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

import Administracion.Servicio;

/**
 *
 * @author issac
 */
public class Mantenimiento {
    private static int contadorIds = 0;
    
    private int idAlquiler;
    private boolean finalizado = false;
    private int cantidad;
    private String ObjetoMantenimiento;
    private String tipoMantenimiento;
    private double precioTotal;
    Condominio condominio;
    Servicio servicio;
    
    public Mantenimiento(){
    }

    public Mantenimiento(int idAlquiler, boolean finalizado, int cantidad, String ObjetoMantenimiento, String tipoMantenimiento, double precioTotal) {
        this.idAlquiler = ++idAlquiler;
        this.finalizado = finalizado;
        this.cantidad = cantidad;
        this.ObjetoMantenimiento = ObjetoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        this.precioTotal = precioTotal;
    }
    
    public void ActualizarMantenimiento(int idAlquiler, int cantidad, String ObjetoMantenimiento, String tipoMantenimiento, double precioTotal) {
        this.idAlquiler = idAlquiler;
        this.finalizado = true;
        this.ObjetoMantenimiento = ObjetoMantenimiento;
        this.tipoMantenimiento = tipoMantenimiento;
        this.precioTotal = precioTotal;
        servicio.ejecutarMantenimiento(cantidad, ObjetoMantenimiento); 
        
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
