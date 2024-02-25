/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import java.io.Serializable;

/**
 *
 * @author JHON
 */
public class Visitante implements Serializable{
    private String motivoVisita;
    private String nombre;
    private String personaAVisitar;

    public Visitante(String motivoVisita, String nombre, String personaAVisitar) {
        this.motivoVisita = motivoVisita;
        this.nombre = nombre;
        this.personaAVisitar = personaAVisitar;
    }

    public String getMotivoVIsita() {
        return motivoVisita;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPersonaAVisitar() {
        return personaAVisitar;
    }
}
