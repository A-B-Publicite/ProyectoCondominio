/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;

public abstract class Reporte extends Mensaje {
    
    Reporte(Perfil origen, Perfil destino, String contenido, String titulo){
        super(origen, destino, contenido, titulo);
    }

    
    public abstract void enviar();
    
    public void agregar(){
        
    }
    
    public abstract void mostrar();
}

