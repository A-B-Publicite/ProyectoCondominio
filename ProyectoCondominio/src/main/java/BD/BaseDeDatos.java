package BD;

import Administracion.Administrador;
import Administracion.Guardia;
import Administracion.Residente;
import ModuloMuebles.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos implements Serializable{
    public static ArrayList<Residente> residentes = new ArrayList<Residente>();
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
        ArrayList<Residente> residentes = (ArrayList<Residente>) leer("src/main/java/Datos/datosResidentes.txt");
        try {
            return buscarResidente(residentes, correo, contrasenia);
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
                return residente;
            }
        }
        throw new Exception("No existe ese residente");
        //return null;
    }
    
    public static ArrayList<Residente> obtenerListaResidente () throws IOException, ClassNotFoundException{
        ArrayList<Residente> residentes = (ArrayList<Residente>) leer("src/main/java/Datos/datosResidentes.txt");
        return residentes;
    }

    public static void escribirAdmin(Administrador administrador) {
        escribir(administrador, "src/main/java/Datos/datosAdmin.txt");
    }
    
    public static void escribirMueble(Mueble mueble) {
        escribir(mueble, "src/main/java/Datos/datosMuebles.txt");
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
}