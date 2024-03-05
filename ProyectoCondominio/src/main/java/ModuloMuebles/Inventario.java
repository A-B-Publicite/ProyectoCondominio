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

    public void agregarMueble(Mueble mueble, int cantidad, double precio) {
        mueble.setPrecio(precio);
        for (int i = 0; i < cantidad; i++) {
            listaMuebles.add(mueble);
        }
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

    public double consultarPrecio(String tipoMueble) {

        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble)) {
                return mueble.getPrecio();
            }
        }
        return 0.0;
    }
    
//    public int contarMesas() {
//        int cantidadMesas = 0;
//        for (Mueble mueble : listaMuebles) {
//            if (mueble instanceof Mesa) { // Asumiendo que tienes una clase Mesa
//                cantidadMesas++;
//            }
//        }
//        return cantidadMesas;
//    }
    public int contarMesas() {
        int cantidadMesas = 0;
        System.out.println("Lista de Muebles tiene: " + listaMuebles.size() + " elementos.");
        for (Mueble mueble : listaMuebles) {
            System.out.println("Revisando mueble: " + mueble.getClass().getSimpleName());
            if (mueble instanceof Mesa) {
                cantidadMesas++;
            }
        }
        System.out.println("Cantidad de Mesas encontradas: " + cantidadMesas);
        return cantidadMesas;
    }
    
    public int contarSillas() {
        int cantidadSillas = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Silla) { 
                cantidadSillas++;
            }
        }
        return cantidadSillas;
    }

    public int contarCarpas() {
        int cantidadCarpas = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Carpa) {
                cantidadCarpas++;
            }
        }
        return cantidadCarpas;
    }
        
    public int contarMesasReparar() {
        int cantidadMesasR = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Mesa && mueble.isMantenimiento()==true) { 
                cantidadMesasR++;
            }
        }
        return cantidadMesasR;
    }

    public int contarSillasReparar() {
        int cantidadSillasR = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Silla && mueble.isMantenimiento()==true) {
                cantidadSillasR++;
            }
        }
        return cantidadSillasR;
    }

    public int contarCarpasReparar() {
        int cantidadCarpasR = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Carpa && mueble.isMantenimiento()==true) {
                cantidadCarpasR++;
            }
        }
        return cantidadCarpasR;
    }

}
