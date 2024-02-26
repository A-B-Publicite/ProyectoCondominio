package BD;


import Administracion.Administrador;
import Administracion.Residente;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author intel
 */
public class BaseDeDatos {
    public static ArrayList<Residente>residentes;
    public static Administrador administrador;
    
    
    public static void actualizarListaDeResidentes(Residente nuevoResidente) {
        residentes.add(nuevoResidente);
        escribir(residentes, "src/main/java/Datos/datosResidentes.txt");
    }
    
    public static Administrador leerAdministrador() {
        return (Administrador) leer("src/main/java/Datos/datosAdmin.txt"); 
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
            System.out.println("Me guarde");
            oos.close();
            fos.close();
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public static Object leer(String dir) {
        Object objetoleido = null;
        try {
        FileInputStream fis = new FileInputStream(dir);
        ObjectInputStream ois = new ObjectInputStream(fis);
        objetoleido = ois.readObject();
        fis.close();
        ois.close();
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
}
