/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MenuComunicacion {
    
    public static void mostrar () throws IOException, ClassNotFoundException {

        
        List<Perfil> residentes = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream("src/main/java/Datos/datosResidentes.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        residentes = (List<Perfil>)objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        FileInputStream fileInputStreamA = new FileInputStream("src/main/java/Datos/datosAdmin.txt");
        ObjectInputStream objectInputStreamA = new ObjectInputStream(fileInputStreamA);
        Perfil admin = (Perfil)objectInputStreamA.readObject();
        objectInputStreamA.close();
        fileInputStreamA.close();

        int tipo=1;
        
        while (tipo!=0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elija el tipo de mensaje a enviar (escriba un numero): \n" +
                    "1. Global\n" +
                    "2. Directo\n" +
                    "3. Directiva\n" +
                    "4. Ver Bandejas"
                    + "0. Salir\n");
            tipo = scanner.nextInt();
            scanner.nextLine();

            Mensaje mensaje;

            /*List<Perfil> directiva = new ArrayList<>();
            directiva.add(adminEnFichero.getCondominio().getDirectiva().getPresidente());
            directiva.add(adminEnFichero.getCondominio().getDirectiva().getSecretario());  */ 

            switch (tipo) {
                case 1:
                    mensaje = new Global(admin, residentes);
                    mensaje.crear();
                break;
                case 2:
                    mensaje = new Directo(admin, residentes);
                    mensaje.crear();
                break;
                case 3:
                    mensaje = new Consejo(admin, residentes);
                    mensaje.crear();
                break;
                case 4:
                    int pos;
                    System.out.println("Elija el perfil a ver: ");
                    System.out.println("Eliga el destinatario");
                    for (int i = 0; i < residentes.size(); i++) {
                        System.out.println((i + 1) + ". " + residentes.get(i).getNombre());
                    }
                    pos=scanner.nextInt();
                    scanner.nextLine();
                    residentes.get(pos-1).getBandejaDeEntrada().mostrar();
                    residentes.get(pos-1).getBandejaDeEntrada().getMensajePorIndice();
                break;
                default:
                    System.out.println("Salio de comunicacion");;
            }

              
        }
        

    }
    
}
