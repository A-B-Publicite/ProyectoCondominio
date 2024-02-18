package Administracion;

public class Residente extends Perfil{
    private boolean esPropietario;

    public Residente(boolean esPropietario, String correo, String contrasena) {
        super(correo, contrasena);
        this.esPropietario = esPropietario;
    }
    
    
    public void reservarAreaComun(){
        
    }
    
    public void pagarAlicuota(){
        
    }
}
