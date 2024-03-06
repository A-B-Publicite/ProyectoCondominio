package ModuloMuebles;

import Administracion.Administrador;
import Administracion.Servicio;
import static GUI.AdminGUI.GestionMueble.inventario;
import Inmueble.Condominio;

public class Mantenimiento {
    
    Condominio condominio;
    String descripcion;
    Servicio servicio;
    
    public Mantenimiento(String descripcion) {
        this.descripcion = descripcion;
    }

    public void realizarMantenimiento(){
        servicio.ejecutar(); 
        actualizarMantenimiento("Carpa", 1);//ejemplo
    }
    
    public void actualizarMantenimiento(String muebleReparar,int cantidad){
        inventario.repararMuebles(muebleReparar, cantidad);
    }  
    
}
