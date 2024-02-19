/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areaComun;
//import inmuebles.Inmueble;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
//import java.util.stream.Collectors;
/**
 *
 * @author Grupo 4
 */
public class Disponibilidad {
    private Date fechaInicio;
    private List<Reserva> listaReservas;
    private Date fechaFin;
    //private Inmueble areaComun;

    // Constructor
    public Disponibilidad(Date fechaInicio, Date fechaFin /*Inmueble areaComun*/) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        //this.areaComun = areaComun;
        this.listaReservas = new ArrayList<>();
    }

    // Método para agregar una reserva a la lista
    public void agregarReserva(Reserva reserva) {
        // Aquí deberías verificar si la reserva no entra en conflicto con otras reservas existentes
        if (verificarDisponibilidad(reserva.getFechaInicio(), reserva.getFechaFin())) {
            listaReservas.add(reserva);
            System.out.println("Reserva agregada con éxito.");
        } else {
            System.out.println("El área común no está disponible en las fechas seleccionadas.");
        }
    }

    // Método para verificar la disponibilidad
    public boolean verificarDisponibilidad(String nuevaFechaInicio, String nuevaFechaFin) {
        // Comprobar si hay alguna reserva en el rango de fechas dado
        for (Reserva reserva : listaReservas) {
            if (reserva.getFechaInicio().before(nuevaFechaFin) && reserva.getFechaFin().after(nuevaFechaInicio)) {
                // Las fechas se superponen, por lo tanto no hay disponibilidad
                return false;
            }
        }
        // Si llegamos aquí, significa que no hay reservas que se superponen
        return true;
    }

    // Método para obtener una reserva específica
    public Reserva obtenerReserva(int idReserva) {
        // Buscar una reserva con el ID proporcionado
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == idReserva) {
                return reserva;
            }
        }
        // Si no se encuentra la reserva, se retorna null o se podría lanzar una excepción
        return null;
    }

    // Getters y setters
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

    /*public Inmueble getAreaComun() {
        return areaComun;
    }

    public void setAreaComun(Inmueble areaComun) {
        this.areaComun = areaComun;
    }*/

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
}