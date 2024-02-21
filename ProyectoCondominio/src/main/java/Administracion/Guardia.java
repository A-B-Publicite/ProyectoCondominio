/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import Inmueble.EspacioDeParqueadero;
import check_in.*;
import java.io.Serializable;

/**
 *
 * @author MARQUEZ
 */
public class Guardia extends Perfil implements Serializable{
            
    public Guardia(String nombre, String apellido) {
        super(nombre, apellido);
    }
   
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, Autorizacion autorizacion){
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(autorizacion);
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }
    
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, Autorizacion autorizacion, Perfil reservadorParqueadero, EspacioDeParqueadero espacio){
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(autorizacion);        
        registro.asignarParqueadero(reservadorParqueadero, espacio);
        registro.registrarEntrada(fechaLlegada, horaLlegada); 
    }
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, Visitante visitante, Perfil residente, boolean quiereEstacionamiento, EspacioDeParqueadero espacio){
        RegistroEntrada registro = new RegistroEntrada();
        Autorizacion autorizacionInmediata = new Autorizacion();
        autorizacionInmediata.completar(visitante.getPersonaAVisitar(), visitante.getNombre(), fechaLlegada, fechaLlegada);
        //autorizacionInmediata.notificar(residente,this);
        residente.validarUnaAutorizacion(autorizacionInmediata);  
        registro.setAutorizacion(autorizacionInmediata);
        if (quiereEstacionamiento)
            registro.asignarParqueadero(residente, espacio);
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }
}
