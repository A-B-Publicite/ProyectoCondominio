/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import areaComun.Reserva;

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
            System.out.println("No se ha encontrado una autorización aprobada");
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;        
    }
    
    public void asignarParqueadero(String fechaFin, String reservador){
        reservaParqueadero = new Reserva(10,fechaLlegada, fechaFin, "Uso de parqueadero", reservador); 
    }
}
