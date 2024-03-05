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
    
    int pos;

    public Directo(Perfil origen, Residente destino) {
        super(origen, destino);
    }
    
    public Directo(Perfil origen, Administrador destino) {
        super(origen, destino);
    }

    @Override
    public void crear (String titulo, String contenido) {
        
        
        setTitulo(titulo);

        setContenido(contenido);
        
        enviar();

    }
    
    @Override
    public void enviar() {
        Administrador ad =BaseDeDatos.leerAdministrador();
        if (getDestinoAdmin()!= null) {
            
            ad.getBandejaDeEntrada().recibirMensaje(this);  
            BaseDeDatos.escribirAdmin(ad);
        } else {
               if (getDestino()!=null) {
                   ArrayList<Residente> residentes = ad.getResidentes();
                   for (Residente res : residentes) {
                       if (res.getCorreo().equals(getDestino().getCorreo())) {
                           res.getBandejaDeEntrada().recibirMensaje(this);
                           
                           break;
                       }
                   }
                   BaseDeDatos.escribirAdmin(ad);

               }
            }
        
        
    }

    @Override
    public void mostrar() {
        System.out.println("\n=============================================\n"
                + "Origen: " + this.getOrigen()+"\n"+
                "Destino: " + this.getDestinos()+"\n"+
                "Fecha: " + getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido() + 
                "\n=============================================\n");
    }
    
}
