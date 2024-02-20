
import Administracion.*;
import Comunicacion.*;
import Finanzas.*;
import Inmueble.*;
import areaComun.*;
import check_in.*;
import java.util.*;
/**
 *
 * @author jorman Chuquer, echar la culpa a el si algo sale mal
 */
public class Main {

    public static void main(String[] args) {
        
        // DATO QUEMADO PARA PROBAR LA FUNCIONALIDAD DEL MODULO ADMINISTRACION
        Administrador administrador = new Administrador("juan.zambrano@condominio.com", "12345", "Juan", "Zambrano");
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOGIN");
        System.out.print("Usuario:");

        String usuario = scanner.nextLine();

        System.out.print("Contrasenia: ");
        String contrasenia = scanner.nextLine();
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

        do {
            switch (opcion) {
                case 1:
                    Menu.menuAdministracion(administrador);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                default:
                    throw new AssertionError("No ha escogido una opcion correcta");
            }
        } while (opcion != 0);

    }
}
