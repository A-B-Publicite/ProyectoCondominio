
import Administracion.*;
import Comunicacion.*;
import Finanzas.*;
import Inmueble.*;
import areaComun.*;
import check_in.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorman Chuquer, echar la culpa a el si algo sale mal
 */
public class Main {

    public static void main(String[] args) {
        Administrador administrador = new Administrador("juan.zambrano@condominio.com", "12345", "Juan", "Zambrano");
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOGIN");
        System.out.print("Usuario:");

        String usuario = scanner.nextLine();

        System.out.print("Contrasenia: ");
        String contrasenia = scanner.nextLine();

        do {
            Menu.menuAdministracion(administrador);
        } while (opcion != 0);

    }
}
