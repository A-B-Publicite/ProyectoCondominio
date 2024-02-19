/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areaComun;
//import administracion.Perfil;

import java.util.Date;

/**
 *
 * @author Grupo 4
 */
public class Reserva {
    private int id;
    private String fechaInicio;
    private String fechaFin;
    private String detalle;
    private String usuario;

    // Constructor con parámetros
    public Reserva(int id, String fechaInicio, String fechaFin, String detalle, String usuario) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.detalle = detalle;
        this.usuario = usuario;
    }

    // Método para cancelar la reserva
    public void cancelar() {
        this.fechaInicio = "0";
        this.fechaFin = "0";
        // Por ejemplo, podrías cambiar un estado de la reserva a "cancelado"
        System.out.println("Reserva cancelada.");
    }

    // Método para reprogramar la reserva
    public void reprogramar(String nuevaFechaInicio, String nuevaFechaFin) {
        // Lógica para reprogramar la reserva
        // Necesitarías verificar que las nuevas fechas son válidas y no entran en conflicto con otras reservas
        this.fechaInicio = nuevaFechaInicio;
        this.fechaFin = nuevaFechaFin;
        System.out.println("Reserva reprogramada para el rango: " + nuevaFechaInicio + " - " + nuevaFechaFin);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /*public Perfil getUsuario() {
        return usuario;
    }

    public void setUsuario(Perfil usuario) {
        this.usuario = usuario;
    }*/
}