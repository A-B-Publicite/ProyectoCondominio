/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areaComun;

/**
 *
 * @author Grupo 4
 */


public class AdministrarReserva {

    // Constructor sin argumentos, ya que no se especificaron atributos para esta clase en el diagrama
    public AdministrarReserva() {
        // Aquí podrías inicializar recursos si fuera necesario
    }

    // Método para realizar una reserva
    // Asumiendo que se pasa la reserva ya creada con toda la información necesaria
    public Reserva realizarReserva(AreaComun areaComun, String dia, String detalle, Usuario usuario) {
        Disponibilidad disponibilidad = areaComun.consultarDisponibilidad();
        
        if (disponibilidad.verificarDisponibilidad(dia)) {
            Reserva nuevaReserva = new Reserva(0, dia, detalle, usuario); // El ID podría asignarse de forma dinámica o mediante una base de datos
            disponibilidad.agregarReserva(nuevaReserva);
            areaComun.agregarReserva(nuevaReserva); // Agrega la reserva también a la lista de reservas del área común
            return nuevaReserva;
        } else {
            return null;  // No se puede realizar la reserva debido a un conflicto
        }
    }

    // Método para reprogramar una reserva
    // Este método podría ser llamado con la reserva que se desea cambiar y las nuevas fechas
    public void reprogramarReserva(Reserva reserva, Date nuevaFechaInicio, Date nuevaFechaFin) {
        // Lógica para verificar si la reprogramación es posible
        // Por ejemplo, podrías necesitar verificar la disponibilidad antes de realizar el cambio
        System.out.println("Reprogramando la reserva con ID: " + reserva.getId());
        // Suponiendo que tienes un método verificarDisponibilidad() que determina si las fechas están disponibles
        boolean disponible = verificarDisponibilidad(nuevaFechaInicio, nuevaFechaFin);
        if (disponible) {
            reserva.setFechaInicio(nuevaFechaInicio);
            reserva.setFechaFin(nuevaFechaFin);
            System.out.println("La reserva ha sido reprogramada con éxito.");
        } else {
            System.out.println("No se puede reprogramar la reserva, las fechas no están disponibles.");
        }
    }

    // Método para cancelar una reserva
    public void cancelarReserva(Reserva reserva) {
        // La lógica de cancelación podría implicar más que simplemente llamar a un método cancelar
        // Por ejemplo, podrías necesitar actualizar el estado en una base de datos y notificar al usuario
        reserva.cancelar();
        System.out.println("La reserva con ID: " + reserva.getId() + " ha sido cancelada.");
    }
    
    // Método adicional para verificar la disponibilidad, asumiendo que necesitas tal funcionalidad
    private boolean verificarDisponibilidad(Date nuevaFechaInicio, Date nuevaFechaFin) {
        // Implementación de la lógica para verificar la disponibilidad de las fechas
        // Esto es solo un placeholder, en un entorno real se conectaría con el sistema de reservas/disponibilidad
        return true; // Devuelve true como ejemplo, debería comprobar la disponibilidad real
    }
}