package Inmueble;

import Administracion.Perfil;
import Administracion.Residente;


import java.util.List;

public class Condominio {

    private List<InmuebleComun> listaInmueblesComunes;
    private List<Departamento> listaDepartamentos;
    private List<Residente> listaResidentes;

    public Condominio(String nombreCondominio) {
        
    }

    public Condominio(List<InmuebleComun> listaInmueblesComunes, List<Departamento> listaDepartamentos, List<Residente> listaResidentes) {
        this.listaInmueblesComunes = listaInmueblesComunes;
        this.listaDepartamentos = listaDepartamentos;
        this.listaResidentes = listaResidentes;
    }

  
    
    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        listaInmueblesComunes.add(inmueble);
    }
    public void agregarDepartamento(Departamento dpto) {
        listaDepartamentos.add(dpto);
    }
    
    public void agregarResidente(Residente residente){
        listaResidentes.add(residente);
    }
    
    public Departamento obtenerDepartamentoLibre(){
        Departamento departamentoLibre = null;
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getPropietario() == null) {
                departamentoLibre = departamento;
                break;
            }
        }
        return departamentoLibre;
    }
            
    public void setPropietarioADepartamento(Departamento departamentoLibre, Residente residenteNuevo){
        departamentoLibre.setPropietario(residenteNuevo);
    }
    
    public Residente obtenerResidente(String nombreResidente){
        Residente residente = null;
        for (Residente residenteI : listaResidentes) {
            if (residente.getNombreApellido().equals(nombreResidente)) {
                residente= residenteI;
                break;
            }
        }
        return residente;
    }
    

}