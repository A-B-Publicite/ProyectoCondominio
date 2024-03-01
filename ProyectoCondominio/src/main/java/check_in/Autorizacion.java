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
    
    public void validar() {
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
    
    public boolean getAprobado() {
        return aprobado;
    }   
}
