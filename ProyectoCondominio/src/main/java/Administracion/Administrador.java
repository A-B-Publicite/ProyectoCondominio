package Administracion;
import BD.BaseDeDatos;
import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import Inmueble.Condominio;
import Inmueble.Departamento;
import Inmueble.EspacioDeParqueadero;
import Inmueble.InmuebleComun;
import ModuloMuebles.Mueble;
import check_in.Autorizacion;
import check_in.Validacion;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Administrador extends Perfil implements Serializable {
    private Condominio condominio;
 
    public Administrador(String nombre, String apellido) {
        super(nombre, apellido);
    }
    //CONSTRUCTOR PARA ISNTANCIAR UN ADMINISTRADOR CON AUTORIZACION DE ENTRADA
    public Administrador(String nombre, String apellido, String fechaActual, String fechaFin) {
        super(nombre, apellido);
        Autorizacion autorizacionEntrada = crearAutorizacion(nombre + " " + apellido, fechaActual, fechaFin);
        this.setAutorizacion(autorizacionEntrada);
    }
    
    public void agregarCondominio(String nombre) {
        condominio = new Condominio(nombre);
    }
    
    public void agregarMueble(Mueble mueble, int cantidad, double precio) {
        condominio.agregarMueble(mueble, cantidad, precio);
    }

    public ArrayList<InmuebleComun> getInmueblesComunes() {
        return condominio.obtenerInmuebleComun();
    }

    public void registrarResidente(String nombre, String apellido, Boolean esPropietario)  {
        Residente residenteNuevo = new Residente(nombre, apellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setResidente(residenteNuevo);     //Bidireccional
        residenteNuevo.darCuentaDePago(this.cuentaBancaria);
        residenteNuevo.getCuenta().getGestorObligaciones().aniadirObligacion(departamentoLibre.getMetrosCuadrados(), "Esto es una alicuota", "alicuota");
        System.out.println(residenteNuevo);
        BaseDeDatos.actualizarListaDeResidentes(residenteNuevo);          
    }

    public void registrarResidente(String nombre, String apellido, Boolean esPropietario, String fechaActual, String fechaFin) {
        Residente residenteNuevo = new Residente(nombre, apellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        Autorizacion autorizacionEntrada = crearAutorizacion(residenteNuevo.getNombreApellido(), fechaActual, fechaFin);
        residenteNuevo.setAutorizacion(autorizacionEntrada);
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setResidente(residenteNuevo);    
        residenteNuevo.darCuentaDePago(this.cuentaBancaria);
        BaseDeDatos.actualizarListaDeResidentes(residenteNuevo);
    }

    //PORFAVOR NO BORRAR, ES DE USO PARA AGREGAR UN GUARDIA AL CONDOMINIO
    public void registrarGuardia(String nombre, String apellido, String fechaActual, String fechaFin) {
        Guardia guardiaNuevo = new Guardia(nombre, apellido);
        Autorizacion autorizacionEntrada = crearAutorizacion(guardiaNuevo.getNombreApellido(), fechaActual, fechaFin);
        guardiaNuevo.setAutorizacion(autorizacionEntrada);
        condominio.agregarGuardia(guardiaNuevo);
    }
    
    

    public ArrayList<Residente> getResidentes() {
        return condominio.obtenerResidentes();
    }

    public Residente getResidentePorNombre(String nombreResidente) throws Exception {
        return condominio.obtenerResidenteNombre(nombreResidente);
    }
    
    public Residente getResidentePorCorreo(String correo)  {
        return condominio.obtenerResidentePorCorreo(correo);
    }
  
    public void getCondominiosRegistrados() {
        if (condominio != null) {
            System.out.print("No hay condominios registrados");
            return;
        }

        System.out.print(condominio.toString());
    }

    public ArrayList<Contrato> getContratos() {
        return condominio.mostrarContratos();
    }

    public void agregarContrato(Double precio, String descripcion, String fechaInicio, String fechaFinalizacion, Object object) {
        Contrato contratoNuevo = new Contrato(precio, descripcion, fechaInicio, fechaFinalizacion, object);
        condominio.getDirectiva().agregarContrato(contratoNuevo);
    }

    public Autorizacion crearAutorizacion(String nombreResidente, String fechaActual, String fechaFin) {
        Autorizacion autorizacionEntrada = new Autorizacion();
        autorizacionEntrada.completar(this.getNombreApellido(), nombreResidente, fechaActual, fechaFin);
        validarAutorizacion(autorizacionEntrada);
        condominio.aniadirAutorizacion(autorizacionEntrada);        
        return autorizacionEntrada;
    }

    public Condominio getCondominio() {
        return condominio;
    }
    
    @Override
    public String toString() {
        return "Administrador: " + nombre + " " + apellido;
    }   
    
    public void enviarResidentesGuardia(){
        List<String> residentes = new ArrayList<>();

        for (Residente residente : condominio.obtenerResidentes()) {
            if(residente != null)
                residentes.add(residente.getNombreApellido());
        }       

        condominio.getGuardia().setResidentes(residentes);
    }

    public void enviarAutorizacionesGuardia(){
        ArrayList<Autorizacion> autorizaciones = condominio.obtenerAutorizaciones();
        condominio.getGuardia().setAutorizaciones(autorizaciones);
    }

    public void pagarContrato(double precioContrato, String descripcion) {
        cuentaBancaria.pagarServicio(precioContrato, descripcion);
    }
}
