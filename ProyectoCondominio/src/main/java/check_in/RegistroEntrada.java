/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Administrador;
import Administracion.Perfil;
import Inmueble.EspacioDeParqueadero;
import Inmueble.ParqueaderoPrivado;
import ModuloReservas.AdministrarReserva;
import ModuloReservas.Reserva;
import java.io.Serializable;

/**
 *
 * @author MARQUEZ
 */
public class RegistroEntrada implements Serializable{
    private String fechaLlegada;
    private String horaLlegada;
    private Autorizacion autorizacion;
    private Object usoParqueadero;

    public RegistroEntrada() {
    }

    public void setAutorizacion(Autorizacion autorizacion) {
        this.autorizacion = autorizacion;
    }
    
    public void registrarEntrada(String fechaLlegada, String horaLlegada){
        if(autorizacion==null){
            System.out.println("Se necesita una autorización. Envíe una autorización válida");
            return;}
        if(!autorizacion.getAprobado()){
            System.out.println("La autorización no ha sido aprobada");
            return;}
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
    }
    
    public void asignarParqueadero(Administrador admin,Perfil reservador, String diaReserva){
        AdministrarReserva adminReserva = new AdministrarReserva();        
        usoParqueadero = adminReserva.realizarReserva("uso de parqueadero", admin,4,diaReserva, reservador.getCorreo());
    }
    
    public void usarParqueaderoAsignado(String fechaFin,ParqueaderoPrivado parqueadero){
        if(parqueadero==null){
            System.out.println("No cuenta con un espacio de parqueadero privado");
            return;}
        
        parqueadero.usar();
        usoParqueadero = parqueadero;
    }

    @Override
    public String toString() {
        return "\nRegistroEntrada: " + 
                "\nFecha Llegada: " + fechaLlegada + " Hora Llegada:" + horaLlegada + 
                "\nDatos de Autorización: " + 
                    "\nAutorizador: " + autorizacion.autorizador + " Autorizado: " + autorizacion.autorizado +
                     "\nFecha inicio: " + autorizacion.fechaInicio + "\nFecha fin: " + autorizacion.fechaFin + 
                "\n Uso de parqueadero=" + usoParqueadero + '\n';
    }   
}
