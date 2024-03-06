/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import BD.BaseDeDatos;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Directo extends Mensaje implements Serializable{
    public Perfil destino;
    
    public Directo(Perfil origen, Perfil destino) {
        super(origen);
        this.destino = destino;
        }

    public Perfil getDestino() {
        return destino;
    }


    
    
    @Override
    public void enviar() {
        //usar destinatarios para enviar
        Administrador ad =BaseDeDatos.leerAdministrador();
        
               if (getDestino()!=null) {
                   System.out.println("ENTRO TRY");

                   for (Residente res : ad.getResidentes()) {
                       if (res.getCorreo().equals(getDestino().getCorreo())) {
                           res.getBandejaDeEntrada().recibirMensaje(this);
                           
                           break;
                       }
                   }
                   BaseDeDatos.escribirAdmin(ad);

               }
              
    }


 
    
    
    
    
}
