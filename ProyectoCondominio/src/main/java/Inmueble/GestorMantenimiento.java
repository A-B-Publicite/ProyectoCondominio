package Inmueble;

import java.util.ArrayList;

public class GestorMantenimiento {
    private ArrayList<Mantenimiento> listaMantenimientos;
    private ArrayList<Mantenimiento> listaMantenimientosEsperados;

    public GestorMantenimiento() {
        this.listaMantenimientos = new ArrayList<Mantenimiento>();
        this.listaMantenimientosEsperados = new ArrayList<Mantenimiento>();
    }
    
    public ArrayList<Mantenimiento> getListaMantenimientos() {
        return listaMantenimientos;
    }

    public ArrayList<Mantenimiento> getListaMantenimientosEsperados() {
        return listaMantenimientosEsperados;
    }

    public void setMantenimiento(Mantenimiento mantenimiento){
        listaMantenimientos.add(mantenimiento);
    }
    
    public String imprimirMantenimientos(){
         String salida = "Historial de mantenimiento de ascensores: \n";
        if (listaMantenimientos==null) {
            return "Lista vacía";
        } else {
            for (Mantenimiento aux : listaMantenimientos) {
                salida += aux.toString();
            }
            return salida;
        }  
    }
    public String imprimirMantenimientosEsperados(){
         String salida = "Historial de mantenimiento de ascensores: \n";
        if (listaMantenimientosEsperados==null) {
            return "Lista vacía";
        } else {
            for (Mantenimiento aux : listaMantenimientosEsperados) {
                salida += aux.toString();
            }
            return salida;
        }  
    }
    @Override
    public String toString() {
        String salida = "Historial de mantenimiento de ascensores: \n";
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
