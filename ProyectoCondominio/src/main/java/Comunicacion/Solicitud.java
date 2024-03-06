/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import BD.BaseDeDatos;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author intel
 */
public class Solicitud extends Mensaje implements Serializable{
    public Administrador destino;

    public Solicitud(Perfil origen) {
        super(origen);
        this.destino = BaseDeDatos.leerAdministrador();
                
    }
    
    
    @Override
    public void enviar() {
        
        this.destino.getBandejaDeEntrada().recibirMensaje(this);
        
        BaseDeDatos.escribirAdmin(this.destino);
        
    }
    
}
