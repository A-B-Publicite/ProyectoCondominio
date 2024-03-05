package ModuloMuebles;

import Administracion.Administrador;
import Administracion.Residente;
import static GUI.AdminGUI.GestionMueble.inventario;
import java.io.Serializable;
import java.util.ArrayList;

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
        Residente residente = administrador.obtenerResidentePorCorreo(correo);
        Alquiler alquiler = new Alquiler(residente, tipoMueble, cantidad, dias);
        if (!estaVacia() && inventario.verificarDisponibilidad(tipoMueble, cantidad)) {
            double precioTotal = calcularPrecioTotal(tipoMueble, cantidad, dias);
            alquiler.setPrecioTotal(precioTotal);
            listaAlquileres.add(alquiler);
            inventario.actualizarDisponibilidad(tipoMueble, cantidad, false);
        }
        return alquiler;
    }

    public double calcularPrecioTotal(String tipoMueble, int cantidad, int dias) {
        double precioMueble = 0.0;
        if (!estaVacia()) {
            precioMueble = inventario.consultarPrecio(tipoMueble);
        }
        // Calcula el precio total multiplicando la cantidad por el precio de cada mueble
        return cantidad * precioMueble * dias;
    }

    //FINANZAS: cuando el estado del alquiler sea finalziado: true, puede acceder a cobrar el precioTotal
    public Alquiler finalizarAlquiler(int id, int diasAlquilados) {        
        for (Alquiler alquiler : listaAlquileres) {
            if (id == alquiler.getIdAlquiler()) {
                alquiler.setDias(diasAlquilados);//actualizar alquiler
                double totalAlquilado=calcularPrecioTotal(alquiler.getTipoMueble(), alquiler.getCantidad(), diasAlquilados);
                alquiler.setPrecioTotal(totalAlquilado);
                
                alquiler.setFinalizado(true);
                inventario.actualizarDisponibilidad(alquiler.getTipoMueble(), alquiler.getCantidad(), true);
                return alquiler;
            }
        }
        return null;
    }

    //alquileresFinalizados(false)
    
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
