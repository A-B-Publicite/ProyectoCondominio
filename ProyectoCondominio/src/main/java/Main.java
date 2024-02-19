
import Administracion.Administrador;
import Administracion.Contrato;
import Administracion.Directiva;
import Administracion.Perfil;
import Administracion.Residente;
import Comunicacion.Directo;
import Comunicacion.Global;
import Comunicacion.Mensaje;
import Finanzas.ObligacionFinanciera;
import Inmueble.Condominio;
import Inmueble.Gimnasio;
import Inmueble.*;
import areaComun.*;
import check_in.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        Contrato contrato = new Contrato("00/00/0000", 125.12, "descripcion","11/11/1111", "22/2/2222" );
        List<Perfil> residentes = new ArrayList<>();

        Perfil Residente1 = new Residente("juan123@epn.edu.ec", "123", "Juan", true, administrador );
        Perfil Residente2 = new Residente("juan123@epn.edu.ec", "123", "Pedro", true, administrador);

        residentes.add(Residente1);
        residentes.add(Residente2);
   
        //Pruebas funcionales modulo 1 comunicacion      
        Scanner scanner = new Scanner(System.in);
        
        int aux=1;
        
        do {
            
            int tipo = 0;
            System.out.println("Elija el tipo de mensaje a enviar (escriba un numero): \n" +
                    "1. Global\n" +
                    "2. Directo\n");
            tipo = scanner.nextInt();
            scanner.nextLine();

            Mensaje mensaje;

            String titulo;
            String contenido;

            switch (tipo) {
                case 1:
                    System.out.println("Destino: Todos");
                    System.out.println("Escriba el Titulo del mensaje:");
                    titulo = scanner.nextLine();
                    System.out.println("Escriba el contenido del mensaje:");
                    contenido = scanner.nextLine();
                    mensaje = new Global(administrador, residentes,contenido,titulo);
                    mensaje.enviar(); 
                break;

                case 2:
                    int pos;
                    System.out.println("Eliga el destinatario");
                    for (int i = 0; i < residentes.size(); i++) {
                        System.out.println((i + 1) + ". " + residentes.get(i).getNombreApellido());
                    }
                    pos= scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Destino: " + residentes.get(pos-1).getNombreApellido());
                    System.out.println("Escriba el Titulo del mensaje:");
                    titulo = scanner.nextLine();
                    System.out.println("Escriba el contenido del mensaje:");
                    contenido = scanner.nextLine();
                    mensaje = new Directo(administrador, residentes.get(pos-1),contenido,titulo);
                    mensaje.enviar();
                break;
                default:
                    System.out.println("No existe opcion");
                break;
            }
            System.out.println("Desea continuar? 1=Si ; 0=No");
            aux = scanner.nextInt();
            scanner.nextLine();
        } while (aux==1);
      
        System.out.println("\n==============================================\n");
        Residente1.getBandejaDeEntrada().mostrar();
        Residente1.getBandejaDeEntrada().getMensajePorIndice();
        System.out.println("\n==============================================\n");
        Residente2.getBandejaDeEntrada().mostrar();
        Residente2.getBandejaDeEntrada().getMensajePorIndice();
        System.out.println("\n==============================================\n");
        
        
        //Pruebas funcionales modulo 2 finanzas
        
        Residente residente = administrador.registrarResidente("julio.zambrano@chone.ec", "chonero1234", "Julio Zambrano", true);
       

        String resultadoConsulta = residente.getCuenta().mostrarObligaciones();
        System.out.println(resultadoConsulta);

        residente.getCuenta().recargarDinero(700, "123");

        resultadoConsulta = String.valueOf(residente.getCuenta());
        System.out.println(resultadoConsulta);

        ObligacionFinanciera obligacionFinanciera = residente.getCuenta().recuperarObligacion("1");

        residente.getCuenta().pagar(obligacionFinanciera);

        resultadoConsulta = String.valueOf(administrador.getCuenta());
        System.out.println(resultadoConsulta);

        resultadoConsulta = residente.getCuenta().mostrarRegistro();
        System.out.println(resultadoConsulta);


        administrador.pagarContrato(contrato);
        resultadoConsulta = administrador.getCuenta().mostrarRegistro();
        System.out.println(resultadoConsulta);
        
        //Pruebas funcionales modulo 3 comunicacion
        //Pruebas funcionales modulo 4 Reservas Areas Comunes
        // Creamos un usuario de tipo Administrador
        Administrador usuarioReserva = new Administrador("pepe.julio@epn.edu.ec", "acabenmodulos", "Pepe Julio", new Condominio ("Fis EPN"));
        
        // Creamos una lista de reservas
        List<Reserva> listaReservas = new ArrayList<>();
        
        // Creamos una lista de días disponibles
        List<String> diasDisponibles = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        
        // Crear un área común tipo Cancha con sus atributos
        Cancha areaComunReserva = new Cancha(listaReservas, diasDisponibles, "cancha1", 100, true, 100, usuarioReserva);

        // Creamos el Administrador de las Reservas
        AdministrarReserva adminReserva = new AdministrarReserva();

        // Creamos una Reserva para la Cancha1
        String diaReserva = "lunes";
        String detalleReserva = "Futbolito";
        Reserva nuevaReserva = adminReserva.realizarReserva(areaComunReserva, diaReserva, detalleReserva, usuarioReserva);
        if(nuevaReserva != null){
            System.out.println("Reserva creada con éxito:");
            
           
        }else{
            System.out.println("No se pudo crear la reserva");
        }
        
        //Pruebas funcionales modulo 5 comunicacion
        //Pruebas funcionales modulo 6 comunicacion
            //REQ_MA_CU-ManejarCondominio_01
            //Se realiza en el constructor de Administrador.    
            //REQ_MA_CU-ManejarCondominio_02
            administrador.agregarInmuebleComun(gym);
            administrador.agregarInmuebleComun(new Departamento(24));
            //REQ_MA_CU-RegResidente_01. 
            Residente residenteNuevo = administrador.registrarResidente("julio.zambrano@chone.ec", "chonero1234", "Julio Zambrano", true);
            //REQ_MA_CU-ContratarServicio_01.
            directiva.aprobarContrato(contrato);   
            //REQ_MA_CU-ElegirMiembros _01. 
            directiva.elegirDirectiva("Juan", "Pedro");
        
            
            //Moulo check-in pruebas
            //Prueba con un residente sin vehiculo
            AutorizacionPerfil autorizacionResidente = new AutorizacionPerfil();
            autorizacionResidente.completar("Admin", "Residente", "19/2/2024", "19/2/2030");
            autorizacionResidente.validar();
            //Paso a hacer el registro
            RegistroEntrada registroResidente = new RegistroEntrada();
            registroResidente.registrarEntrada("19/2/2024", "15:00");   //No se ha enviado la autorizacion del residente
            //enviamos la autorizacion y volvemos a intentar registrar
            registroResidente.setAutorizacion(autorizacionResidente);
            registroResidente.registrarEntrada("19/2/2024", "15:00");
            
            //Prueba con un visitante sin vehiculo
            Visitante visitante = new Visitante("Visita","Visitante", "Residente1");
            AutorizacionVisita autorizacionVisita = new AutorizacionVisita();
            //Tratar de realizar el registro sin una autorizacion
            RegistroEntrada registroVisitante = new RegistroEntrada();
            registroVisitante.registrarEntrada("19/2/2024", "14:00");
            //Enviamos la autorizacion sin llenar
            registroVisitante.setAutorizacion(autorizacionVisita);
            registroVisitante.registrarEntrada("19/2/2024", "14:00");
            //Llenamos la autorización
            autorizacionVisita.completar("Residente1", visitante.getNombre(), "19/2/2024", "19/2/2024");
            registroVisitante.setAutorizacion(autorizacionVisita);
            registroVisitante.registrarEntrada("19/2/2024", "14:00");
        
    }
}
