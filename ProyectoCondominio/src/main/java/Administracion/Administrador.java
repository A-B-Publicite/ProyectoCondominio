package Administracion;
import Inmueble.Condominio;
import Inmueble.InmuebleComun;
import java.util.ArrayList;
// Considerar singleton

public class Administrador extends Perfil{
    private Condominio condominio;
    
    public Administrador(String correo, String contrasena, String nombreApellido, Condominio condominio){
        super(correo, contrasena, nombreApellido);
        this.condominio = condominio;
    }
    
    public void agregarInmuebleComun(InmuebleComun inmuebleComun){
        // Crear metodo en condominio
        condominio.agregarInmuebleComun(inmuebleComun);
    }
    
    public void registrarResidente(String correo, String password, String nombreApellido, Boolean esPropietario){
        Residente residenteNuevo = new Residente (correo, password, nombreApellido, esPropietario);
        residenteNuevo.setDepartamento(condominio.obtenerDepartamentoLibre());
        condominio.agregarResidente(residenteNuevo);
    }
    public void recaudarAlicuota(){
        // Hacer finanzas
    }
    public void pagarContrato(Contrato contrato){
       contrato.pagar();
    }
    
    public Residente obtenerResidente(String nombreResidente){
        // Implementar en inmueble
        return condominio.obtenerResidente(nombreResidente);
    }
    
    
}
