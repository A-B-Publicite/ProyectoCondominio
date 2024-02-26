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
    private List<Autorizacion> autorizaciones = new ArrayList<>();   
    
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
    }
    
    public void registrarEntrada(Visitante visitante, String fechaLlegada, String horaLlegada, boolean quiereEstacionamiento) {
        RegistroEntrada registro = new RegistroEntrada();
        Autorizacion autorizacionInmediata = new Autorizacion();
        Comparacion comparador = new Comparacion();
        String residente = buscarResidente(visitante.getPersonaAVisitar());
        if(residente == null){
            System.out.println("No tengo el registro de ningun residente llamado asi");
            return;}
        autorizacionInmediata.completar(visitante.getPersonaAVisitar(), visitante.getNombre(), fechaLlegada, fechaLlegada);
        comparador.compararValidar(residente, autorizacionInmediata);
        registro.setAutorizacion(autorizacionInmediata);
        if (quiereEstacionamiento){
            EspacioDeParqueadero espacio = obtenerEspacioDisponible();
            if( espacio == null){
                System.out.println("No tengo ningun espacio disponible");
                return;}
            registro.asignarParqueadero(this,espacio);
        }   
        registro.registrarEntrada(fechaLlegada, horaLlegada);
    }
    
    public void registrarEntrada(Visitante visitante, String fechaLlegada, String horaLlegada){
        this.registrarEntrada(visitante, fechaLlegada,horaLlegada, false);
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
        Autorizacion autorizacionEncontrada = new Autorizacion();
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
        //Logica para obtener un espacio disponible
        return espacioDisponible;
    }

    public void setResidentes(List<String> residentes) {
        this.residentes = residentes;
    }

    public void setAutorizaciones(List<Autorizacion> autorizaciones) {
        this.autorizaciones = autorizaciones;
    }    
}
