
package Administracion;

import Comunicacion.BandejaDeEntrada;
import Finanzas.Cuenta;
import check_in.Autorizacion;
import check_in.RegistroEntrada;
import java.io.Serializable;

public abstract class Perfil implements Serializable{
    protected String correo;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    protected BandejaDeEntrada bandejaDeEntrada;
    protected Cuenta cuentaBancaria;
    private Autorizacion autorizacion;
    
    public Perfil(String nombre, String apellido) {
        this.correo = nombre + "." + apellido + "@policondominio.com";
        this.contrasenia = nombre+ "123";
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentaBancaria = new Cuenta();
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public Cuenta getCuenta() {
        return cuentaBancaria;
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

    public String getNombre() {
        return nombre;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada){
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(this.autorizacion);
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }

    public void setAutorizacion(Autorizacion autorizacion) {
        this.autorizacion = autorizacion;
    }
    
    
}
