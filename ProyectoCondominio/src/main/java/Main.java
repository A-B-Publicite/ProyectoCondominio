
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
        // Crear un objeto
            

            // Guardar el objeto en un archivo
            FileOutputStream fos = new FileOutputStream("src/main/java/Datos/datosAdmin.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(administrador);
            System.out.println("Me guarde");
            oos.close();
            fos.close();

            // Leer el objeto desde el archivo
            FileInputStream fis = new FileInputStream("src/main/java/Datos/datosAdmin.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Administrador objetoLeido = (Administrador) ois.readObject();
            ois.close();
            fis.close();
               /*

            // Reabrir el flujo de salida para escribir el objeto modificado
            fos = new FileOutputStream("src/Dato/archivo.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(objetoLeido);
            System.out.println("Me guarde");
            oos.close();
            fos.close();

            // Reabrir el flujo de entrada para leer el objeto modificado
            fis = new FileInputStream("src/Dato/archivo.txt");
            ois = new ObjectInputStream(fis);
            Residente objetoLeido2 = (Residente) ois.readObject();
            ois.close();
            fis.close();

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
                    Menu.menuAdministracion(adminEnFichero, opcion);
                    
                    break;
                case 2:
                    MenuFinanzas.menuFinanzas(adminEnFichero); 
                    break;
                case 3:
                    MenuR.menuReservas(adminEnFichero);
                    break;
                case 4:
                    MenuCI.menuCheckIn(adminEnFichero, opcion);
                    break;
                case 5:
                    MenuComunicacion.mostrar();
                    break;
                case 0:
                    System.exit(0);
                    break;
                
            }
        } while (opcion[0] != 0);
        
        try {
    FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/Datos/datosAdmin.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(adminEnFichero);
    objectOutputStream.close();
} catch (IOException e) {
    e.printStackTrace();
}
*/
    }

}
