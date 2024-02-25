/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Guardia;
import Administracion.Perfil;
import Comunicacion.Directo;
import Comunicacion.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARQUEZ
 */
public class Autorizacion implements Serializable{
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
        if(!autorizador.getNombreApellido().equals(this.autorizador)){
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
        List<Perfil> autorizadorL= new ArrayList<>();
        autorizadorL.add(autorizador);
        Mensaje mensaje = new Directo(guardia, autorizadorL);
        mensaje.crear();
    }   
    public boolean getAprobado() {
        return aprobado;
    }   
     
}
