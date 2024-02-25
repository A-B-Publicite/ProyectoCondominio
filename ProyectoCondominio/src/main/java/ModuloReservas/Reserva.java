/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloReservas;
import Administracion.Perfil;

/**
 *
 * @author Grupo 4
 */
public class Reserva {
    private int id;
    private String dia;
    private String detalle;
    private Perfil usuario;
    private boolean cancelada;
    
    // Constructor con parámetros
    public Reserva(int id, String dia, String detalle, Perfil usuario) {
        this.id = id;
        this.dia = dia;
        this.detalle = detalle;
        this.usuario = usuario;
        this.cancelada = false;
    }

    // Método para cancelar la reserva
    public void cancelar() {
        this.cancelada = true; // Marca la reserva como cancelada
        System.out.println("Reserva cancelada.");
    }

    // Método para reprogramar la reserva
    public void reprogramar(String dia) {
        this.dia = dia;
        System.out.println("Reserva reprogramada para el dia: " + dia);
    }
    
    // Método para verificar si está cancelada la reserva
    public boolean estaCancelada() {
        return this.cancelada;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String Dia) {
        this.dia = dia;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Perfil getUsuario() {
        return usuario;
    }

    public void setUsuario(Perfil usuario) {
        this.usuario = usuario;
    }
}