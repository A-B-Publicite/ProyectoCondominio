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
    private Date fechaInicio;
    private Date fechaFin;
    private String detalle;
    //private Perfil usuario;

    // Constructor con parámetros
    public Reserva(int id, Date fechaInicio, Date fechaFin, String detalle /*Perfil usuario*/) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.detalle = detalle;
        //this.usuario = usuario;
    }

    // Método para cancelar la reserva
    public void cancelar() {
        // Lógica para cancelar la reserva
        // Por ejemplo, podrías cambiar un estado de la reserva a "cancelado"
        System.out.println("Reserva cancelada.");
    }

    // Método para reprogramar la reserva
    public void reprogramar(Date nuevaFechaInicio, Date nuevaFechaFin) {
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
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

