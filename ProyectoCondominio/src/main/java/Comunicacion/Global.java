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
    public ArrayList<Residente> destinatarios;
    
    public Global(Perfil origen, ArrayList<Residente> destino) {
        super(origen);
        this.destinatarios = destino;
        
    }

    public ArrayList<Residente> getDestinatarios() {
        return destinatarios;
    }
    
    

    @Override
    public void enviar() {
        ////deberia enviar a los residentes
        
        Administrador ad =BaseDeDatos.leerAdministrador();
        
        for (Residente res : ad.getResidentes()) {
            for (Perfil destinatario : getDestinatarios()) {
                if (res.getCorreo().equals(destinatario.getCorreo())) {
                    //destinatario.setBandejaDeEntrada(res.getBandejaDeEntrada());
                    //destinatario.getBandejaDeEntrada().recibirMensaje(this);
                    res.getBandejaDeEntrada().recibirMensaje(this);
                    //res.setBandejaDeEntrada(destinatario.getBandejaDeEntrada());
                    break;
                }
            }
        }
        BaseDeDatos.escribirAdmin(ad);
        
        
        
    }

    
}
