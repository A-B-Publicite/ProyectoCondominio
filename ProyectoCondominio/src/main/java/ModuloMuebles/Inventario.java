package ModuloMuebles;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Grupo3
 */
public class Inventario implements Serializable {

    ArrayList<Mueble> listaMuebles;

    public Inventario() {
        listaMuebles = new <Mueble>ArrayList();
    }

    public Inventario(ArrayList<Mueble> listaMuebles) {
        this.listaMuebles = listaMuebles;
    }

    public void agregarMueble(Mueble mueble) {
        listaMuebles.add(mueble);
    }

    public ArrayList<Mueble> getListaMuebles() {
        return listaMuebles;
    }

    public void setListaMuebles(ArrayList<Mueble> listaMuebles) {
        this.listaMuebles = listaMuebles;
    }

    public boolean estaVacia() {
        return listaMuebles.isEmpty();
    }

    public boolean verificarDisponibilidad(String tipoMueble, int cantidad) {
        int count = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble) && mueble.isEstado()) {
                count++;
            }
            return count == cantidad;
        }
        return false;
    }

    public void actualizarDisponibilidad(String tipoMueble, int cantidad, boolean finalizacion) {
        int count = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble) && count <= cantidad) {
                count++;
                mueble.setEstado(finalizacion);
            }
        }
    }

}
