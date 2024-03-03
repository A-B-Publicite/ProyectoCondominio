package ModuloMuebles;

import java.util.ArrayList;

public class Disponibilidad {

    private Mueble mueble;

    public Disponibilidad(Mueble mueble) {
        this.mueble = mueble;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public boolean verificarDisponibilidad(int dias, ArrayList<Alquiler> listaAlquileres, String tipoMueble, int cantidad) {

        int cantidadTotal = 0;

        for (Alquiler alquiler : listaAlquileres) {
            if (alquiler.getMueble().esTipo(tipoMueble)) {
                cantidadTotal += alquiler.getCantidad();
            }
        }

        int cantidadDisponible = mueble.getCantidad() - cantidadTotal;
        return cantidadDisponible >= cantidad;

    }

    public void actualizarDisponibilidad(ArrayList<Alquiler> listaAlquileres, String tipoMueble, int cantidad, boolean finalizacion) {
    }

}
