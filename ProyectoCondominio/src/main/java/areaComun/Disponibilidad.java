/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areaComun;
//import inmuebles.Inmueble;
import java.util.List;
import java.util.ArrayList;
//import java.util.stream.Collectors;
/**
 *
 * @author Grupo 4
 */
public class Disponibilidad {
    private AreaComun areaComun;
    private String dia;
    private List<Reserva> reservas;
    //private Inmueble areaComun;

    // Constructor
    public Disponibilidad(AreaComun areaComun, String Dia) {
        this.areaComun = areaComun;
        this.dia = dia;
        //this.listaReservas = new ArrayList<>();
    }

    // Método para agregar una reserva a la lista
    /*public void agregarReserva(Reserva reserva) {
        // Aquí deberías verificar si la reserva no entra en conflicto con otras reservas existentes
        if (verificarDisponibilidad(reserva.getFechaInicio(), reserva.getFechaFin())) {
            listaReservas.add(reserva);
            System.out.println("Reserva agregada con éxito.");
        } else {
            System.out.println("El área común no está disponible en las fechas seleccionadas.");
        }
    }*/

    // Método para verificar la disponibilidad
    public boolean verificarDisponibilidad(String dia) {
        List<Reserva> reservas = this.areaComun.consultarDisponibilidad();
        for (int i= 0; i<reserva.size(); i++){
            if (reserva[i] == dia) {
                return false;  // Hay un conflicto de reserva
            }
        }
        return true;  // No hay conflictos, está disponible
    }

    // Método para obtener una reserva específica
    /*public Reserva obtenerReserva(int idReserva) {
        //to do: jalar de Inmueble
        // Buscar una reserva con el ID proporcionado
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == idReserva) {
                return reserva;
            }
        }
        // Si no se encuentra la reserva, se retorna null o se podría lanzar una excepción
        return null;
    }*/
    
    // Método para eliminar una reserva
    public void eliminarReserva(Reserva reserva) {
        this.areaComun.eliminarReserva(reserva);
    }

    // Getters y setters
    public String getDia() {
        return dia;
    }

    public void setDia(String Dia) {
        this.dia = dia;
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