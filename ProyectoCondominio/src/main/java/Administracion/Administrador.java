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
    
    public Administrador(String correo, String contrasena, String nombreApellido, Condominio condominio){
        super(correo, contrasena, nombreApellido);
        this.condominio = condominio;
        this.cuenta = new Cuenta(null);
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public void agregarInmuebleComun(Inmueble inmuebleComun){
        // Crear metodo en condominio
        condominio.agregarInmuebleComun(inmuebleComun);
    }
    
    public Residente registrarResidente(String correo, String password, String nombreApellido, Boolean esPropietario){
        Residente residenteNuevo = new Residente (correo, password, nombreApellido, esPropietario, this);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        residenteNuevo.setDepartamento(departamentoLibre);
        condominio.setPropietarioADepartamento(departamentoLibre, residenteNuevo);
        condominio.agregarResidente(residenteNuevo);
        residenteNuevo.getCuenta().aniadirObligacion(400, "", "alicuota");
        return residenteNuevo;
    }
    public void recaudarAlicuota(){
        // Hacer finanzas
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
