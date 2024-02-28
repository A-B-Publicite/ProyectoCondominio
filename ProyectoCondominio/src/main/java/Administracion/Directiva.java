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

    public void actualizarAprobacion(String descripcionContrato) {
        for (Contrato contrato : contratosAprobados) {
            if (contrato.compararDescripcion(descripcionContrato)) {
                contrato.darAprobacion();
            }
        }
    }

    
}
