package Mueble;

import Administracion.Administrador;
import Administracion.Residente;
import java.util.ArrayList;

public class AdministracionAlquiler {

    ArrayList<Alquiler> listaAlquileres;
   
    public AdministracionAlquiler() {
        listaAlquileres = new <Alquiler>ArrayList();
    }

    public AdministracionAlquiler(ArrayList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(ArrayList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public boolean estaVacia() {
        return listaAlquileres.isEmpty();
    }

    public void add(Alquiler alquiler) {
        listaAlquileres.add(alquiler);
    }

    public boolean realizarAlquiler(int id, Administrador usuario,String tipoMueble, int cantidad, Fecha fInicio,Fecha fFin, String correo){
        Residente residente = usuario.obtenerResidentePorCorreo(correo);
        Alquiler alquiler=new Alquiler(id, residente, tipoMueble, cantidad, fInicio,  fFin);
        if(alquiler.alquilar()){
            listaAlquileres.add(alquiler);
            return true;
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

    public void verificarDevolucion() {

    }

    @Override
    public String toString() {
        String salida = "Lista de Muebles Alquilados: ";
        int i = 1;
        if (estaVacia()) {
            return "Lista vacía";
        } else {
            for (Alquiler aux : listaAlquileres) {
                salida += "\nAlquiler " + i;
                salida += aux.toString();
                i++;
            }
            return salida;
        }
    }

}
