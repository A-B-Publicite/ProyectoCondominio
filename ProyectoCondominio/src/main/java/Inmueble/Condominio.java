package Inmueble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Condominio extends Inmueble {

    private List<Inmueble> listaInmuebles;


    public Condominio(List<Inmueble> listaInmuebles, String tipo, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(tipo, metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.listaInmuebles = listaInmuebles;
    }

    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmueble(Inmueble inmueble) {
        listaInmuebles.add(inmueble);
    }

    public void crearCondominio(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;

            while ((line = br.readLine()) != null) {
                Inmueble inmueble = new Inmueble() {
                };
                
                String[] parts = line.split(",");
                String tipoI = parts[0];
                double metrosC = Double.parseDouble(parts[1]);
                String ubicacionI = parts[2];
                boolean mantenimiento = Boolean.parseBoolean(parts[3]);
                double valorAlicuota = Double.parseDouble(parts[4]);
                String cedula = parts[5];
                String nombre = parts[6];
                String predio = parts[7];
                TituloPropiedad tituloPropiedadI = new TituloPropiedad(cedula, nombre, predio);
                String id_Departamento = parts[9];
                String id_ParqueaderoP = parts[10];
                String id_ParqueaderoC = parts[11];
                boolean disponibilidad = Boolean.parseBoolean(parts[12]);
                int capacidadI=Integer.parseInt(parts[13]);
                String id_Cancha = parts[14];
                String tipo_Cancha = parts[15];
                switch (tipoI) {
                    case "Departamento":
                        Departamento departamento = new Departamento(id_Departamento, tipoI, metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = departamento;
                        break;
                    case "ParqueaderoPrivado":
                        ParqueaderoPrivado parqueaderoP = new ParqueaderoPrivado(id_ParqueaderoP, tipoI, metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = parqueaderoP;
                        break;
                    case "ParqueaderoPublico":
                        ParqueaderoPublico parqueaderoC = new ParqueaderoPublico(id_ParqueaderoC, disponibilidad, capacidadI, tipoI,metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = parqueaderoC;
                        break;
                    case "Cancha":
                        Cancha cancha=new Cancha(id_Cancha, tipo_Cancha, disponibilidad, capacidadI, tipoI,metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = cancha;
                        break;
                    case "Piscina":
                        Piscina piscina= new Piscina(disponibilidad, capacidadI, tipoI,metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = piscina; 
                        break;
                    case "Gimnasio":
                        Gimnasio gimnasio = new Gimnasio(disponibilidad, capacidadI, tipoI, metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = gimnasio;
                        break;
                    case "Terraza":
                        Terraza terraza = new Terraza(disponibilidad, capacidadI, tipoI, metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = terraza;
                        break;
                    default:
                        System.out.println("Tipo no reconocido");
                        break;
                }
                agregarInmueble(inmueble);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + nombreArchivo);
        }
    }
}
