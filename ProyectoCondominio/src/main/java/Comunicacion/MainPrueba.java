/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPrueba {
    public static void main(String[] args) {

        List<Perfil> residentes = new ArrayList<>();

        Perfil Administrador = new Administrador("pepe123@epn.edu.ec", "123", "Pepe", null);
        Perfil Residente1 = new Residente("juan123@epn.edu.ec", "123", "Juan", true );
        Perfil Residente2 = new Residente("juan123@epn.edu.ec", "123", "Pedro", true);
        

        residentes.add(Residente1);
        residentes.add(Residente2);
        
        Scanner scanner = new Scanner(System.in);
        
        int aux=1;
        
        do {
            
            int tipo = 0;
            System.out.println("Elija el tipo de mensaje a enviar (escriba un numero): \n" +
                    "1. Global\n" +
                    "2. Directo\n");
            tipo = scanner.nextInt();
            scanner.nextLine();

            Mensaje mensaje;

            String titulo;
            String contenido;

            switch (tipo) {
                case 1:
                    System.out.println("Destino: Todos");
                    System.out.println("Escriba el Titulo del mensaje:");
                    titulo = scanner.nextLine();
                    System.out.println("Escriba el contenido del mensaje:");
                    contenido = scanner.nextLine();
                    mensaje = new Global(Administrador, residentes,contenido,titulo);
                    mensaje.enviar(); 
                break;

                case 2:
                    int pos;
                    System.out.println("Eliga el destinatario");
                    for (int i = 0; i < residentes.size(); i++) {
                        System.out.println((i + 1) + ". " + residentes.get(i).getNombreApellido());
                    }
                    pos= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Destino: " + residentes.get(pos-1).getNombreApellido());
                    System.out.println("Escriba el Titulo del mensaje:");
                    titulo = scanner.nextLine();
                    System.out.println("Escriba el contenido del mensaje:");
                    contenido = scanner.nextLine();
                    mensaje = new Directo(Administrador, residentes.get(pos-1),contenido,titulo);
                    mensaje.enviar();
                break;
                default:
                    System.out.println("No existe opcion");
                break;
            }
            System.out.println("Desea continuar? 1=Si ; 0=No");
            aux = scanner.nextInt();
            scanner.nextLine();
        } while (aux==1);
      
        System.out.println("\n==============================================\n");
        Residente1.getBandejaDeEntrada().mostrar();
        Residente1.getBandejaDeEntrada().getMensajePorIndice();
        System.out.println("\n==============================================\n");
        Residente2.getBandejaDeEntrada().mostrar();
        Residente2.getBandejaDeEntrada().getMensajePorIndice();
        System.out.println("\n==============================================\n");
        
    }
    
}


