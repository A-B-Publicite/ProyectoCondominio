package Inmueble;

import ModuloMuebles.Inventario;
import ModuloMuebles.Mueble;
import Administracion.*;
import AreasAparte.Ascensor;
import check_in.Autorizacion;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Iterator;

public class Condominio implements Serializable {

    private Administrador admin;
    private String nombreCondominio;
    private ArrayList<InmuebleComun> listaDeInmuebleComunes;
    private ArrayList<Departamento> listaDeDepartamentos;
    private Directiva directiva;
    private Guardia guardia;
    private Inventario inventario;
    private ArrayList<Autorizacion> autorizacionesEntrada;
    private Ascensor ascensor; 
    
    public Condominio(String nombreCondominio) {
        this.nombreCondominio = nombreCondominio;
        this.inventario = new Inventario();
        listaDeInmuebleComunes = new ArrayList<InmuebleComun>();
        listaDeDepartamentos = new ArrayList<Departamento>();
        autorizacionesEntrada = new ArrayList<Autorizacion>();
        directiva = new Directiva(admin);
        ascensor=new Ascensor();
    }

    //llenar parqueaderos publicos
    public void agregarInmuebleComun(InmuebleComun inmueble) {
        listaDeInmuebleComunes.add(inmueble);
        System.out.println(listaDeInmuebleComunes);
    }

    //para crear la lista de departamentos vacia
    public void agregarDepartamentos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            listaDeDepartamentos.add(new Departamento());

        }
    }

    //para crear la lista de MUEBLES vacia
    public void agregarMueble(Mueble mueble, int cantidad, double precio) {
        inventario.agregarMueble(mueble, cantidad, precio);
    }

    public Departamento obtenerDepartamentoLibre() {
        for (Departamento departamento : listaDeDepartamentos) {
            if (departamento.getPropietario() == null) {

                return departamento;
            }
        }
        return null;
    }

    public ArrayList<InmuebleComun> obtenerInmuebleComun() {
        return listaDeInmuebleComunes;
    }

    //
    public void setPropietarioADepartamento(Departamento departamentoLibre, Residente residenteNuevo) {
        departamentoLibre.setResidente(residenteNuevo);
    }

    public Residente obtenerResidentePorNombre(String nombreResidente) {
        Residente residente = null;
        for (Departamento departamento : listaDeDepartamentos) {
            if (departamento.getPropietario().getNombre().equals(nombreResidente)) {
                return (Residente) departamento.getPropietario();
            }
        }
        return residente;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public ArrayList<Contrato> mostrarContratos() {
        return directiva.getContratosAprobados();
    }

    public Residente obtenerResidentePorCorreo(String correo) {
        Residente resAux;
        for (Departamento departamento : this.listaDeDepartamentos) {
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

    public Contrato getContrato(String descripcionContratoAPagar) {
        return directiva.getContratoAprobado(descripcionContratoAPagar);
    }

    public Residente obtenerResidenteNombre(String nombreResidente) throws Exception {
        Residente resAux;
        for (Departamento departamento : listaDeDepartamentos) {
            resAux = (Residente) departamento.getPropietario();
            if (resAux != null && resAux.compararNombre(nombreResidente)) {
                return resAux;
            }
        }
        throw new Exception("No existe ese residente");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Directiva getDirectiva() {
        return directiva;

    }

    public ArrayList<Residente> obtenerResidentes() {
        ArrayList<Residente> residentes = new ArrayList<>();
        for (Departamento departamento : listaDeDepartamentos) {
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

    public ArrayList<Autorizacion> obtenerAutorizaciones() {
        return this.autorizacionesEntrada;
    }

    public void aniadirAutorizacion(Autorizacion autorizacion) {
        autorizacionesEntrada.add(autorizacion);
    }

    public ArrayList<Object> getMueblesEInmuebles() {
        ArrayList<Object> mueblesEInmuebles = new ArrayList<>();
        for (InmuebleComun inmueble : listaDeInmuebleComunes) {
            mueblesEInmuebles.add(inmueble);
        }
        for (Mueble mueble : inventario.getListaMuebles()) {
            mueblesEInmuebles.add(mueble);
        }

        System.out.println(mueblesEInmuebles);
        return mueblesEInmuebles;
    }

    public Object getObjetoPorSuToString(String string) {
        for (Object objeto : getMueblesEInmuebles()) {
            if (string.equals(objeto.toString())) {
                return objeto;
            }

        }
        return null;
    }

}
