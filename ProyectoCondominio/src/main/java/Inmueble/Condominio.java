package Inmueble;

import Administracion.Perfil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;


public class Condominio extends Inmueble {

    private List<Inmueble> listaInmuebles;

    public Condominio(List<Inmueble> listaInmuebles, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
        this.listaInmuebles = listaInmuebles;
    }

    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmueble(Inmueble inmueble) {
        listaInmuebles.add(inmueble);
    }

    public void crearCondominio(String nombreArchivo) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));

            String line;

            while ((line = br.readLine()) != null) {
                Inmueble inmueble = new Inmueble() {
                };

                String[] parts = line.split(",");
                String nombreInmueble = parts[0];
                double metrosC = Double.parseDouble(parts[1]);
                boolean mantenimiento = Boolean.parseBoolean(parts[2]);
                double valorAlicuota = Double.parseDouble(parts[3]);
                String correo = parts[4];
                String contrasenia = parts[5];
                String nombreP = parts[6];
                Perfil propietarioI = new Perfil(correo, contrasenia, nombreP) {
                };
                String diasDisponiblesI = parts[7];
                
                Departamento departamento = new Departamento(nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(departamento);

                ParqueaderoPrivado parqueaderoP = new ParqueaderoPrivado(nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(parqueaderoP);

                ParqueaderoPublico parqueaderoC = new ParqueaderoPublico(null, diasDisponiblesI, nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(parqueaderoC);

                Cancha cancha = new Cancha(null, diasDisponiblesI, nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(cancha);

                Piscina piscina = new Piscina(null, diasDisponiblesI, nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(piscina);

                Gimnasio gimnasio = new Gimnasio(null, diasDisponiblesI, nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(gimnasio);

                Terraza terraza = new Terraza(null, diasDisponiblesI, nombreInmueble, metrosC, mantenimiento, valorAlicuota, propietarioI);
                agregarInmueble(terraza);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el archivo: " + nombreArchivo);
        }

    }
}



