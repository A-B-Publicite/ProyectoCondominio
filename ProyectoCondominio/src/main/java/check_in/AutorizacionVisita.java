/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Perfil;
import Comunicacion.*;

/**
 *
 * @author MARQUEZ
 */
public class AutorizacionVisita extends Autorizacion{

    @Override
    public void validar() {
        this.aprobado = true;
    }
    
    public void notificar(Perfil autorizador, Perfil guardia){
        String contenido = "El señor/a "+autorizado+" ha venido a visitarlo. ¿Desea dejarlo entrar?";
        Mensaje mensaje = new Directo(guardia, autorizador,contenido, "Nueva visita");
        mensaje.mostrar();
    }
    

    @Override
    public void crear(String autorizador, String autorizado, String fechaInicio, String fechaFin) {
        //Agregar los datos de la autorización del visitante
        this.autorizador = autorizador;
        this.autorizado = autorizado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        //Poner que sucede cuando no se obtiene respuesta
    }
    
}
