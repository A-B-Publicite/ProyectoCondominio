
package Administracion;

import Comunicacion.BandejaDeEntrada;
import Finanzas.Cuenta;

public abstract class Perfil {
    private String correo;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private BandejaDeEntrada bandejaDeEntrada;
    private Cuenta cuentaBancaria;
    
    public Perfil(String correo, String contrasenia, String nombre, String apellido) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public Perfil(String correo, String contrasena, String nombreApellido){
        this.correo = correo;
        this.contrasenia = contrasena;
        this.nombre = nombreApellido;
        this.bandejaDeEntrada = new BandejaDeEntrada(this);
    }
    
    public String getNombreApellido() {
        return nombre;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public BandejaDeEntrada getBandejaDeEntrada() {
        return bandejaDeEntrada;
    }
    
}
