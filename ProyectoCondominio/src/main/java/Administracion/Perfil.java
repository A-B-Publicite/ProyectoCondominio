
package Administracion;

public abstract class Perfil {
    private String correo;
    private String contrasena;
    private String nombre;
    
    public Perfil(String correo, String contrasena, String nombreApellido){
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }
    
    public void registrar(){
        
    }
    
    public void registrarIngreso(){
        
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
