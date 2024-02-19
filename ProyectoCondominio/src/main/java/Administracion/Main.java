/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

/**
 *
 * @author jeanp
 */
public class Main {
    Administrador administrador = new Administrador("juan.correa@epn.edu.ec", "admin1234", "Juan Correa", new Condominio ("Montanas del sol"));
    
    Departamento departamento = new Departamento(24,propietario);
    administrador.agregarInmuebleComun(new Gimnasio(24));
    administrador.agregarDepartamento(24);
    Contrato contrato = new Contrato();
    administrador.pagarContrato(contrato);
    
    administrador.agregarDirectiva("Juan", "Pedro");
    
    Residente residente = administrador.registrarResidente("julio.zambrano@chone.ec", "chonero1234", "Julio Zambrano", true);
    
    Directiva directiva = new Directiva(administrador);
    
    directiva.elegirDirectiva("Jorge", "Julio");
    
    directiva.aprobarContrato(contrato);
}