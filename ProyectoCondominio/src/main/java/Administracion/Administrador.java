package Administracion;

import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import Inmueble.Condominio;
import Inmueble.Departamento;
import Inmueble.InmuebleComun;
import check_in.Autorizacion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
// Considerar singleton

public class Administrador extends Perfil implements Serializable {

    private Condominio condominio;

    public Administrador(String nombre, String apellido) {
        super(nombre, apellido);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public void agregarInmuebleComun(InmuebleComun inmuebleComun) {
        // Crear metodo en condominio
        condominio.agregarInmuebleComun(inmuebleComun);
    }

    public void agregarDepartamento(int numeroDepartamento) {
        condominio.agregarDepartamentos(numeroDepartamento);
    }

    public ArrayList<InmuebleComun> obtenerInmuebleComun() {
        return condominio.obtenerInmuebleComun();
    }

    public void registrarResidente(String nombre, String apellido, Boolean esPropietario) throws FileNotFoundException, IOException, ClassNotFoundException {
        Residente residenteNuevo = new Residente(nombre, apellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setPropietario(residenteNuevo);     //Bidireccional
        
        residenteNuevo.darCuentaDePago(this.cuentaBancaria);
        residenteNuevo.getCuenta().aniadirObligacion(departamentoLibre.getMetrosCuadrados() , "hola", "alicuota");
        //Escribo a bits el residenteNuevo
        
        ArrayList<Residente> listaResidentes = new ArrayList<>();
        listaResidentes = condominio.obtenerResidentes();
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/Datos/datosResidentes.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(listaResidentes);
        objectOutputStream.close();

        //Lectura del objeto admin
        FileInputStream fileInputStream = new FileInputStream("src/main/java/Datos/datosResidentes.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Residente> residentes = (ArrayList<Residente>) objectInputStream.readObject();
        objectOutputStream.close();
    }
    
    public Residente obtenerResidenteGuardado() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/main/java/Datos/datosResidentes.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Residente> residentes = (ArrayList<Residente>) objectInputStream.readObject();
        objectInputStream.close();
    
    // Suponiendo que quieres obtener el último residente agregado
        return residentes.get(residentes.size() - 1);
    }
    
    
    

    public void registrarResidente(String nombre, String apellido, Boolean esPropietario, String fechaActual, String fechaFin) {
        Residente residenteNuevo = new Residente(nombre, apellido, esPropietario);
        Departamento departamentoLibre = condominio.obtenerDepartamentoLibre();
        Autorizacion autorizacionEntrada = crearAutorizacion(residenteNuevo.getNombreApellido(), fechaActual, fechaFin);
        residenteNuevo.setAutorizacion(autorizacionEntrada);
        residenteNuevo.setDepartamento(departamentoLibre);
        departamentoLibre.setPropietario(residenteNuevo);     //Bidireccional
        
        residenteNuevo.darCuentaDePago(this.cuentaBancaria);
        residenteNuevo.getCuenta().aniadirObligacion(departamentoLibre.getMetrosCuadrados() , "hola", "alicuota");
    }

    //PORFAVOR NO BORRAR, ES DE USO PARA AGREGAR UN GUARDIA AL CONDOMINIO
    public void registrarGuardia(String nombre, String apellido, String fechaActual, String fechaFin) {
        Guardia guardiaNuevo = new Guardia(nombre, apellido);
        Autorizacion autorizacionEntrada = crearAutorizacion(guardiaNuevo.getNombreApellido(), fechaActual, fechaFin);
        guardiaNuevo.setAutorizacion(autorizacionEntrada);
        condominio.agregarGuardia(guardiaNuevo);
    }

    public void pagarContrato(String descripcionContratoAPagar) {
        Contrato contrato = condominio.getContrato(descripcionContratoAPagar);
        cuentaBancaria.pagarContrato(contrato.getPrecioContrato());
    }

    public ArrayList<Residente> obtenerResidentes() {
        return condominio.obtenerResidentes();
    }

    public Residente obtenerResidente(String nombreResidente) throws Exception {
        // Implementar en inmueble
        return condominio.obtenerResidenteNombre(nombreResidente);
    }

    public Residente obtenerResidentePorCorreo(String correo)  {

        // Implementar en inmueble
        return condominio.obtenerResidentePorCorreo(correo);
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

    public void agregarDirectiva(String correoPresidente, String correoSecretario) throws Exception {
        condominio.agregarDirectiva(obtenerResidenteCorreo(correoPresidente), obtenerResidenteCorreo(correoSecretario));
    }

    public Residente obtenerResidenteCorreo(String correo) throws Exception {
        return condominio.obtenerResidentePorCorreo(correo);
    }

    void agregarContrato(LocalDate fechaContrato, double precio, String descripcion, String fechaInicio, String fechaFinalizacion) {
        Contrato contratoNuevo = new Contrato(fechaContrato, precio, descripcion, fechaInicio, fechaFinalizacion);
        Directiva directiva = condominio.getDirectiva();
        directiva.agregarContrato(contratoNuevo);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Autorizacion crearAutorizacion(String nombreResidente, String fechaActual, String fechaFin) {
        Autorizacion autorizacionEntrada = new Autorizacion();
        autorizacionEntrada.completar(this.getNombreApellido(), nombreResidente, fechaActual, fechaFin);
        autorizacionEntrada.validar(this);
        return autorizacionEntrada;
    }

    public Condominio getCondominio() {
        return condominio;
    }
}
