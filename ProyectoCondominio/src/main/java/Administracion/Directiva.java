package Administracion;
import java.util.ArrayList;
public class Directiva {
    Residente presidente;
    Residente secretario;
    Administrador administrador;
    ArrayList<Contrato> contratosAprobados;
    
    public Directiva(Administrador administrador){
        this.administrador = administrador;
    }
    
    public void agregarDirectiva(Residente presidente, Residente secretario){
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

    public Contrato getContrato(String descripcionContratoAPagar) {
        Contrato contratoAPagar = null;
        for (Contrato centrato : contratosAprobados) {
            if (centrato.compararDescripcion(descripcionContratoAPagar)) {
                return contratoAPagar;
            }
        }
        return null;
    }
}
