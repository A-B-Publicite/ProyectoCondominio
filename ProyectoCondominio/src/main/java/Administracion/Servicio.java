
package Administracion;

public class Servicio {
    private String nombreDelServicio;
    private Contrato contrato;
    
    public Servicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }
    
    public void ejecutar(){
        contrato.iniciar();
    }
}
