package Mueble;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Mueble> listaMuebles = new ArrayList<>();

    public Inventario() {

    }

    public void agregarMueble(Mueble mueble) {
        listaMuebles.add(mueble);
    }

    public void verificarDisponibilidad(String tipoMueble, int cantidad) {

        switch (tipoMueble) {
            case "Carpa": {
                for (Mueble mueble : listaMuebles) {
                    System.out.println(mueble);
                    // Verificar si el inmueble actual es una instancia de Cancha.
                    if (mueble instanceof Carpa) {
                        mueble.getEstado();
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
                default: {
                    System.out.println("Caso no existe");
                    return false;
                }

    }

        
    

public void obtenerPrecio() {

    }
}
