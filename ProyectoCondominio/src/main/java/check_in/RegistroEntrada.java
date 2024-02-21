/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

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
        System.out.println(this.toString());
    }
    
    public void asignarParqueadero(Perfil reservador, EspacioDeParqueadero espacio){
        AdministrarReserva adminReserva = new AdministrarReserva();        
        usoParqueadero = adminReserva.realizarReserva(espacio, "uso de parqueadero", reservador);
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
        return "RegistroEntrada: " + 
                "\nfechaLlegada: " + fechaLlegada + " horaLlegada:" + horaLlegada + 
                "\nAutorización: " + 
                    "\nAutorizador: " + autorizacion.autorizador + " Autorizado: " + autorizacion.autorizado +
                     "\nFecha inicio: " + autorizacion.fechaInicio + "\nFecha fin: " + autorizacion.fechaFin + 
                "\n usoParqueadero=" + usoParqueadero + '}';
    }   
}
