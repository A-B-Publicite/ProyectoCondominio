/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import BD.BaseDeDatos;

/**
 *
 * @author usuario
 */
public class Reporte extends Mensaje{
    public Residente destino;
    
    
    public Reporte(Administrador origen, Residente destino) {
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
                   System.out.println("ENTRO Reporte");

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
