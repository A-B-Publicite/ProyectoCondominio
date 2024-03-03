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
            if (mueble.esTipo(tipoMueble)) {
                count ++;
            }
        }
        return count >= cantidad;
    }

    public void actualizarDisponibilidad(String tipoMueble, int cantidad, boolean finalizacion) {
        switch (tipoMueble) {
            case "Carpa" -> {
                int count1 = 0;
                int count2 = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Carpa) {
                        if (mueble.isEstado()) {
                            if (count1 < cantidad && devolucion == false) {
                                count1++;
                                mueble.setEstado(false);
                            }
                        } else {
                            if (count2 < cantidad && devolucion == true) {
                                count2++;
                                mueble.setEstado(true);
                            }
                        }
                    }
                }
                break;
            }
            case "Silla" -> {
                int count1 = 0;
                int count2 = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Silla) {
                        if (mueble.isEstado()) {
                            if (count1 < cantidad && devolucion == false) {
                                count1++;
                                mueble.setEstado(false);
                            }
                        } else {
                            if (count2 < cantidad && devolucion == true) {
                                count2++;
                                mueble.setEstado(true);
                            }
                        }
                    }
                }
                break;
            }
            case "Mesa" -> {
                int count1 = 0;
                int count2 = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble.isEstado()) {
                        if (count1 < cantidad && devolucion == false) {
                            count1++;
                            mueble.setEstado(false);
                        }
                    } else {
                        if (count2 < cantidad && devolucion == true) {
                            count2++;
                            mueble.setEstado(true);
                        }
                    }
                }
                break;
            }
        }
    }
}
