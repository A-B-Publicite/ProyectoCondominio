package ModuloMuebles;

import Administracion.Administrador;
import Administracion.Residente;
import static GUI.AdminGUI.GestionMueble.inventario;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo3
 */
public class AdministracionAlquiler implements Serializable {

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

//metodos de alquiler y devolucion/finalizacion
    public Alquiler alquilar(Administrador administrador, String tipoMueble, int cantidad, String correo, int dias) {
        Residente residente = administrador.getResidentePorCorreo(correo);
        Alquiler alquiler = new Alquiler(residente, tipoMueble, cantidad, dias);
        if (residente != null) {
            if (inventario.verificarDisponibilidad(tipoMueble, cantidad)) {
                double precioTotal = calcularPrecioTotal(tipoMueble, cantidad, dias);
                alquiler.setPrecioTotal(precioTotal);
                listaAlquileres.add(alquiler);
                inventario.actualizarDisponibilidad(tipoMueble, cantidad, false);
            }else{
                javax.swing.JOptionPane.showMessageDialog(null, "Cantidad de muebles no dispobles");
            }
        }
        return alquiler;
    }

    public double calcularPrecioTotal(String tipoMueble, int cantidad, int dias) {
        double precioMueble = inventario.consultarPrecio(tipoMueble);
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        return cantidad * precioMueble * dias;
    }
    
    public Alquiler finalizarAlquiler(int id) {        
        for (Alquiler alquiler : listaAlquileres) {
            if (id == alquiler.getIdAlquiler()) {
                alquiler.setFinalizado(true);
                inventario.actualizarDevolucion(alquiler.getTipoMueble(), alquiler.getCantidad(), true);
                return alquiler;
            }
        }
        return null;
    }

    public String imprimirAlquileresActivos() {
        String salida = "";
        if (estaVacia()) {
            return "Lista vacía";
        } else {
            for (Alquiler aux : listaAlquileres) {
                if (aux.isFinalizado() == false) {
                    salida += aux.toString();
                }
            }
            return salida;
        }
    }

    public String imprimirAlquileresFinalizados() {
        String salida = "";
        if (estaVacia()) {
            return "Lista vacía";
        } else {
            for (Alquiler aux : listaAlquileres) {
                if (aux.isFinalizado() == true) {
                    salida += aux.toString();
                }
            }
            return salida;
        }
    }

    @Override
    public String toString() {
        String salida = "Lista de Muebles Alquilados: ";
        if (estaVacia()) {
            return "Lista vacía";
        } else {
            for (Alquiler aux : listaAlquileres) {
                salida += aux.toString();
            }
            return salida;
        }
    }

}
