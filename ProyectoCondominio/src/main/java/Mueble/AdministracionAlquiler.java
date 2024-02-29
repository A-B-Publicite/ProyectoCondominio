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

    public Alquiler devolverAlquiler(int id, Fecha fDevolucion) {
        for (Alquiler alquiler : listaAlquileres) {
            if (id == alquiler.getIdAlquiler()) {
                alquiler.getInventario().actualizarDisponibilidad(alquiler.getTipoMueble(), id, true);
            }
        }
        return null;
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
