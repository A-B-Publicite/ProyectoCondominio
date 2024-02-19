/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Perfil;

/**
 *
 * @author MARQUEZ
 */
public class Autorizacion {
    private Perfil autorizador;
    private String autorizado;
    private String fechaInicio;
    private String fechaFin;
    private boolean aprobado;

    public Autorizacion() {
        this.aprobado = false;
    }
    
    public void validar(){
        this.aprobado = true;
    }
    
    public void notificar(){
        
    }
    
    public void crear(Perfil autorizador, String autorizado, String fechaInicio, String fechaFin){
        this.autorizador = autorizador;
        this.autorizado = autorizado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        notificar();
        validar();
    }

    public boolean getAprobado() {
        return aprobado;
    }
    
    
}
