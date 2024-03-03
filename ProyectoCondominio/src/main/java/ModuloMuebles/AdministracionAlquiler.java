package ModuloMuebles;

import Administracion.Administrador;
import Administracion.Residente;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Grupo3
 */
public class AdministracionAlquiler implements Serializable {

    ArrayList<Alquiler> listaAlquileres;
    Disponibilidad disponibilidad;

    public AdministracionAlquiler() {
        listaAlquileres = new <Alquiler>ArrayList();
    }

    public AdministracionAlquiler(ArrayList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public void agregarAlquiler(Alquiler alquiler) {
        listaAlquileres.add(alquiler);
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

    public boolean alquilar() {
        double precioMueble = 0.0;

        if (inventario != null && !inventario.estaVacia()) {

            precioMueble = inventario.verificarDisponibilidad(this.tipoMueble, this.cantidad);
            inventario.actualizarDisponibilidad(this.tipoMueble, this.cantidad, this.finalizado);
        }
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        precioTotal = cantidad * precioMueble;
        return precioTotal != 0;
    }

    public double calcularPrecioTotal(String tipo, int cantidad) {
        double precioMueble = 0.0;
        if (inventario != null && !inventario.listaMuebles.isEmpty()) {
            precioMueble = inventario.verificarDisponibilidad(tipo, cantidad);
        }
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        return cantidad * precioMueble;
    }
    
    public boolean realizarAlquiler(Administrador usuario, String tipoMueble, int cantidad, Fecha fInicio, Fecha fFin, String correo) {
        Residente residente = usuario.obtenerResidentePorCorreo(correo);
        Alquiler alquiler = new Alquiler(residente, tipoMueble, cantidad, fInicio, fFin);
        if (alquiler.alquilar()) {
            listaAlquileres.add(alquiler);
            return true;
        }
        return false;
    }

    public Alquiler devolverAlquiler(int id, Fecha fDevolucion) {
        Alquiler alquilerDevuelto = null;
        boolean flag = false;
        for (Alquiler alquiler : listaAlquileres) {
            if (id == alquiler.getIdAlquiler()) {
                //comparar fechas
                if (alquiler.getFechaFin().getAnio() <= fDevolucion.getAnio()) {
                    flag = true;
                }
            } else {
                return null;
            }
            if (flag) {
                alquiler.getInventario().actualizarDisponibilidad(alquiler.getTipoMueble(), id, true);
            }

        }
        return alquilerDevuelto;
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
