
import Administracion.Administrador;
import Administracion.Contrato;
import Administracion.Directiva;
import Administracion.Residente;
import Inmueble.Condominio;
import Inmueble.Gimnasio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorma
 */
public class Main {
    public static void main(String[] args) {
        
        //datos quemados
        Administrador administrador = new Administrador("juan.correa@epn.edu.ec", "admin1234", "Juan Correa", new Condominio ("Montanas del sol"));
        Directiva directiva = new Directiva(administrador);
        Gimnasio gym = new Gimnasio(24, administrador);
        Contrato contrato = new Contrato("00/00/0000", "125.12", "descripcion","11/11/1111", "22/2/2222" );

   
        //Pruebas funcionales modulo 1 comunicacion
        //Pruebas funcionales modulo 2 comunicacion
        //Pruebas funcionales modulo 3 comunicacion
        //Pruebas funcionales modulo 4 comunicacion
        //Pruebas funcionales modulo 5 comunicacion
        //Pruebas funcionales modulo 6 comunicacion
            //REQ_MA_CU-ManejarCondominio_01
            //Se realiza en el constructor de Administrador.    
            //REQ_MA_CU-ManejarCondominio_02
            administrador.agregarInmueble(gym);
            administrador.agregarInmueble(new Departamento(24));
            //REQ_MA_CU-RegResidente_01. 
            Residente residente = administrador.registrarResidente("julio.zambrano@chone.ec", "chonero1234", "Julio Zambrano", true);
            //REQ_MA_CU-ContratarServicio_01.
            directiva.aprobarContrato(contrato);   
            //REQ_MA_CU-ElegirMiembros _01. 
            directiva.agregarDirectiva("Juan", "Pedro");
        
        
    }
}
