package Administracion;
import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import Inmueble.Condominio;
import Inmueble.Departamento;
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


    public Administrador(String correo, String contrasenia, String nombre, String apellido) {
        super(correo, contrasenia, nombre, apellido);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void agregarCondominio(String nombreCondominio){
        condominio = new Condominio(nombreCondominio);
    }
    public void agregarInmuebleComun(InmuebleComun inmuebleComun){
        // Crear metodo en condominio
        condominio.agregarInmuebleComun(inmuebleComun);
    }

    public void agregarDepartamento(int cantidad){
        condominio.agregarPropiedadPrivada(cantidad);
    }
    
    public void registrarResidente(String nombre, String apellido, Boolean esPropietario){
        Residente residenteNuevo = new Residente (correo, password, nombreApellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setPropietario(residenteNuevo);     //Bidireccional
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
