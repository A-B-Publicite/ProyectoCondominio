
package Administracion;

import java.io.Serializable;

public class Servicio implements Serializable{
    private String nombreDelServicio;
    
    public Servicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }
    
    public void ejecutar(Object objeto){
        javax.swing.JOptionPane.showMessageDialog(null, "El papa nunca debería controlar, si sale este mensaje esta mal");
    }
}
