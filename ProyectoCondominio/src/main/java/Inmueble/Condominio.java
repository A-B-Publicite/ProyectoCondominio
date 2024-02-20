package Inmueble;

import Administracion.Administrador;
import Administracion.Residente;
import java.util.ArrayList;
import java.util.List;

public class Condominio {

    private Administrador admin;
    private String nombre;
    private ArrayList<InmuebleComun> inmueblesComunes;
    private ArrayList<InmueblePrivado> departamentos;
    private Directiva directiva;
    
    public Condominio(String nombreCondominio) {
        this.nombre = nombreCondominio;
        inmueblesComunes = new ArrayList<InmuebleComun>();
        departamentos = new ArrayList<Departamento>();
        directiva = null;
    }
        
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        listaInmueblesComunes.add(inmueble);
    }
    
    //para crear la lista de departamentos vacia
    public void agregarDepartamentos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            departamentos.add(new Departamento());
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
        return residente;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
    
    
    public ArrayList<Contrato> mostrarContratos(){
        return directiva.mostrarContratos();
    }
    
    
    public Residente obtenerResidente(String correo){
        Residente resAux;
        for (Departamento departamento : departamentos) {
            resAux = departamento.getPropietario(); 
            if (resAux.compararCorreoNombre(correo)) {
                return resAux;
            }
        }
        return null;
    }
}