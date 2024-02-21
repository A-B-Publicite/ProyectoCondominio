/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import Inmueble.EspacioDeParqueadero;
import Inmueble.InmuebleComun;
import java.util.ArrayList;

/**
 *
 * @author MARQUEZ
 */
public class MenuCI {

    public static void menuCheckIn(Administrador adminEnFichero) {
        //El admin registra su entrada
        adminEnFichero.realizarCheckIn("20/2/2024", "15:00");
        Autorizacion autorizacion = adminEnFichero.crearAutorizacion(adminEnFichero.getNombreApellido(), "20/2/2022", "20/2/2026");
        adminEnFichero.setAutorizacion(autorizacion);
        adminEnFichero.realizarCheckIn("20/2/2024", "15:00");
        
        //Prueba con un residente
        adminEnFichero.registrarResidente("Marco", "Marquez", Boolean.TRUE, "20/2/2024", "20/2/2030");
        
        Residente residentePruebas;
        try {
            residentePruebas = adminEnFichero.obtenerResidente("Marco");
            residentePruebas.realizarCheckIn("20/2/2024", "14:00");
            residentePruebas.realizarCheckIn("20/2/2024", "14:00",true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }      
        
        //Prueba Guardia
        adminEnFichero.registrarGuardia("GU", "ARDIA", "21/2/2024", "21/2/2044");
        adminEnFichero.getCondominio().getGuardia().realizarCheckIn("21/2/2024", "02:51");
        
        //Prueba Visitante
        Visitante visitante = new Visitante("Visitar", "Fulanito Senior", "Marco Marquez");
        Perfil residenteAVisitar;
        try {
            residenteAVisitar = adminEnFichero.obtenerResidente("Marco");
            EspacioDeParqueadero espacio = new EspacioDeParqueadero(10.0);
        
            for (InmuebleComun inmueble : adminEnFichero.obtenerInmuebleComun()) {
                if (inmueble instanceof EspacioDeParqueadero) {
                    espacio = (EspacioDeParqueadero) inmueble;                 
                }
            }
            adminEnFichero.getCondominio().getGuardia().realizarCheckIn("21/2/2024", "03:00", 
                                    visitante,
                                    residenteAVisitar, true, espacio);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
