/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Administrador;
import Administracion.Residente;
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
        ArrayList<Residente> residentes = adminEnFichero.obtenerResidentes();
        Residente residente = residentes.get(0);
        residente.realizarCheckIn("20/2/204", "14:00");
    }
    
}
