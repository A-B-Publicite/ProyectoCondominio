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
    public void crear() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Destino: Todos");

        System.out.println("Escriba el Titulo del mensaje:");
        setTitulo(scanner.nextLine());

        System.out.println("Escriba el contenido del mensaje:");
        setContenido(scanner.nextLine());

        System.out.println("Enviando mensaje global a todos los destinatarios");
    }

    @Override
    public void mostrar() {
        System.out.println("Origen: " + this.getOrigen().getNombre() +"\n"+
                "Destino: Todos \n"+
                getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido());
    }
    
}
