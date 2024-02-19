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
public abstract class Autorizacion {
    String autorizador;
    String autorizado; 
    String fechaInicio;
    String fechaFin;
    boolean aprobado;

    public Autorizacion() {
        this.aprobado = false;
    }
    
    public abstract void validar();
    
    public abstract void completar(String autorizador, String autorizado, String fechaInicio, String fechaFin);

    public boolean getAprobado() {
        return aprobado;
    }
    
    
}
