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
    public void crear() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Destino: " + this.getDestino().getNombre());


        System.out.println("Escriba el Titulo del mensaje:");
        setTitulo(scanner.nextLine());

        System.out.println("Escriba el contenido del mensaje:");
        setContenido(scanner.nextLine());

        System.out.println("Enviando mensaje directo para: " + this.getDestino().getNombre());
        
    }

    @Override
    public void mostrar() {
        System.out.println("Origen: " + this.getOrigen().getNombre() +"\n"+
                "Destino: " + this.getDestino().getNombre()+"\n"+
                getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido());
    }
}
