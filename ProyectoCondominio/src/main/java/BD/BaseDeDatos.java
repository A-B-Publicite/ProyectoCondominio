package BD;

import Administracion.Administrador;
import Administracion.Residente;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos {
    public static ArrayList<Residente> residentes;
    public static Administrador administrador;
    
    public static void actualizarListaDeResidentes(Residente nuevoResidente) {
        residentes.add(nuevoResidente);
        escribir(residentes, "src/main/java/Datos/datosResidentes.txt");
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
        ArrayList<Residente> residentes = (ArrayList<Residente>) leer("src/main/java/Datos/datosResidentes.txt");
        return buscarResidente( residentes, correo, contrasenia);
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
        try {
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            if (ois.available() > 0) {
                objetoleido = ois.readObject();
                System.out.println("Objeto leído correctamente.");
            } else {
                System.out.println("No hay más datos para leer en el archivo.");
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return objetoleido;
    }

    private static Residente buscarResidente(ArrayList<Residente> residentes, String correo, String contrasenia) {
        for(Residente residente : residentes){
            if(residente.getCorreo().equals(correo)&& residente.getContrasenia().equals(contrasenia)){
                return residente;
            }
        }
        return null;
    }
    
    public static ArrayList<Residente> obtenerListaResidente () throws IOException, ClassNotFoundException {
        ArrayList<Residente> residentes = (ArrayList<Residente>) leer("src/main/java/Datos/datosResidentes.txt");
        return residentes;
    }
}
