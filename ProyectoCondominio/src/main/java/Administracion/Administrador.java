package Administracion;

import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import Inmueble.Condominio;
import Inmueble.Departamento;
import Inmueble.InmuebleComun;
import java.util.*;
// Considerar singleton

public class Administrador extends Perfil {

    private Condominio condominio;
    private Cuenta cuenta;

 
    public Administrador( String nombre, String apellido) {
        super(nombre, apellido);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void agregarCondominio(String nombre) {
        condominio = new Condominio(nombre);
    }

    public void agregarInmuebleComun(InmuebleComun inmuebleComun) {
        // Crear metodo en condominio
        condominio.agregarInmuebleComun(inmuebleComun);
    }
   
    public void agregarDepartamento(int numeroDepartamento) {
        condominio.agregarDepartamentos(numeroDepartamento);
    }


    public void registrarResidente(String nombre, String apellido, Boolean esPropietario) {
        Residente residenteNuevo = new Residente(nombre, apellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setPropietario(residenteNuevo);     //Bidireccional
        residenteNuevo.darCuentaDePago(this.cuenta);
    }

    public void pagarContrato(Contrato contrato) {
        ObligacionFinanciera obligacionFinanciera = cuenta.aniadirObligacion(contrato.getPrecioContrato(), "contrato de guardiania", "cuotacontrato");
        cuenta.pagarObligacionFinanciera(obligacionFinanciera);
    }

    public Residente obtenerResidente(String nombreResidente) {
        // Implementar en inmueble
        return condominio.obtenerResidente(nombreResidente);
    }

    public void obtenerCondominiosRegistrados() {
        if (condominio != null) {
            System.out.print("No hay condominios registrados");
            return;
        }

        System.out.print(condominio.toString());
    }


    public ArrayList<Contrato> mostrarContratos() {
        return condominio.mostrarContratos();
    }

    public void agregarDirectiva(String correoPresidente, String correoSecretario) {
        condominio.agregarDirectiva(obtenerResidenteCorreo(correoPresidente), obtenerResidenteCorreo(correoSecretario));
    }
    
    public Residente obtenerResidenteCorreo(String correo){
        return condominio.obtenerResidente(correo);
    }

}
