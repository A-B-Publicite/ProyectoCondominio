
import Administracion.*;
import Comunicacion.*;
import Finanzas.*;
import GUI.AutenticadorMenu;
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
        AutenticadorMenu menu = new AutenticadorMenu();
        
        
        // DATO QUEMADO PARA PROBAR LA FUNCIONALIDAD DEL MODULO ADMINISTRACION
        Administrador admin = new Administrador("Julio", "Zambrano");
        //Administrador adminLeido = null;
        //ESCRIBIR
        FileOutputStream fos = new FileOutputStream("src/main/java/Datos/datosAdmin.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(admin);
        System.out.println("Me guarde");
        oos.close();
        fos.close();
        
        
        // Leer el objeto desde el archivo
        FileInputStream fis = new FileInputStream("src/main/java/Datos/datosAdmin.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Administrador adminLeido = (Administrador) ois.readObject();
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
                    Menu.menuAdministracion(adminLeido, opcion);
                    
                    break;
                case 2:
                    MenuFinanzas.menuFinanzas(adminLeido); 
                    break;
                case 3:
                    MenuR.menuReservas(adminLeido);
                    break;
                case 4:
                    MenuCI.menuCheckIn(adminLeido, opcion);
                    break;
                case 5:
                    MenuComunicacion.mostrar();
                    break;
                case 0:
                    opcion[0] = 0;
                    break;
                
            }
        } while (opcion[0] != 0);
        
        //Sobreescribo
        fos = new FileOutputStream("src/main/java/Datos/datosAdmin.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(adminLeido);
        System.out.println("Me guarde");
        oos.close();
        fos.close();

    }

}
