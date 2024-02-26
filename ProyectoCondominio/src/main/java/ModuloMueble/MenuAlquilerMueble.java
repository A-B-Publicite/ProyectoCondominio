package ModuloMueble;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import Administracion.Residente;

public class MenuAlquilerMueble {
   
public static void mostrar() {
 
 //menu alquiler mueble  
    
Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mueblesAlquilados = new HashMap<>();

        boolean salir = false;

        do {
            System.out.println("Menú de Alquiler de Muebles");
            System.out.println("1. Alquilar Silla");
            System.out.println("2. Alquilar Mesa");
            System.out.println("3. Alquilar Carpa");
            System.out.println("4. Ver Muebles Alquilados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    alquilarMueble("Silla", scanner, mueblesAlquilados);
                    break;
                case 2:
                    alquilarMueble("Mesa", scanner, mueblesAlquilados);
                    break;
                case 3:
                    alquilarMueble("Carpa", scanner, mueblesAlquilados);
                    break;
                case 4:
                    verMueblesAlquilados(mueblesAlquilados);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
            }

        } while (!salir);

        System.out.println("Gracias por utilizar el sistema de alquiler de muebles. ¡Hasta luego!");
    }

    private static void alquilarMueble(String tipoMueble, Scanner scanner, Map<String, Integer> mueblesAlquilados) {
        System.out.print("Ingrese la cantidad de " + tipoMueble + " que desea alquilar: ");
        int cantidad = scanner.nextInt();

        if (mueblesAlquilados.containsKey(tipoMueble)) {
            cantidad += mueblesAlquilados.get(tipoMueble);
        }

        mueblesAlquilados.put(tipoMueble, cantidad);
        System.out.println("Ha alquilado " + cantidad + " " + tipoMueble + "(s).");
    }

    private static void verMueblesAlquilados(Map<String, Integer> mueblesAlquilados) {
        System.out.println("Muebles alquilados:");
        for (Map.Entry<String, Integer> entry : mueblesAlquilados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 
    
    
    
    
    
      
}
}