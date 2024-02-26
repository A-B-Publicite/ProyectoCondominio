/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package check_in;

import Administracion.Residente;
import Inmueble.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARQUEZ
 */
public class Prueba {
    static List<String> residentes = new ArrayList<>();
    static Residente personaAVisitar = new Residente("Marco", "Marquez",true);  //EJEMPLO
    static List<Autorizacion> autorizaciones = new ArrayList<>();
    static Autorizacion autorizacionPre = new Autorizacion();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        residentes.add(personaAVisitar.getNombreApellido());
        autorizacionPre.completar("Marco Marquez", "Jose Delgado", "25/2/2024", "25/2/2025");
        autorizacionPre.validar();
        autorizaciones.add(autorizacionPre);
        
        Visitante visitante = new Visitante("Visitar","Jose Delgado","Marco Marquez");     
        boolean quiereEstacionamiento = true;
        EspacioDeParqueadero espacio = new EspacioDeParqueadero(20);
        System.out.println(buscarResidente(visitante.getPersonaAVisitar()));
        //registrar(visitante);
        //registrar(visitante, quiereEstacionamiento, espacio); 
        //registrar(visitante.getNombre(),quiereEstacionamiento);
    }    
    
    public static void registrar(String visitante, String fechaLlegada, String horaLlegada, boolean quiereEstacionamiento){
        RegistroEntrada registro = new RegistroEntrada();
        if(compararAutorizaciones(visitante) == null){
            System.out.println("No tengo el registro de una autorizacion para usted");
            return;}
        registro.setAutorizacion(autorizacionPre);
        //if (quiereEstacionamiento)
        //    registro.asignarParqueadero(residente, espacio);
        registro.registrarEntrada(fechaLlegada, horaLlegada);
    }
    
    public static void registrar(Visitante visitante, String fechaLlegada, String horaLlegada, boolean quiereEstacionamiento, EspacioDeParqueadero espacio) {
        RegistroEntrada registro = new RegistroEntrada();
        Autorizacion autorizacionInmediata = new Autorizacion();
        Comparacion comparador = new Comparacion();
        String residente = buscarResidente(visitante.getPersonaAVisitar());
        if(residente == null){
            System.out.println("No tengo el registro de ningun residente denominado asi");
            return;}
        autorizacionInmediata.completar(visitante.getPersonaAVisitar(), visitante.getNombre(), fechaLlegada, fechaLlegada);
        comparador.compararValidar(residente, autorizacionInmediata);
        registro.setAutorizacion(autorizacionInmediata);
        //if (quiereEstacionamiento)
        //    registro.asignarParqueadero(residente, espacio);    //Poner el guardia
        registro.registrarEntrada(fechaLlegada, horaLlegada);
    }
    
    public static void registrar(Visitante visitante, String fechaLlegada, String horaLlegada){
        registrar(visitante, fechaLlegada,horaLlegada, false,null);
    }

    private static String buscarResidente(String personaAVisitar) {
        String residente = null;
        for (String resi : residentes) {
            if (resi.equals(personaAVisitar)) {
                residente = resi;
            }
        }      
        return residente;
    }

    private static Autorizacion compararAutorizaciones(String autorizado) {
        Autorizacion autorizacion = new Autorizacion();
        for (Autorizacion autori : autorizaciones) {
            Comparacion comparar = new Comparacion();
            if (comparar.compararAutorizado(autorizado, autori)) {
                autorizacion = autori;
            }
        }        
        return autorizacion;
    }
}
