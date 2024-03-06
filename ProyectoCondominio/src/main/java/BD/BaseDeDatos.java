package BD;

import Administracion.Administrador;
import Administracion.Guardia;
import Administracion.Residente;
import ModuloMuebles.*;
import ModuloReservas.Reserva;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos implements Serializable{
    public static ArrayList<Residente> residentes = new ArrayList<Residente>();
    public static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    public static Administrador administrador;
    public static Guardia guardia;
    
    public static void actualizarListaDeResidentes(Residente nuevoResidente) {
        residentes.add(nuevoResidente);
        escribir(residentes, "src/main/java/Datos/datosResidentes.txt");
    }
    public static void setGuardia(Guardia guardia){
        BaseDeDatos.guardia = guardia;
        escribir(guardia, "src/main/java/Datos/datosGuardia.txt");
    }
    
    public static Administrador leerAdministrador() {
        Object objetoLeido = leer("src/main/java/Datos/datosAdmin.txt");
        if (objetoLeido instanceof Administrador) {
            return (Administrador) objetoLeido;
        } else {
            System.out.println("El objeto leído no es una instancia de Administrador.");
            return null;
        }
    }

    public static Residente getResidente(String correo, String contrasenia) {
        //Administrador administrador = BaseDeDatos.leerAdministrador();
        return BaseDeDatos.leerAdministrador().getResidentePorCorreo(correo);
        /*
        ArrayList<Residente> residentes = (ArrayList<Residente>) leer("src/main/java/Datos/datosResidentes.txt");
        try {
            System.out.println("Si encontre el residente solicitado pa");
            return buscarResidente(residentes, correo, contrasenia);
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("No encontre el residente solicitado pa");
        return null;*/
    }

    public static void escribir(Object objetoALeer, String dir) {
        try {
            FileOutputStream fos = new FileOutputStream(dir);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objetoALeer);
            oos.close();
            fos.close();
            System.out.println("Objeto escrito correctamente.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    
    public static Object leer(String dir) {
        Object objetoleido = null;
        FileInputStream fis;
        File file = new File(dir);
        if (file.exists() && file.length() != 0) {
            try {
                fis = new FileInputStream(dir);
                ObjectInputStream ois = new ObjectInputStream(fis);
                objetoleido = ois.readObject();
                System.out.println("Objeto leído correctamente.");
                fis.close();
                ois.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("El archivo no existe o está vacío.");
        }
        
        return objetoleido;
    }

    private static Residente buscarResidente(ArrayList<Residente> residentes, String correo, String contrasenia) throws Exception {
        for(Residente residente : residentes){
            if(residente.getCorreo().equals(correo)&& residente.getContrasenia().equals(contrasenia)){
                System.out.println("Encontre el residente");
                return residente;
            }
        }
        throw new Exception("No existe ese residente");

    }
    
    public static ArrayList<Residente> obtenerListaResidente () throws IOException, ClassNotFoundException {
        ArrayList<Residente> residentes = (ArrayList<Residente>) leer("src/main/java/Datos/datosResidentes.txt");
        return residentes;
    }

    public static void escribirAdmin(Administrador administrador) {
        escribir(administrador, "src/main/java/Datos/datosAdmin.txt");
    }
    
    public static void escribirMueble(Mueble mueble) {
        escribir(administrador, "src/main/java/Datos/datosMuebles.txt");
    }
    
    
    public static Guardia  leerGuardia() throws IOException, ClassNotFoundException {
        
        Object objetoLeido = leer("src/main/java/Datos/datosGuardia.txt");
        if (objetoLeido instanceof Guardia) {
            return (Guardia) objetoLeido;
        } else {
            System.out.println("El objeto leído no es una instancia de guardia.");
            return null;
        }
        
    }
    
    public static void escribirGuardia(Guardia guardia) {
        escribir(guardia, "src/main/java/Datos/datosGuardia.txt");
    }
    
    public static void combinarListaResidente(ArrayList<Residente> res) {
        escribir(res, "src/main/java/Datos/datosResidentes.txt");
    }
    
    public static void escribirReserva(Reserva reserva) {
        escribir(reserva, "src/main/java/Datos/datosReserva.txt");
    }

    public static ArrayList<Reserva> leerReservas() {
        Object objetoLeido = leer("src/main/java/Datos/datosReserva.txt");
        if (objetoLeido instanceof Reserva) {
            ArrayList<Reserva> listaReservas = new ArrayList<>();
            listaReservas.add((Reserva) objetoLeido);
            return listaReservas;
        } else if (objetoLeido instanceof ArrayList<?>) {
            return (ArrayList<Reserva>) objetoLeido;
        } else {
            System.out.println("El objeto leído no es una instancia de Reserva o ArrayList<Reserva>.");
            return new ArrayList<Reserva>();
        }
    }

    public static void actualizarListaDeReservas(Reserva nuevaReserva) {
        reservas.add(nuevaReserva);
        for (Reserva reserva : reservas) {

            System.out.println(reserva.getDia());
        }
        escribir(reservas, "src/main/java/Datos/datosReserva.txt");
    }

    public static void reprogramarReserva(int id, String nuevoDia) {
        ArrayList<Reserva> reservas = leerReservas();
        boolean reservaEncontrada = false;

        // Recorrer la lista de reservas para encontrar la reserva con el ID proporcionado
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                // Reprogramar la reserva cambiando su día
                //reserva.setDia(nuevoDia);
                reserva.reprogramar(nuevoDia);
                System.out.println("Lista reservas 1");
                System.out.println(reserva.getDia()+" "+reserva.getId());
                System.out.println(nuevoDia);
                reservaEncontrada = true;
                break; // Salir del bucle una vez que se haya encontrado y reprogramado la reserva
            }
        }

        if (!reservaEncontrada) {
            System.out.println("No se encontró ninguna reserva con el ID proporcionado.");
        } else {
            // Escribir la lista actualizada de reservas en el archivo
            escribir(reservas, "src/main/java/Datos/datosReserva.txt");
            System.out.println("Reserva reprogramada correctamente.");
            for (Reserva reserva : reservas) {
                System.out.println("Lista reservas 2");
                System.out.println(reserva.getDia()+" "+reserva.getId());
                System.out.println(nuevoDia);
            }
        }
    }
}