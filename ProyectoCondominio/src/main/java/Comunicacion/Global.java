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

public class Global extends Mensaje implements Serializable{



    public Global(Perfil origen, ArrayList<Residente> destino) {
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
        
        for (Residente res : ad.getResidentes()) {
            for (Perfil destinatario : getDestinos()) {
                if (res.getCorreo().equals(destinatario.getCorreo())) {
                    destinatario.setBandejaDeEntrada(res.getBandejaDeEntrada());
                    destinatario.getBandejaDeEntrada().recibirMensaje(this);
                    break;
                }
            }
        }
        BaseDeDatos.escribirAdmin(ad);
        
        
        
    }

    @Override
    public void mostrar() {
        System.out.println("\n=============================================\n"
                + "Origen: " + this.getOrigen().getNombreApellido()+"\n"+
                "Destino: Todos \n"+
                "Fecha: " + getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido() +
                "\n=============================================\n");
    }

    
    
}
