/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import check_in.Autorizacion;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Directo extends Mensaje{
    
    int pos;

    public Directo(Perfil origen, List<Perfil> destino) {
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
        getDestinos().get(pos-1).getBandejaDeEntrada().recibirMensaje(this);
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
