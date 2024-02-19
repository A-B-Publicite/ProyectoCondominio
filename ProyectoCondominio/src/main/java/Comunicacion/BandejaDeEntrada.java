/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BandejaDeEntrada {
    private List<Mensaje> listaMensajes;
    private Perfil perfil;
    private Scanner scanner;

    public BandejaDeEntrada(Perfil perfil) {
        this.perfil = perfil;
        this.listaMensajes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void recibirMensaje(Mensaje mensaje) {
        listaMensajes.add(mensaje);
    }

    public void mostrar() {
        System.out.println("Bandeja de entrada de " + perfil.getNombre() + ":");
        int index = 1;
        for (Mensaje mensaje : listaMensajes) {
            System.out.println(index + ". " + mensaje.getTitulo());
            index++;
        }
    }

    public Mensaje getMensajePorIndice(int indice) {
        if (indice >= 1 && indice <= listaMensajes.size()) {
            return listaMensajes.get(indice - 1);
        } else {
            System.out.println("Índice de mensaje no válido.");
            return null;
        }
    }

    public void limpiarBandeja() {
        listaMensajes.clear();
    }

}

