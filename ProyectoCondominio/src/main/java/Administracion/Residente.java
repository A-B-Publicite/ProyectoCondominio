package Administracion;

import Inmueble.Departamento;

public class Residente extends Perfil{
    private boolean esPropietario;
    private Departamento departamento;

    public Residente( String correo, String contrasena, String nombre,boolean esPropietario) {
        super(correo, contrasena, nombre);
        this.esPropietario = esPropietario;
    }
    
    public void reservarAreaComun(){
        // Hagan los de Reserva
    }
    
    public void pagarAlicuota(){
        // Hagan los de financieros
    }
    
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    public Boolean esPropietario(){
        return esPropietario;
    }
}
