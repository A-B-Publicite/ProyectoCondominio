/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Administrador;
import Administracion.Perfil;
import BD.BaseDeDatos;
import java.io.Serializable;

/**
 *
 * @author intel
 */
public class MensajeSolicitud extends Mensaje implements Serializable{
    public Administrador destino;

    public MensajeSolicitud(Perfil origen) {
        super(origen);
        this.destino = BaseDeDatos.leerAdministrador();
                
    }
    
    
    @Override
    public void enviar() {
        this.destino.getBandejaDeEntrada();
    }
    
}
