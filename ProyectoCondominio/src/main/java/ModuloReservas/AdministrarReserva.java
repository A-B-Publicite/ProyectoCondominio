package ModuloReservas;

import Inmueble.*;
import Administracion.*;
import java.io.Serializable;
import java.util.*;
import java.util.Random;

/**
 *
 * @author Grupo 4
 */
public class AdministrarReserva implements Serializable{

    ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();

    // Método para realizar una reserva
    public boolean realizarReserva(String detalleReserva, Administrador usuario, int opcionReserva, String diaReserva, String correo) {
        Residente residente = usuario.obtenerResidentePorCorreo(correo);
        System.out.println(opcionReserva);
        if (residente != null) {

            switch (opcionReserva) {
                case 0: {
                    System.out.println("Ingrese el dia de la reserva: ");
                    for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                        System.out.println(inmueble);
// Verificar si el inmueble actual es una instancia de Cancha.
                        if (inmueble instanceof Cancha) {
                            System.out.println(inmueble.toString());
                            Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                            if (disponibilidad.verificarDisponibilidad(diaReserva, this.listaReservas, "Cancha")) {
                                System.out.println("Ingrese el detalle de la reserva: ");
                                Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, "Cancha");
                                this.listaReservas.add(nuevaReserva);
                                return true;
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                        System.out.println(inmueble);
// Verificar si el inmueble actual es una instancia de Cancha.
                        if (inmueble instanceof Gimnasio) {
                            System.out.println(inmueble.toString());
                            Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                            if (disponibilidad.verificarDisponibilidad(diaReserva, this.listaReservas, "Gimnasio")) {
                                Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, "Gimnasio");
                                this.listaReservas.add(nuevaReserva);
                                return true;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                        System.out.println(inmueble);
                        // Verificar si el inmueble actual es una instancia de Cancha.
                        if (inmueble instanceof Piscina) {
                            System.out.println(inmueble.toString());
                            Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                            if (disponibilidad.verificarDisponibilidad(diaReserva, this.listaReservas, "Piscina")) {
                                Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, "Piscina");
                                this.listaReservas.add(nuevaReserva);
                                return true;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                        System.out.println(inmueble);
                        // Verificar si el inmueble actual es una instancia de Cancha.
                        if (inmueble instanceof Terraza) {
                            System.out.println(inmueble.toString());
                            Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                            if (disponibilidad.verificarDisponibilidad(diaReserva, this.listaReservas, "Terraza")) {
                                Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, "Terraza");
                                this.listaReservas.add(nuevaReserva);
                                return true;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                        System.out.println(inmueble);
                        // Verificar si el inmueble actual es una instancia de Cancha.
                        if (inmueble instanceof EspacioDeParqueadero) {
                            System.out.println(inmueble.toString());
                            Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                            if (disponibilidad.verificarDisponibilidad(diaReserva, this.listaReservas, "ParqueaderoComun")) {
                                Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, "ParqueaderoComun");
                                this.listaReservas.add(nuevaReserva);
                                return true;
                            }
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Caso no existe");
                    return false;
                }
            }
        }
        return false;
    }

    // Método para reprogramar una reserva
    public boolean reprogramarReserva(int id, String dia, Administrador administrador, int opcionReserva) {
        // Lógica para verificar si la reprogramación es posible
        //System.out.println("Reprogramando la reserva con ID: " + reserva.getId());

        switch (opcionReserva) {
            case 0: {
                for (InmuebleComun inmueble : administrador.getInmueblesComunes()) {
                    // Verificar si el inmueble actual es una instancia de Cancha.
                    if (inmueble instanceof Cancha) {
                        System.out.println(inmueble.toString());
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if (disponibilidad.verificarDisponibilidad(dia, this.listaReservas, "Cancha")) {
                            for (Reserva reserva : listaReservas) {
                                if (reserva.getId() == id) {
                                    reserva.reprogramar(dia);
                                }
                            }
                        }
                    }
                }
            }
            case 1: {
                for (InmuebleComun inmueble : administrador.getInmueblesComunes()) {
                    // Verificar si el inmueble actual es una instancia de Gimnasio
                    if (inmueble instanceof Gimnasio) {
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if (disponibilidad.verificarDisponibilidad(dia, this.listaReservas, "Gimnasio")) {
                            for (Reserva reserva : listaReservas) {
                                if (reserva.getId() == id) {
                                    reserva.reprogramar(dia);
                                }
                            }
                        }
                    }
                }
            }
            case 2: {
                for (InmuebleComun inmueble : administrador.getInmueblesComunes()) {
                    // Verificar si el inmueble actual es una instancia de Gimnasio
                    if (inmueble instanceof Piscina) {
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if (disponibilidad.verificarDisponibilidad(dia, this.listaReservas, "Piscina")) {
                            for (Reserva reserva : listaReservas) {
                                if (reserva.getId() == id) {
                                    reserva.reprogramar(dia);
                                }
                            }
                        }
                    }
                }
            }
            case 3: {
                for (InmuebleComun inmueble : administrador.getInmueblesComunes()) {
                    // Verificar si el inmueble actual es una instancia de Gimnasio
                    if (inmueble instanceof Terraza) {
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if (disponibilidad.verificarDisponibilidad(dia, this.listaReservas, "Terraza")) {
                            for (Reserva reserva : listaReservas) {
                                if (reserva.getId() == id) {
                                    reserva.reprogramar(dia);
                                }
                            }
                        }
                    }
                }
            }
            default: {
                System.out.println("Caso no existe");
            }
        }
        return false;
    }

    // Método para cancelar una reserva
    public boolean cancelarReserva(int id, Administrador administrador) {
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

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

}
