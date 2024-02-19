/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import check_in.Autorizacion;
import check_in.RegistroEntrada;

/**
 *
 * @author MARQUEZ
 */
public class Guardia extends Perfil{
    
    public Guardia(String correo, String contrasena, String nombreApellido) {
        super(correo, contrasena, nombreApellido);
    }
    
    public void realizarCheckIn(String fechaLlegada, String horaLlegada, Autorizacion autorizacion){
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(autorizacion);
        registro.registrarEntrada(fechaLlegada, horaLlegada);        
    }
}
