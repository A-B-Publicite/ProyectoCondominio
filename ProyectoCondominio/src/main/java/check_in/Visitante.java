/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

/**
 *
 * @author JHON
 */
public class Visitante {
    private String motivoVIsita;
    private String nombre;
    private String personaAVisitar;
    private Vehiculo vehiculo;

    public Visitante(String motivoVIsita, String nombre, String personaAVisitar) {
        this.motivoVIsita = motivoVIsita;
        this.nombre = nombre;
        this.personaAVisitar = personaAVisitar;
    }

    public String getMotivoVIsita() {
        return motivoVIsita;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPersonaAVisitar() {
        return personaAVisitar;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
}
}
