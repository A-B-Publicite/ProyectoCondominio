/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;


import Administracion.Perfil;
import java.util.List;
import java.util.Scanner;

public class Global extends Mensaje {



    public Global(Perfil origen, List<Perfil> destino, String contenido, String titulo) {
        super(origen, destino, contenido, titulo);

    }

    @Override
    public void enviar() {
        for (Perfil destinatario : getDestinos()) {
            destinatario.getBandejaDeEntrada().recibirMensaje(this);
        }
        
    }

    @Override
    public void mostrar() {
        System.out.println("\n=============================================\n"
                + "Origen: " + this.getOrigen().getNombre() +"\n"+
                "Destino: Todos \n"+
                "Fecha: " + getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido() +
                "\n=============================================\n");
    }
    
}
