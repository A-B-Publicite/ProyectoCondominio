package Administracion;
import java.util.ArrayList;
public class Directiva {
    Residente presidente;
    Residente secretario;
    Administrador administrador;
    ArrayList<Contrato> contratosAprobados;
    
    public Directiva(Administrador administrador){
        this.presidente = null;
        this.secretario = null;
        this.administrador = administrador;
    }
    
    public void elegirDirectiva(String nombrePresidente, String nombreSecretario){
        // Implementar condominio
        Residente presidente = administrador.obtenerResidente(nombrePresidente);
        Residente secretario = administrador.obtenerResidente(nombreSecretario);
        
        if(!presidente.esPropietario() || !secretario.esPropietario()){
            System.out.print("Los candidatos no son propietarios");
            return;
        }
        this.presidente = presidente;
        this.secretario = secretario;
    }
    
    public void aprobarContrato(Contrato contrato){
        if(!presidente.aprobar(contrato) || !secretario.aprobar(contrato)){
            System.out.print("No se aprobo el contrato");
            return;
        }
        
        System.out.print("Se aprobo el contrato");
        contratosAprobados.add(contrato);
    }
    
    public ArrayList<Contrato> mostrarContratos(){
        return contratosAprobados;
    }

}
