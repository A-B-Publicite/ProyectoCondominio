package Administracion;
import java.util.ArrayList;
public class Directiva {
    Residente presidente;
    Residente secretario;
    Administrador administrador;
    ArrayList<Contrato> listaContratos;
    
    public Directiva(Residente presidente, Residente secretario, Administrador administrador){
        this.presidente = presidente;
        this.secretario = secretario;
        this.administrador = administrador;
    }
    public void elegirMiembrosDirectiva(){
        
    }
    public void contratarServicio(){
        
    }
}
