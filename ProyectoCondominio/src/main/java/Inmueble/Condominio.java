package Inmueble;

import Administracion.Residente;
import java.util.ArrayList;
import java.util.List;

public class Condominio {

    private String nombre;
    private List<InmuebleComun> listaInmueblesComunes;
    private List<Departamento> listaDepartamentos;
    private List<Residente> listaResidentes;
    
    public Condominio(String nombre) {
        this.nombre = nombre;
        listaInmueblesComunes = new ArrayList<>();
        listaDepartamentos = new ArrayList<>();
        listaResidentes = new ArrayList<>();
    }
    
    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        listaInmueblesComunes.add(inmueble);
    }
    public void agregarDepartamento(Departamento dpto) {//borrar si nadie le usa xd
        listaDepartamentos.add(dpto);
    }
    
    public void agregarResidente(Residente residente){
        listaResidentes.add(residente);
    }
    
    public void agregarPropiedadPrivada(int cantidad){
        listaDepartamentos = new ArrayList<>(cantidad);
        //falta llenar departamentos sin propietario
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