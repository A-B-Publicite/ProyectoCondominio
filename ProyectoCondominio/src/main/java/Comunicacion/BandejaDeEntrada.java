/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BandejaDeEntrada implements Serializable{
    private List<Mensaje> listaMensajes;
    private Perfil perfil;


    public BandejaDeEntrada(Perfil perfil) {
        this.perfil = perfil;
        this.listaMensajes = new ArrayList<>();
    }

    public void recibirMensaje(Mensaje mensaje) {
        listaMensajes.add(mensaje);
    }

    public void mostrar() {
        System.out.println("Bandeja de entrada de " + perfil.getNombreApellido()+ ":");
        int index = 1;
        System.out.println("LISTA DE MENSAJES: ");
        for (Mensaje mensaje : listaMensajes) {
            System.out.println(index + ". " + mensaje.getTitulo());
            index++;
        }
       
    }

    public void getMensajePorIndice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija el mensaje que desea ver: ");
        int indice = sc.nextInt();
        if (indice >= 1 && indice <= listaMensajes.size()) {
           listaMensajes.get(indice - 1).mostrar();
        } else {
            System.out.println("Índice de mensaje no válido.");
            
        }
    }

    public void limpiarBandeja() {
        listaMensajes.clear();
    }

}

