
package Administracion;

import java.io.Serializable;

public class Servicio implements Serializable{
    private String nombreDelServicio;
    
    public Servicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }
    
    public void ejecutar(){
        javax.swing.JOptionPane.showMessageDialog(null, "Ejecutando...");

    }
}
