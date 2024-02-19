/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Directo extends Mensaje{
    public Directo(Perfil origen, Perfil destino, String contenido, String titulo) {
        super(origen, destino, contenido, titulo);
    }

    @Override
    public void enviar() {
        getDestino().getBandejaDeEntrada().recibirMensaje(this);
    }

    @Override
    public void mostrar() {
        System.out.println("\n=============================================\n"
                + "Origen: " + this.getOrigen().getNombre() +"\n"+
                "Destino: " + this.getDestino().getNombre()+"\n"+
                "Fecha: " + getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido() + 
                "\n=============================================\n");
    }
}
