package Inmueble;
import java.io.FileWriter;
import java.io.IOException;

public class TituloPropiedad {
    private String cedulaPropietario;
    private String nombrePropietario;
    private String numeroPredio;

    public TituloPropiedad(String cedulaPropietario, String nombrePropietario, String numeroPredio) {
        this.cedulaPropietario = cedulaPropietario;
        this.nombrePropietario = nombrePropietario;
        this.numeroPredio = numeroPredio;
    }


    public void crearTitulo() {
        String fileName = "titulo_propiedad_" + this.nombrePropietario + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Cedula identidad: " + this.cedulaPropietario + "\n");
            writer.write("Propietario: " + this.nombrePropietario + "\n");
            writer.write("Número de predio: " + this.numeroPredio + "\n");
            System.out.println("Título de propiedad creado correctamente en el archivo: " + fileName);
        } catch (IOException e) {
            System.out.println("Error al crear el título de propiedad en el archivo: " + fileName);
        }
    }

}