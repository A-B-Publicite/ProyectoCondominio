package Inmueble;

import Administracion.Perfil;


import java.util.List;

public class Condominio extends Inmueble {

    private List<InmuebleComun> listaInmueblesComunes;
    private List<Departamento> listaDepartamentos;
    private List<Perfil> listaResidentes;

    public Condominio(String nombreCondominio) {
        
    }

    public Condominio(List<InmuebleComun> listaInmueblesComunes, List<Departamento> listaDepartamentos, List<Perfil> listaResidentes, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
        this.listaInmueblesComunes = listaInmueblesComunes;
        this.listaDepartamentos = listaDepartamentos;
        this.listaResidentes = listaResidentes;
    }

    
    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmuebleComun(Inmueble inmueble) {
        listaInmueblesComunes.add((InmuebleComun) inmueble);
    }
    public void agregarResidente(Perfil perfil){
        listaResidentes.add(perfil);
    }
    
    

}