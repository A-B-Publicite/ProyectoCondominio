package Inmueble;

import java.util.ArrayList;

public class GestorMantenimiento {
    private ArrayList<Mantenimiento> listaMantenimientos;
    private ArrayList<Mantenimiento> listaMantenimientosEsperados;

    public GestorMantenimiento() {
    }

    public ArrayList<Mantenimiento> getListaMantenimientos() {
        return listaMantenimientos;
    }

    public ArrayList<Mantenimiento> getListaMantenimientosEsperados() {
        return listaMantenimientosEsperados;
    }

    @Override
    public String toString() {
        String salida = "Historial de mantenimiento de ascensores: ";
        if (listaMantenimientosEsperados==null) {
            return "Lista vacía";
        } else {
            for (Mantenimiento aux : listaMantenimientosEsperados) {
                salida += aux.toString();
            }
            return salida;
        }    
    }


}
