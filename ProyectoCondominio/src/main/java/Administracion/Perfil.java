
package Administracion;

public abstract class Perfil {
    private String correo;
    private String contrasena;
    private String nombre;
    public Perfil(String correo, String contrasena, String nombre){
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }
    
    public void registrar(){
        
    }
    
    public void registrarIngreso(){
        
    }
}
