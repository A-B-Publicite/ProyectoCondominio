package Administracion;

import Comunicacion.BandejaDeEntrada;
import Finanzas.Cuenta;
import check_in.Autorizacion;
import check_in.HistorialEntrada;
import check_in.RegistroEntrada;
import check_in.Validacion;
import java.io.Serializable;

public abstract class Perfil implements Serializable {

    protected String correo;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;
    protected Aprobacion aprobacionDeContrato;
    protected BandejaDeEntrada bandejaDeEntrada = new BandejaDeEntrada(this);
    protected Cuenta cuentaBancaria;
    Autorizacion autorizacion;
    protected HistorialEntrada historialDeEntradas = new HistorialEntrada();

    public Perfil(String nombre, String apellido) {
        this.correo = nombre.toLowerCase() + "." + apellido.toLowerCase() + "@policon.com";
        this.contrasenia = nombre.toLowerCase() + "123";
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentaBancaria = new Cuenta();
        this.aprobacionDeContrato = null;

    }

    public Cuenta getCuenta() {
        return cuentaBancaria;
    }

    public Perfil(String correo, String contrasena, String nombreApellido) {
        this.correo = correo;
        this.contrasenia = contrasena;
        this.nombre = nombreApellido;
        this.bandejaDeEntrada = new BandejaDeEntrada(this);
    }

    public String getNombreApellido() {
        return nombre + " " + apellido;
    }

    public BandejaDeEntrada getBandejaDeEntrada() {
        return bandejaDeEntrada;
    }

    public void setBandejaDeEntrada(BandejaDeEntrada bandejaDeEntrada) {
        this.bandejaDeEntrada = bandejaDeEntrada;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void realizarCheckIn(String fechaLlegada, String horaLlegada) {
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(this.autorizacion);
        registro.registrarEntrada(fechaLlegada, horaLlegada);
        historialDeEntradas.aniadirRegistro(registro);
    }
    
    public void validarAutorizacion(Autorizacion autorizacion){
        Validacion validacion = new Validacion();
        validacion.validar(this,autorizacion);
    }
    
    public void setAutorizacion(Autorizacion autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getNombresCompletos() {
        return nombre + " " + apellido;
    }

    public HistorialEntrada getHistorialDeEntradas() {
        return historialDeEntradas;
    }

}
