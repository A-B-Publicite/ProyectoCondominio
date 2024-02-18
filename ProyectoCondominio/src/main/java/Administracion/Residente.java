package Administracion;

public class Residente extends Perfil{
    private boolean esPropietario;

    public Residente(boolean esPropietario, String correo, String contrasena, String nombre) {
        super(correo, contrasena, nombre);
        this.esPropietario = esPropietario;
    }
    
    
    public void reservarAreaComun(){
        
    }
    
    public void pagarAlicuota(){
        
    }
}
