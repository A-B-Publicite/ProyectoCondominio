package Administracion;
import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import Inmueble.Condominio;
import Inmueble.Departamento;
import Inmueble.Inmueble;
import Inmueble.InmuebleComun;
import java.util.ArrayList;
// Considerar singleton

public class Administrador extends Perfil{
    private Condominio condominio;
    private Cuenta cuenta;
    
    public Administrador(String correo, String contrasena, String nombreApellido){
        super(correo, contrasena, nombreApellido);
        this.condominio = null;
        this.cuenta = new Cuenta(null);
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void agregarCondominio(String nombre){
        condominio = new Condominio(nombre);
    }
    public void agregarInmuebleComun(InmuebleComun inmuebleComun){
        // Crear metodo en condominio
        condominio.agregarInmuebleComun(inmuebleComun);
    }
    public void agregarDepartamento1(Departamento departamento){
        // Crear metodo en condominio
        condominio.agregarDepartamento(departamento);
    }
    
    public void agregarPropiedadPrivada1(int cantidad){
        // Crear metodo en condominio
        condominio.agregarPropiedadPrivada(cantidad);
    }
    public void registrarResidente(String correo, String password, String nombreApellido, Boolean esPropietario){
        Residente residenteNuevo = new Residente (correo, password, nombreApellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setResidente(residenteNuevo);     //Bidireccional
    }
    
    public void pagarContrato(Contrato contrato){
        ObligacionFinanciera obligacionFinanciera =  cuenta.aniadirObligacion(contrato.getPrecioContrato(), "contrato de guardiania", "cuotacontrato");
        cuenta.pagar(obligacionFinanciera);
    }
    
    public Residente obtenerResidente(String nombreResidente){
        // Implementar en inmueble
        return condominio.obtenerResidente(nombreResidente);
    }
    
}
