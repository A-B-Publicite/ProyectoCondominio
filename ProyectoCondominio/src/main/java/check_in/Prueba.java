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
    static List<Residente> residentes = new ArrayList<>();
    static Residente personaAVisitar = new Residente("Marco", "Marquez",true);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        residentes.add(personaAVisitar);
        
        Visitante visitante = new Visitante("Visitar","Jose Delgado","Marco Marquez");     
        boolean quiereEstacionamiento = true;
        EspacioDeParqueadero espacio = new EspacioDeParqueadero(20);
        System.out.println(buscarResidente(visitante.getPersonaAVisitar()));
        //registrar(visitante);
        
        //registrar(visitante, quiereEstacionamiento, espacio);
        
        
    }    
    
    public static void registrar(Visitante visitante, boolean quiereEstacionamiento, EspacioDeParqueadero espacio) {
        RegistroEntrada registro = new RegistroEntrada();
        Autorizacion autorizacionInmediata = new Autorizacion();
        Comparacion comparador = new Comparacion();
        Residente residente = buscarResidente(visitante.getPersonaAVisitar());
        autorizacionInmediata.completar(visitante.getPersonaAVisitar(), visitante.getNombre(), "25/2/2024", "25/2/2024");
        comparador.compararValidar(residente.getNombreApellido(), autorizacionInmediata.getAutorizador(), autorizacionInmediata);
        registro.setAutorizacion(autorizacionInmediata);
        if (quiereEstacionamiento)
            registro.asignarParqueadero(residente, espacio);
        registro.registrarEntrada("25/2/2024", "15:00");
    }
    public static void registrar(Visitante visitante){
        registrar(visitante,false,new EspacioDeParqueadero(0));
    }

    public static Residente buscarResidente(String personaAVisitar) {
        Residente residente = null;
        for (Residente resi : residentes) {
            if (resi.getNombreApellido().equals(personaAVisitar)) {
                residente = resi;
            }
        }
        if(residente == null)
            System.out.println("No tengo el registro de ningun residente denominado asi");
        
        return residente;
    }
}
