package ModuloReservas;

import Inmueble.*;
import Administracion.*;
import BD.*;
import java.io.Serializable;
import java.util.*;
import java.util.Random;

public class AdministrarReserva implements Serializable {

    ArrayList<Reserva> listaReservas = BaseDeDatos.leerReservas();

    // Método auxiliar para verificar el tipo de inmueble
    private boolean esTipo(InmuebleComun inmueble, int opcionReserva) {
        switch (opcionReserva) {
            case 0:
                return inmueble instanceof Cancha;
            case 1:
                return inmueble instanceof Gimnasio;
            case 2:
                return inmueble instanceof Piscina;
            case 3:
                return inmueble instanceof Terraza;
            case 4:
                return inmueble instanceof EspacioDeParqueadero;
            default:
                return false;
        }
    }

    public boolean realizarReserva(String detalleReserva, Administrador usuario, int opcionReserva, String diaReserva, String correo) {
        Residente residente = usuario.getResidentePorCorreo(correo);

        if (residente != null) {

            String tipoInmueble = null;

            switch (opcionReserva) {
                case 0:
                    tipoInmueble = "Cancha";
                    break;
                case 1:
                    tipoInmueble = "Gimnasio";
                    break;
                case 2:
                    tipoInmueble = "Piscina";
                    break;
                case 3:
                    tipoInmueble = "Terraza";
                    break;
                case 4:
                    tipoInmueble = "ParqueaderoComun";
                    break;
                default:
                    System.out.println("Caso no existe");
                    return false;
            }

            for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                if (esTipo(inmueble, opcionReserva)) {
                    Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                    if (disponibilidad.verificarDisponibilidad(diaReserva, this.listaReservas, tipoInmueble)) {
                        Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, tipoInmueble);
                        this.listaReservas.add(nuevaReserva);
                        BaseDeDatos.actualizarListaDeReservas(nuevaReserva);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean reprogramarReserva(int idReserva, String nuevoDia) {
        try {
            // Buscar la reserva con el ID dado
            for (int i = 0; i < listaReservas.size(); i++) {
                Reserva reserva = listaReservas.get(i);
                if (reserva.getId() == idReserva) {
                    // Reprogramar la reserva con el nuevo día
                    reserva.reprogramar(nuevoDia);
                    System.out.println(nuevoDia);
                    System.out.println(reserva.getDia() + " reserva " + reserva.getId());
                    // Actualizar la lista de reservas en la base de datos
                    BaseDeDatos.escribirReserva(reserva);
                    //BaseDeDatos.actualizarListaDeReservas(reserva);

                    return true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace(); // Manejo básico de excepciones para depuración
            return false;
        }
        return false;
    }

    public boolean cancelarReserva(int id) {
        // Verificar si el inmueble actual es una instancia de Cancha.
        for (Reserva reserva : listaReservas) {
            if (reserva.getId() == id) {
                reserva.cancelar();
                return true;
            }
        }
        return false;
    }

    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        int numero = rand.nextInt(90000) + 10000; // Genera un número aleatorio entre 10000 y 99999
        return numero;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Reserva reserva : listaReservas) {
            if (!reserva.estaCancelada()) {
                stringBuilder.append("Id reserva: ").append(reserva.getId()).append("\n")
                        .append("Espacio de reserva: ").append(reserva.getAreaComun()).append("\n")
                        .append("Usuario: ").append(reserva.getUsuario().getNombresCompletos()).append("\n")
                        .append("Detalle: ").append(reserva.getDetalle()).append("\n")
                        .append("Día de reserva: ").append(reserva.getDia()).append("\n")
                        .append("--------------------------------------------\n");
            }
        }
        return stringBuilder.toString();
    }

    // Método para imprimir las reservas canceladas
    public String imprimirReservasCanceladas() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Reserva reserva : listaReservas) {
            if (reserva.estaCancelada()) {
                stringBuilder.append("Id reserva: ").append(reserva.getId()).append("\n")
                        .append("Espacio de reserva: ").append(reserva.getAreaComun()).append("\n")
                        .append("Usuario: ").append(reserva.getUsuario().getNombresCompletos()).append("\n")
                        .append("Detalle: ").append(reserva.getDetalle()).append("\n")
                        .append("Día de reserva: ").append(reserva.getDia()).append("\n")
                        .append("--------------------------------------------\n");
            }
        }
        return stringBuilder.toString();
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

}
