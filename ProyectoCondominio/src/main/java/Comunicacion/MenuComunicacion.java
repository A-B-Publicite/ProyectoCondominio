/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.*;
import Inmueble.Condominio;
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
    
    public static void mostrar (Perfil origen) throws IOException, ClassNotFoundException {
        
        
        try {
            FileInputStream fileInputStream = new FileInputStream("Datos/datos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Administrador adminEnFichero = (Administrador)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        int tipo = 0;
        System.out.println("Elija el tipo de mensaje a enviar (escriba un numero): \n" +
                "1. Global\n" +
                "2. Directo\n" +
                "3. Directiva\n");
        tipo = scanner.nextInt();
        scanner.nextLine();
        int pos=1;
        
        Mensaje mensaje;
        
        switch (tipo) {
            case 1:
                mensaje = new Global(origen, residentes);
                mensaje.crear();
            break;
            case 2:
                mensaje = new Directo(origen, residentes);
                mensaje.crear();
            break;
            case 3:
                mensaje = new Consejo(origen, directiva);
                mensaje.crear();
            default:
                throw new AssertionError();
        }
    }
    
}
