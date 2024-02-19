/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

/**
 *
 * @author MARQUEZ
 */
public class AutorizacionPerfil extends Autorizacion{

    @Override
    public void validar() {
        this.aprobado = true;
    }

    @Override
    public void crear(String autorizador, String autorizado, String fechaInicio, String fechaFin) {
        this.autorizador = autorizador;
        this.autorizado = autorizado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }    
}
