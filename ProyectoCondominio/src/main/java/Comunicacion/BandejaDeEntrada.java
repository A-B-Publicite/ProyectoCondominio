/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import Administracion.Residente;
import BD.BaseDeDatos;
import Finanzas.ObligacionFinanciera;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class BandejaDeEntrada implements Serializable{
    private ArrayList<Mensaje> listaMensajes;
    private Perfil perfil;


    public BandejaDeEntrada(Perfil perfil) {
        this.perfil = perfil;
        this.listaMensajes = new ArrayList<>();
    }

    public void recibirMensaje(Mensaje mensaje) {
        this.listaMensajes.add(mensaje);
    }

    public ArrayList<Mensaje> getListaMensajes() {
        return listaMensajes;
    }


    public void limpiar() {
        listaMensajes.clear();
    }
    

}

