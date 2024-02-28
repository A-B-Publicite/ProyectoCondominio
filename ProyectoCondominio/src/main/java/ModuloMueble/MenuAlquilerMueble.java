package ModuloMueble;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuAlquilerMueble {

	private static Map<String, Integer> mueblesDisponibles = new HashMap<>();
	static {
		// datos quemados
		mueblesDisponibles.put("Silla", 25);
		mueblesDisponibles.put("Mesa", 52);
		mueblesDisponibles.put("Carpa", 21);
	}

	public static void mostrar() {

		// menu alquiler mueble

		Scanner scanner = new Scanner(System.in);
		Map<String, Mueble> mueblesAlquilados = new HashMap<>();

		boolean salir = false;

		do {
			System.out.println("Menu de Alquiler de Muebles");
			System.out.println("1. Alquilar Muebles");
			System.out.println("2. Ver Muebles Alquilados");
			System.out.println("3. Ver Muebles Disponibles");
			System.out.println("4. Anular Reserva");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opcion: ");

			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				alquilarMueble(scanner, mueblesAlquilados);
				break;
			case 2:
				verMueblesAlquilados(mueblesAlquilados);
				break;
			case 3:
				verMueblesDisponibles();
				break;
			case 4:
				anularReserva(scanner, mueblesAlquilados);
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

	private static void alquilarMueble(Scanner scanner, Map<String, Mueble> mueblesAlquilados) {
		System.out.println("Seleccione el tipo de mueble que desea alquilar:");
		System.out.println("1. Silla");
		System.out.println("2. Mesa");
		System.out.println("3. Carpa");
		System.out.print("Seleccione una opción: ");

		int opcionMueble = scanner.nextInt();
		String tipoMueble = "";

		switch (opcionMueble) {
		case 1:
			tipoMueble = "Silla";
			break;
		case 2:
			tipoMueble = "Mesa";
			break;
		case 3:
			tipoMueble = "Carpa";
			break;
		default:
			System.out.println("Opción no válida.");
			return;
		}

		System.out.print("Ingrese la cantidad de " + tipoMueble + " que desea alquilar: ");
		int cantidad = scanner.nextInt();

		if (cantidad > mueblesDisponibles.get(tipoMueble)) {
			System.out.println("Lo sentimos, no hay suficientes " + tipoMueble + " disponibles.");
			return;
		}

		System.out.print("Ingrese la cantidad de días para la reserva: ");
		int diasReserva = scanner.nextInt();
		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFinal = fechaInicio.plusDays(diasReserva);

		fechaFinal = fechaFinal.plusDays(-1);
		Mueble nuevoMueble = null;
		switch (tipoMueble) {
		case "Silla":
			nuevoMueble = new Silla(cantidad, fechaInicio, fechaFinal);
			break;
		case "Mesa":
			nuevoMueble = new Mesa(cantidad, fechaInicio, fechaFinal);
			break;
		case "Carpa":
			nuevoMueble = new Carpa(cantidad, fechaInicio, fechaFinal);
			break;
		}

		mueblesAlquilados.put(tipoMueble, nuevoMueble);
		mueblesDisponibles.put(tipoMueble, mueblesDisponibles.get(tipoMueble) - cantidad);
		System.out.println("Ha alquilado " + cantidad + " " + tipoMueble + "(s) desde el " + fechaInicio + " hasta el "
				+ fechaFinal + ".");
	}

	private static void verMueblesAlquilados(Map<String, Mueble> mueblesAlquilados) {
		System.out.println("Muebles alquilados:");
		if (mueblesAlquilados.isEmpty()) {
			System.out.println("\033[1mNo se han alquilado Muebles\033[0m");
		} else {
			for (Mueble mueble : mueblesAlquilados.values()) {
				System.out.println(mueble.getTipo() + ": " + mueble.getCantidad() + " - Desde: "
						+ mueble.getFechaInicio() + " Hasta: " + mueble.getFechaFinal());
			}
		}
	}

	private static void verMueblesDisponibles() {
		System.out.println("Muebles disponibles:");
		for (Map.Entry<String, Integer> entry : mueblesDisponibles.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static void anularReserva(Scanner scanner, Map<String, Mueble> mueblesAlquilados) {
		System.out.println("Seleccione el tipo de mueble que desea anular la reserva:");
		System.out.println("1. Silla");
		System.out.println("2. Mesa");
		System.out.println("3. Carpa");
		System.out.print("Seleccione una opción: ");

		int opcion = scanner.nextInt();

		String tipoMueble;
		switch (opcion) {
		case 1:
			tipoMueble = "Silla";
			break;
		case 2:
			tipoMueble = "Mesa";
			break;
		case 3:
			tipoMueble = "Carpa";
			break;
		default:
			System.out.println("Opción no válida.");
			return;
		}

		if (!mueblesAlquilados.containsKey(tipoMueble) || mueblesAlquilados.get(tipoMueble).getCantidad() == 0) {
			System.out.println("\033[1mNo hay reservas de " + tipoMueble + " para anular.\033[0m");
			return;
		}

		System.out.print("\033[1mIngrese la cantidad de " + tipoMueble + " que desea anular: \033[0m");
		int cantidadAnular = scanner.nextInt();

		Mueble muebleExistente = mueblesAlquilados.get(tipoMueble);
		int cantidadExistente = muebleExistente.getCantidad();

		if (cantidadAnular > cantidadExistente) {
			System.out.println("\033[1mNo se pueden anular más reservas de " + tipoMueble
					+ " de las que se han realizado.\033[0m");
			return;
		}

		muebleExistente.setCantidad(cantidadExistente - cantidadAnular);
		mueblesDisponibles.put(tipoMueble, mueblesDisponibles.get(tipoMueble) + cantidadAnular);
		System.out.println("\033[1mSe han anulado " + cantidadAnular + " reservas de " + tipoMueble + ".\033[0m");
	}
}
