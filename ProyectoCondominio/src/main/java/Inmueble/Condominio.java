package Inmueble;

import Administracion.Administrador;
import Administracion.Residente;
import java.util.ArrayList;
import java.util.List;

public class Condominio {

    private String nombre;
    private ArrayList<InmuebleComun> listaInmueblesComunes;
    private ArrayList<Departamento> listaDepartamentos;
    private ArrayList<Residente> listaResidentes;
    
    public Condominio(String nombre) {
        this.nombre = nombre;
        listaInmueblesComunes = new ArrayList<InmuebleComun>();
        listaDepartamentos = new ArrayList<Departamento>();
        listaResidentes = new ArrayList<Residente>();
    }
    
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        listaInmueblesComunes.add(inmueble);
    }
    
    public void agregarDepartamento(Departamento departamento) {
        listaDepartamentos.add(departamento);
    }
    
    public void agregarResidente(Residente residente){
        listaResidentes.add(residente);
    }
    
    //para crear la lista de departamentos vacia
    public void agregarPropiedadPrivada(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            listaDepartamentos.add(new Departamento(82));//se puede leer los metros cuadrados del .txt para que crear los departamentos con m2 distintos.
        }
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

    public void setAdmin(Administrador admin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}