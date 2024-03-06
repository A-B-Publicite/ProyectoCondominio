package ModuloMuebles;

import Administracion.Administrador;
import Administracion.Servicio;
import static GUI.AdminGUI.GestionMueble.inventario;
import Inmueble.Condominio;

public class Reparacion {
    
    Condominio condominio;
    String descripcion;
    Servicio servicio;
    
    public Reparacion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void realizarReparacion(){
        //servicio.ejecutar(); 
        actualizarMantenimiento("Carpa", 1);//ejemplo
    }
    
    public void actualizarMantenimiento(String muebleReparar,int cantidad){
        inventario.repararMuebles(muebleReparar, cantidad);
    }  
    
}
