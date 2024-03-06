/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;


import Inmueble.EspacioDeParqueadero;
import check_in.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Guardia extends Perfil implements Serializable{
    private List<String> residentes = new ArrayList<>();
    private List<Autorizacion> autorizaciones = new ArrayList<>();  
    private HistorialEntrada entradasVisitantes = new HistorialEntrada();
    
    public Guardia(String nombre, String apellido) {        
        super(nombre, apellido);
    }
   
    public void registrarEntrada(String visitante, String fechaLlegada, String horaLlegada, boolean quiereEstacionamiento, Administrador admin){
        RegistroEntrada registro = new RegistroEntrada();
        Autorizacion autorizacion = buscarAutorizacion(visitante);
        if( autorizacion == null){
            System.out.println("No tengo el registro de una autorizacion para usted");
            return;}
        registro.setAutorizacion(autorizacion);
        if (quiereEstacionamiento){
            String diaSemana = CalcularDiaSemana(fechaLlegada);
            registro.asignarParqueadero(admin,this, diaSemana);
        }
        registro.registrarEntrada(fechaLlegada, horaLlegada);
        entradasVisitantes.aniadirRegistro(registro);
    }
    
    public Autorizacion crearAutorizacion(Visitante visitante, String fechaLlegada, String horaLlegada) {
        Autorizacion autorizacionInmediata = new Autorizacion();        
        autorizacionInmediata.completar(this.getNombreApellido(), visitante.getNombre(), fechaLlegada, fechaLlegada);
        validarAutorizacion(autorizacionInmediata);
        autorizaciones.add(autorizacionInmediata);
        return autorizacionInmediata;
    }
    
    public void verificarExistenciaResidente(String personaAVisitar){
        String residente = buscarResidente(personaAVisitar);
        if(residente == null){
            System.out.println("No tengo el registro de ningun residente llamado asi");
            return;}
    }

    private String buscarResidente(String personaAVisitar) {
        String residenteEncontrado = null;
        for (String residente : residentes) {
            if (residente.equals(personaAVisitar)) {
                residenteEncontrado = residente;
            }
        }      
        return residenteEncontrado;
    }

    private Autorizacion buscarAutorizacion(String autorizado) {
        Autorizacion autorizacionEncontrada = null;
        for (Autorizacion autorizacion : autorizaciones) {
            Comparacion comparar = new Comparacion();
            if (comparar.compararAutorizado(autorizado, autorizacion)) {
                autorizacionEncontrada = autorizacion;
            }
        }        
        return autorizacionEncontrada;
    }

    public void setResidentes(List<String> residentes) {
        this.residentes = residentes;
    }

    public void setAutorizaciones(List<Autorizacion> autorizaciones) {
        this.autorizaciones = autorizaciones;
    }    
    
    public HistorialEntrada getEntradasVisitantes() {
        return entradasVisitantes;
    }
    
    public static String CalcularDiaSemana(String fecha)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Parsea la fecha de entrada a un objeto LocalDate
        LocalDate fechaLocal = LocalDate.parse(fecha, formatter); 
        // Obtiene el nombre del día de la semana en español
        String nombreDia = fechaLocal.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES")); 
        if(nombreDia.equals("lunes") )nombreDia="Lunes";
        if(nombreDia.equals("martes") )nombreDia="Martes";
        if(nombreDia.equals("miércoles") )nombreDia="Miercoles";
        if(nombreDia.equals("jueves") )nombreDia="Jueves";
        if(nombreDia.equals("viernes") )nombreDia="Viernes";
        if(nombreDia.equals("sabado") )nombreDia="Sabado";
        if(nombreDia.equals("domingo") )nombreDia="Domingo";
        return nombreDia;
    }
}
