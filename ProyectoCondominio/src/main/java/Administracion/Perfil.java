
package Administracion;

import Comunicacion.BandejaDeEntrada;
import Finanzas.Cuenta;

public abstract class Perfil {
    protected String correo;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    protected BandejaDeEntrada bandejaDeEntrada;
    protected Cuenta cuentaBancaria;
    
    public Perfil(String nombre, String apellido) {
        this.correo = nombre + "." + apellido + "@policondominio.com";
        this.contrasenia = nombre+ "123";
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
