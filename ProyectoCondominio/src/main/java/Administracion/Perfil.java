
package Administracion;

public abstract class Perfil {
    private String correo;
    private String contrasena;
    private String nombreApellido;
    
    public Perfil(String correo, String contrasena, String nombreApellido){
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombreApellido = nombreApellido;
    }
    
    public String getNombreApellido() {
        return nombreApellido;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
