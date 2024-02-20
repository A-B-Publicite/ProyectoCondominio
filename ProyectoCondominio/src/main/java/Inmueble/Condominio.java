package Inmueble;

import Administracion.Administrador;
import Administracion.Residente;
import java.util.ArrayList;
import java.util.List;

public class Condominio {

    private String nombre;
    private ArrayList<InmuebleComun> inmueblesComunes;
    private ArrayList<InmueblePrivado> departamentos;
    
    public Condominio(String nombreCondominio) {
        this.nombre = nombreCondominio;
        inmueblesComunes = new ArrayList<InmuebleComun>();
        departamentos = new ArrayList<Departamento>();
    }
        
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        listaInmueblesComunes.add(inmueble);
    }
        
    //para crear la lista de departamentos vacia
    public void agregarPropiedadPrivada(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Departamento departamentonuevo = new Departamento(82);
            listaInmueblesPrivados.add(departamentonuevo);
        }
    }
    
    public Departamento obtenerDepartamentoLibre(){
        Departamento departamentoLibre = null;
        for (Departamento departamento : departamentos) {
            if (departamento.getPropietario() == null) {
                departamentoLibre = departamento;
                return departamentoLibre;
            }
        }
        return null;
    }
            
    public void setPropietarioADepartamento(Departamento departamentoLibre, Residente residenteNuevo){
        departamentoLibre.setPropietario(residenteNuevo);
    }
    
    public Residente obtenerResidente(String nombreResidente){
        Residente residente = null;
        for (Departamento departamento : departamentos) {
            if (departamento.getPropietario().getNombre() == nombreResidente) {
                return departamento.getPropietario();
            }
        }
<<<<<<< HEAD
        return null
=======
        return residente;
    }

    public void setAdmin(Administrador admin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
>>>>>>> f3fa82989f16089475cd33cf3ee151c8973626aa
}