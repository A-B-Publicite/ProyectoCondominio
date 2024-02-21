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
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, String motivoVisita, String nombre, String personaAVisitar, Perfil autorizador){
        RegistroEntrada registro = new RegistroEntrada();
        Visitante visitanteNuevo = new Visitante(motivoVisita, nombre, personaAVisitar);
        Autorizacion autorizacionInmediata = new Autorizacion();
        
        autorizacionInmediata.completar(visitanteNuevo.getPersonaAVisitar(), visitanteNuevo.getNombre(), fechaLlegada, fechaLlegada);
        autorizacionInmediata.notificar(autorizador,this);
        autorizacionInmediata = autorizador.validarAutorizacion(autorizacionInmediata);    
        
        registro.setAutorizacion(autorizacionInmediata);
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }
}
