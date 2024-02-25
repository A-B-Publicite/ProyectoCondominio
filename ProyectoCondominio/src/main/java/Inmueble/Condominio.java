package Inmueble;

import Administracion.*;
import java.io.Serializable;

import java.util.ArrayList;
public class Condominio implements Serializable {

    private Administrador admin;
    private String nombre;
    private ArrayList<InmuebleComun> inmueblesComunes;
    private ArrayList<Departamento> departamentos;
    private Directiva directiva;
    private Guardia guardia;
    
    public Condominio(String nombreCondominio) {
        this.nombre = nombreCondominio;
        inmueblesComunes = new ArrayList<InmuebleComun>();
        departamentos = new ArrayList<Departamento>();
        directiva = new Directiva(admin);
    }
       
    //llenar parqueaderos publicos
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        inmueblesComunes.add(inmueble);
    }
    
    //para crear la lista de departamentos vacia
    public void agregarDepartamentos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            departamentos.add(new Departamento());
        }
    }
    
    public Departamento obtenerDepartamentoLibre(){
        
        for (Departamento departamento : departamentos) {
            if (departamento.getPropietario() == null) {
                
                return departamento;
            }
        }
        return null;
    }
    
    public ArrayList<InmuebleComun> obtenerInmuebleComun(){
        return inmueblesComunes;
    }
    
    //
    public void setPropietarioADepartamento(Departamento departamentoLibre, Residente residenteNuevo){
        departamentoLibre.setPropietario(residenteNuevo);
    }
    
    public Residente obtenerResidentePorNombre(String nombreResidente){
        Residente residente = null;
        for (Departamento departamento : departamentos) {
            if (departamento.getPropietario().getNombre() == nombreResidente) {
                return (Residente) departamento.getPropietario();
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
    
    
    public Residente obtenerResidentePorCorreo(String correo) {
        Residente resAux;
        for (Departamento departamento : this.departamentos) {
            resAux = (Residente) departamento.getPropietario(); 
            if (resAux != null && resAux.compararCorreoNombre(correo)) {
                                            
                return resAux;
            }
        }
        return null;
    }

    public void agregarDirectiva(Residente presidente, Residente secretario) {
        directiva.agregarDirectiva(presidente, secretario);
    }

//<<<<<<< HEAD
    public Contrato getContrato(String descripcionContratoAPagar) {
        return directiva.getContrato(descripcionContratoAPagar);
    }
//=======   
    
  
    public Residente obtenerResidenteNombre(String nombreResidente) throws Exception {
        Residente resAux;
        for (Departamento departamento : departamentos) {
            resAux = (Residente) departamento.getPropietario(); 
            if (resAux != null && resAux.compararNombre(nombreResidente)) {
                return resAux;
            }
        }
        throw new Exception ("No existe ese residente");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    public Directiva getDirectiva() {
        return directiva;
        
    }

    public ArrayList<Residente> obtenerResidentes() {
        ArrayList<Residente> residentes = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            residentes.add((Residente) departamento.getPropietario());
        }
        return residentes;
    }

    public void agregarGuardia(Guardia guardiaNuevo) {
        this.guardia = guardiaNuevo;
    }

    public Guardia getGuardia() {
       return guardia;
    }

    
}