
package Administracion;

import Comunicacion.BandejaDeEntrada;

public abstract class Perfil {
    private String correo;
    private String contrasena;
    private String nombreApellido;
    private BandejaDeEntrada bandejaDeEntrada;
    public Perfil(String correo, String contrasena, String nombreApellido){
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombreApellido = nombreApellido;
        this.bandejaDeEntrada = new BandejaDeEntrada(this);
    }
    
    public String getNombreApellido() {
        return nombreApellido;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public BandejaDeEntrada getBandejaDeEntrada() {
        return bandejaDeEntrada;
    }
    
}
