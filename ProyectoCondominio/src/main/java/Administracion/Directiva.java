package Administracion;
import java.util.ArrayList;
public class Directiva {
    Residente presidente;
    Residente secretario;
    Administrador administrador;
    ArrayList<Contrato> listaContratos;
    
    public Directiva(Administrador administrador){
        this.presidente = presidente;
        this.secretario = secretario;
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
        
        // Implementar en condominio
        this.presidente = administrador.(obtenerResidente(nombrePresidente));
        this.secretario = administrador.(obtenerResidente(nombreSecretario));
        
        

    }
    
    public void aprobarContrato(Contrato contrato){
        if(!presidente.aprobar(contrato) || !secretario.aprobar(contrato)){
            System.out.print("No se aprobo el contrato");
            return;
        }
        
        System.out.print("Se aprobo el contrato");
        listaContratos.add(contrato);
    }
}
