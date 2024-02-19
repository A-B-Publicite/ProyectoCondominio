
package Administracion;

import Comunicacion.BandejaDeEntrada;
import Comunicacion.Mensaje;
import java.util.List;

public abstract class Perfil {
    private String correo;
    private String contrasena;
    private String nombre;
    Mensaje mensaje;
    BandejaDeEntrada bandejaDeEntrada;
    
    
    public Perfil(String correo, String contrasena, String nombre){
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.bandejaDeEntrada = new BandejaDeEntrada(this);
    }
    
    public void registrar(){
        
    }
    
    public void registrarIngreso(){
        
    }

    public String getNombre() {
        return nombre;
    }
    
       
    public BandejaDeEntrada getBandejaDeEntrada() {
        return bandejaDeEntrada;
    }
}
