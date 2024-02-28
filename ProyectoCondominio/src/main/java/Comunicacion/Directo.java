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
    public void crear () {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eliga el destinatario");
        for (int i = 0; i < getDestinos().size(); i++) {
            System.out.println((i + 1) + ". " + getDestinos().get(i).getNombre());
        }
        pos= scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Destino: " + getDestinos().get(pos-1).getNombreApellido());

        System.out.println("Escriba el Titulo del mensaje:");
        setTitulo(scanner.nextLine());

        System.out.println("Escriba el contenido del mensaje:");
        setContenido(scanner.nextLine());
        
        enviar();

    }
    
    @Override
    public void enviar() {
        if (getDestinoAdmin()!= null) {
            Administrador ad =BaseDeDatos.leerAdministrador();
            ad.getBandejaDeEntrada().recibirMensaje(this);  
            BaseDeDatos.escribirAdmin(ad);
        } else {
               if (getDestino()!=null) {
                   try {
                        ArrayList<Residente> residentes = BaseDeDatos.leerLista();
                        for (Residente res : residentes) {
                            if (res.getCorreo().equals(getDestino().getCorreo())) {
                                res.getBandejaDeEntrada().recibirMensaje(this);
                                break;
                            }
                        }
                        BaseDeDatos.escribirLista(residentes);

                    } catch (IOException ex) {
                        Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Global.class.getName()).log(Level.SEVERE, null, ex);
                    }


                    this.getDestino().getBandejaDeEntrada().recibirMensaje(this);
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
