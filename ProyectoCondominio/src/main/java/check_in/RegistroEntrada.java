/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

/**
 *
 * @author MARQUEZ
 */
public class RegistroEntrada {
    private String fechaLlegada;
    private String horaLlegada;
    private Autorizacion autorizacion;
    

    public RegistroEntrada() {
    }
    
    public void registrarEntrada(String fechaLlegada, String horaLlegada){
        if(!autorizacion.getAprobado())
            System.out.println("No se ha encontrado una autorización aprobada");
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;        
    }
    
    public void asignarParqueadero(){
    }
}
