/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Perfil;
import ModuloReservas.Reserva;

/**
 *
 * @author MARQUEZ
 */
public class RegistroEntrada {
    private String fechaLlegada;
    private String horaLlegada;
    private Autorizacion autorizacion;
    private Reserva reservaParqueadero;

    public RegistroEntrada() {
    }

    public void setAutorizacion(Autorizacion autorizacion) {
        this.autorizacion = autorizacion;
    }
    
    public void registrarEntrada(String fechaLlegada, String horaLlegada){
        if(autorizacion==null)
            System.out.println("Se necesita una autorización. Envíe una autorización válida");
        if(!autorizacion.getAprobado())
            System.out.println("La autorización no ha sido aprobada");
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;        
    }
    
    public void asignarParqueadero(String fechaFin, Perfil reservador){
        reservaParqueadero = new Reserva(10,"Lunes", "Uso de parqueadero", reservador);
    }
}
