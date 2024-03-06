/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import Inmueble.EspacioDeParqueadero;
import check_in.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Guardia extends Perfil implements Serializable{
    private List<String> residentes = new ArrayList<>();
    private List<EspacioDeParqueadero> espaciosParqueadero = new ArrayList<>();
    private List<Autorizacion> autorizaciones = new ArrayList<>();  
    private HistorialEntrada entradasVisitantes = new HistorialEntrada();
    
    public Guardia(String nombre, String apellido) {        
        super(nombre, apellido);
    }
   
    public void registrarEntrada(String visitante, String fechaLlegada, String horaLlegada, boolean quiereEstacionamiento){
        RegistroEntrada registro = new RegistroEntrada();
        Autorizacion autorizacion = buscarAutorizacion(visitante);
        if( autorizacion == null){
            System.out.println("No tengo el registro de una autorizacion para usted");
            return;}
        registro.setAutorizacion(autorizacion);
        if (quiereEstacionamiento){
            EspacioDeParqueadero espacio = obtenerEspacioDisponible();
            if( espacio == null){
                System.out.println("No tengo ningun espacio disponible");
                return;}
            registro.asignarParqueadero(this,espacio);
        }
        registro.registrarEntrada(fechaLlegada, horaLlegada);
        entradasVisitantes.aniadirRegistro(registro);
    }
    
    public Autorizacion crearAutorizacion(Visitante visitante, String fechaLlegada, String horaLlegada) {
        Autorizacion autorizacionInmediata = new Autorizacion();        
        autorizacionInmediata.completar(visitante.getPersonaAVisitar(), visitante.getNombre(), fechaLlegada, fechaLlegada);
        validarEnNombreDe(visitante.getPersonaAVisitar(),autorizacionInmediata);
        autorizaciones.add(autorizacionInmediata);
        return autorizacionInmediata;
    }
    
    public void notificarResidente(String personaAVisitar){
        String residente = buscarResidente(personaAVisitar);
        if(residente == null){
            System.out.println("No tengo el registro de ningun residente llamado asi");
            return;}
    }

    private String buscarResidente(String personaAVisitar) {
        String residenteEncontrado = null;
        for (String residente : residentes) {
            if (residente.equals(personaAVisitar)) {
                residenteEncontrado = residente;
            }
        }      
        return residenteEncontrado;
    }

    private Autorizacion buscarAutorizacion(String autorizado) {
        Autorizacion autorizacionEncontrada = null;
        for (Autorizacion autorizacion : autorizaciones) {
            Comparacion comparar = new Comparacion();
            if (comparar.compararAutorizado(autorizado, autorizacion)) {
                autorizacionEncontrada = autorizacion;
            }
        }        
        return autorizacionEncontrada;
    }
    
    private EspacioDeParqueadero obtenerEspacioDisponible(){
        EspacioDeParqueadero espacioDisponible = null;
        for (EspacioDeParqueadero espacio : espaciosParqueadero) {            
            if (espacio.estaLibre()) {
                espacioDisponible = espacio;
                return espacioDisponible;
            }
        }    
        return espacioDisponible;
    }

    public void setResidentes(List<String> residentes) {
        this.residentes = residentes;
    }

    public void setAutorizaciones(List<Autorizacion> autorizaciones) {
        this.autorizaciones = autorizaciones;
    }    

    public void setEspaciosParqueadero(ArrayList<EspacioDeParqueadero> espaciosParqueadero) {
        this.espaciosParqueadero = espaciosParqueadero;
    }

    public HistorialEntrada getEntradasVisitantes() {
        return entradasVisitantes;
    }

    private void validarEnNombreDe(String personaAVisitar, Autorizacion autorizacionInmediata) {
        Validacion validacion = new Validacion();
        validacion.validar(personaAVisitar,autorizacionInmediata);
    }
}
