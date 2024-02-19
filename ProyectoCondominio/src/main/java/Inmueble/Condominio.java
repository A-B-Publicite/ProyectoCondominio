package Inmueble;

import Administracion.Perfil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;

public class Condominio extends Inmueble {

    private List<InmuebleComun> listaInmuebles;
    private List<Departamento> listaDepartamentos;
    private List<Perfil> listaResidentes;

    public Condominio(String nombreCondominio) {
        
    }

    public Condominio(List<Inmueble> listaInmuebles, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
        this.listaInmuebles = listaInmuebles;
    }

    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmueble(Inmueble inmueble) {
        listaInmuebles.add(inmueble);
    }
    public void agregarResidente(Perfil perfil){
        listaResidentes.add(perfil);
    }
    
    

}