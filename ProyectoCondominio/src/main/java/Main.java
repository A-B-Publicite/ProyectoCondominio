
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
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/Datos/datosAdmin.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(administrador);
        objectOutputStream.close();

        //Lectura del objeto admin
        FileInputStream fileInputStream = new FileInputStream("src/main/java/Datos/datosAdmin.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Administrador adminEnFichero = (Administrador) objectInputStream.readObject();
        objectOutputStream.close();

        int opcion[] = new int[1];
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
                               2. Finanzas
                               3. Reservas
                               4. Check In
                               5. Comunicacion
                               0. Salir
                               """);

            opcion[0] = scanner.nextInt();
            
            switch (opcion[0]) {
                case 1:
                    Menu.menuAdministracion(administrador, opcion);
                    
                    break;
                case 2:
                    MenuFinanzas.menuFinanzas(administrador); 
                    break;
                case 3:
                    MenuR.menuReservas(adminEnFichero);
                    break;
                case 4:
                    MenuCI.menuCheckIn(adminEnFichero, opcion);
                    break;
                case 5:

                    break;
                case 6:
                    MenuComunicacion.mostrar();
                    break;
                
            }
        } while (opcion[0] != 0);
    }
}
