package Administracion;

import Finanzas.Cuenta;
import Inmueble.Departamento;
import java.util.Scanner;

public class Residente extends Perfil{
    private boolean esPropietario;
    private Departamento departamento;
    private Cuenta cuenta;

    public Residente( String correo, String contrasena, String nombre,boolean esPropietario, Administrador administrador) {
        super(correo, contrasena, nombre);
        this.esPropietario = esPropietario;
        this.cuenta = new Cuenta((Cuenta) administrador.getCuenta());

    }
    
    public void reservarAreaComun(){
        // Hagan los de Reserva
    }
    
    public void pagarAlicuota(){
        // Hagan los de financieros
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
    public Boolean esPropietario(){
        return esPropietario;
    }
    
    public Boolean aprobar(Contrato contrato){
        System.out.print(contrato);
        Scanner scanner = new Scanner(System.in);
        int tipo = 0;
        System.out.println("""
                           Elija:
                           1. Aprobar
                           0. Negar
                           """);
        tipo = scanner.nextInt();
        scanner.nextLine();
        
        switch(tipo){
            case 1:
                return true;
            case 2:
                return false;
            default:
                return false;
        }
        
    }
}
