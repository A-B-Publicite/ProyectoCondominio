package ModuloMueble;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import Administracion.Residente;
import java.util.Date;

public class MenuAlquilerMueble {
   
public static void mostrar() {
 
 //menu alquiler mueble
 
 String tipoMueble; 
 int    cantidad; 
 Date   diaInicio; 
 Date   diaFin; 
 
    
Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mueblesAlquilados = new HashMap<>();

        boolean salir = false;

        do {
            System.out.println("ALQUILER DE MUEBLES ");
            System.out.println("INGRESE EL TIPO DE MUEBLES");
            System.out.println("1.- MESA");
            System.out.println("2.- SILLA");
            System.out.println("3.- CARPA");
            
            System.out.println("INGRESE LA CANTIDAD DE MUEBLES");         

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                         System.out.println("INGRESE LA FECHA DE FIN E INICIO DE ALQUILER");  
                         // VERIFICAR SI ESTÁ LA FECHA DISPONIBLE
                         diaInicio = scanner.nextLine(); 
                    // FECHA 
                    // NUMERO DE MUEBLES
                    // VERIFICAR SI ESE MUEBLE ESTA DISPONIBLE PARA ESA FECHA.      
                         
                         
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