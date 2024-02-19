/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import java.time.LocalDateTime;

public class ReportePago extends Reporte{
    private LocalDateTime fechaCreacion;
    
    public ReportePago(Perfil origen, Perfil destino, String contenido, String titulo){
        super(origen, destino, contenido, titulo);
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public void enviar() {
        
    }

    @Override
    public void mostrar() {
        
    
    }

    @Override
    public void crear() {
     
    }
  
}
