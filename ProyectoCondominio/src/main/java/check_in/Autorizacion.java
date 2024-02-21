/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Guardia;
import Administracion.Perfil;
import Comunicacion.Directo;
import Comunicacion.Mensaje;

/**
 *
 * @author MARQUEZ
 */
public class Autorizacion {
    String autorizador;
    String autorizado; 
    String fechaInicio;
    String fechaFin;
    boolean aprobado;

    public Autorizacion() {
        this.aprobado = false;
    }
    
    public void completar(String autorizador, String autorizado, String fechaInicio, String fechaFin) {
        this.autorizador = autorizador;
        this.autorizado = autorizado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }    

    public void validar(Perfil autorizador) {
        if(autorizador == null){
            System.out.println("Envíe un autorizador valido");
            return;}
        if(autorizador.getNombre()!= this.autorizador){
            System.out.println("Este perfil no esta autorizado para aprobar esta autorizacion");
            return;}
        aprobado = true;
    }

    public String getAutorizador() {
        return autorizador;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }
    
    public void notificar(Perfil autorizador, Guardia guardia){
        Mensaje mensaje = new Directo(guardia, autorizador,this, "Nueva visita");
        mensaje.enviar();
    }   
    public boolean getAprobado() {
        return aprobado;
    }   
     
}
