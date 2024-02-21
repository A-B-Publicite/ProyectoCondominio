
package Administracion;

import java.io.Serializable;

public class Servicio implements Serializable{
    private String nombreDelServicio;
    private Contrato contrato;
    
    public Servicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }
    
    public void ejecutar(){
        contrato.iniciar();
    }
}
