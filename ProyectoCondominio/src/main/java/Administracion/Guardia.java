/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import check_in.*;

/**
 *
 * @author MARQUEZ
 */
public class Guardia extends Perfil{
            
    public Guardia(String nombre, String apellido) {
        super(nombre, apellido);
    }
   
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, Autorizacion autorizacion){
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(autorizacion);
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, Autorizacion autorizacion, Perfil reservadorParqueadero){
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(autorizacion);        
        registro.registrarEntrada(fechaLlegada, horaLlegada);
        registro.asignarParqueadero(fechaLlegada, this);
    }
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, String motivoVisita, String nombre, String personaAVisitar, Perfil residente){
        RegistroEntrada registro = new RegistroEntrada();
        Visitante visitanteNuevo = new Visitante(motivoVisita, nombre, personaAVisitar);
        Autorizacion autorizacionInmediata = new Autorizacion();
        
        autorizacionInmediata.completar(personaAVisitar, visitanteNuevo.getNombre(), fechaLlegada, fechaLlegada);
        autorizacionInmediata.notificar(residente,this);
        
        this.bandejaDeEntrada.mostrar();
        
        
        
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }
}
