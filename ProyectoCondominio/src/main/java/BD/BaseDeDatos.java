package BD;


import Administracion.Administrador;
import Administracion.Residente;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/Datos/datosResidentes.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(residentes);
            System.out.println("Me guarde");
            oos.close();
            fos.close();
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void lectura(Residente nuevoResidente) {
        residentes.add(nuevoResidente);
        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/Datos/datosResidentes.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(residentes);
            System.out.println("Me guarde");
            oos.close();
            fos.close();
        } catch (Exception ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public static Administrador leerAdministrador() {
        return administrador; 
    }

    public static Object getAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
