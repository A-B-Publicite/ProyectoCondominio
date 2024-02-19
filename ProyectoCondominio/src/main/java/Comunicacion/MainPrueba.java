/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Perfil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPrueba {
    public static void main(String[] args) {

        List<Perfil> residentes = new ArrayList<>();

        Perfil Administrador = new Perfil("Pepe", "Administrador");
        Perfil Residente1 = new Perfil("Juan", "Residente");
        Perfil Residente2 = new Perfil("Pedro", "Residente");

        residentes.add(Residente1);
        residentes.add(Residente2);

        Scanner scanner = new Scanner(System.in);
        int tipo = 0;
        System.out.println("Elija el tipo de mensaje a enviar (escriba un numero): \n" +
                "1. Global\n" +
                "2. Directo\n" +
                "3. Reporte Pago\n" +
                "4. Reporte Inmueble\n" +
                "5. Reporte Visitante\n");
        tipo = scanner.nextInt();
        scanner.nextLine();
        int pos=1;
        if (tipo!=1) {
            System.out.println("Eliga el destinatario");
            for (int i = 0; i < residentes.size(); i++) {
                System.out.println((i + 1) + ". " + residentes.get(i).getNombre());

            }
            pos= scanner.nextInt();
        }




        Administrador.accionar(tipo, Administrador,residentes.get(pos-1), residentes);

        Residente1.getBandejaDeEntrada().mostrar();

    }
}

