/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comunicacion;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public abstract class Mensaje implements Serializable{
    private Perfil origen;
    private ArrayList<Residente> destinos= new ArrayList<>();
    private Residente destino;
    private Administrador destinoAdmin;
    private String contenido;
    private LocalDateTime fecha;
    private String titulo;

    //Crea el mensaje
    public Mensaje(Perfil origen, ArrayList<Residente> destino) {
        this.origen = origen;
        this.destinos = destino;
        this.fecha = LocalDateTime.now();
    }
    
    //Crea el mensaje
    public Mensaje(Perfil origen, Residente destino) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = LocalDateTime.now();
    }
    
    public Mensaje (Perfil origen, Administrador destino) {
        this.origen = origen;
        this.destinoAdmin = destino;
        this.fecha = LocalDateTime.now();
    }    
    

    public abstract void crear();
    public abstract void enviar();

    public abstract void mostrar();

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Residente getDestino() {
        return destino;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public Perfil getOrigen() {
        return origen;
    }

    public void setOrigen(Perfil origen) {
        this.origen = origen;
    }

    public String getFecha() {
        // Crear el formateador de fecha y hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm:ss");
        // Formatear la fecha y hora usando el formateador y devolver como String
        return fecha.format(formatter);
    }

    public List<Residente> getDestinos() {
        return destinos;
    }

}
