
import Administracion.*;
import Comunicacion.*;
import Finanzas.*;
import Inmueble.*;
import ModuloReservas.MenuR;
import check_in.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author jorman Chuquer, echar la culpa a el si algo sale mal
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // DATO QUEMADO PARA PROBAR LA FUNCIONALIDAD DEL MODULO ADMINISTRACION
        Administrador administrador = new Administrador("Juan", "Zambrano");

        //Escribo a bits el admin
        FileOutputStream fileOutputStream = new FileOutputStream("datosAdmin.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(administrador);
        objectOutputStream.close();

        //Lectura del objeto admin
        FileInputStream fileInputStream = new FileInputStream("datosAdmin.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Administrador adminEnFichero = (Administrador) objectInputStream.readObject();
        objectOutputStream.close();

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOGIN");
        System.out.print("Usuario:");

        String usuario = scanner.nextLine();

        System.out.print("Contrasenia: ");
        String contrasenia = scanner.nextLine();

        do {
            System.out.println("""
                               Opciones para probar el sistema:
                               1. Administracion
                               2. Inmuebles
                               3. Reservas
                               4. Check In
                               5. Finanzas
                               6. Comunicacion
                               0. Salir
                               """);

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Menu.menuAdministracion(adminEnFichero);
                    
                    break;
                case 2:

                    break;
                case 3:
                    //MenuR.menuReservas(administrador);
                    break;
                case 4:
                    administrador.realizarCheckIn("20/2/2024", "23:00");
                    break;
                case 5:

                    break;
                case 6:
                    //MenuComunicacion.mostrar(adminEnFichero);
                    break;
                default:
                    throw new AssertionError("No ha escogido una opcion correcta");
            }
        } while (opcion != 0);
    }
}
