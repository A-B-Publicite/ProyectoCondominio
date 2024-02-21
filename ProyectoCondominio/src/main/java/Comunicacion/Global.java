/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;


import Administracion.Perfil;
import Administracion.Residente;
import java.util.List;
import java.util.Scanner;

public class Global extends Mensaje {



    public Global(Perfil origen, List<Perfil> destino) {
        super(origen, destino);

    }
    
    @Override
    public void crear () {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Destino: Todos");

        System.out.println("Escriba el Titulo del mensaje:");
        setTitulo(scanner.nextLine());

        System.out.println("Escriba el contenido del mensaje:");
        setContenido(scanner.nextLine());

        enviar();

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
                + "Origen: " + this.getOrigen().getNombreApellido()+"\n"+
                "Destino: Todos \n"+
                "Fecha: " + getFecha() +
                "\nTitutlo:" + this.getTitulo()+"\n" +this.getContenido() +
                "\n=============================================\n");
    }

    
    
}
