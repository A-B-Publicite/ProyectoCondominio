package Administracion;
import java.io.Serializable;
import java.util.ArrayList;
public class Directiva implements Serializable{
    Residente presidente;
    Residente secretario;
    Administrador administrador;
    
    ArrayList<Contrato> contratosAprobados;
    ArrayList<Contrato> contratosPorAprobar;
    
    public Directiva(Administrador administrador){
        this.administrador = administrador;
    }
    
    public void agregarDirectiva(Residente presidente, Residente secretario){
        this.presidente = presidente;
        this.secretario = secretario;
        presidente.setAprobacion();
        secretario.setAprobacion();
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

    public void agregarContrato(Contrato contratoNuevo) {
        contratosPorAprobar.add(contratoNuevo);
    }

    public Residente getPresidente() {
        return presidente;
    }

    public Residente getSecretario() {
        return secretario;
    }

    private void solicitarAprobacion(Contrato contrato) {
        //presidente.darContratoParaAprobar(contrato);
        //secretario.darContratoParaAprobar(contrato);
        /*
        if(!presidente.aprobar(contrato) || !secretario.aprobar(contrato)){
            System.out.print("No se aprobo el contrato");
            return;
        }
        
        System.out.print("Se aprobo el contrato");
        contratosAprobados.add(contrato);
*/
    }

    
}
