package Administracion;

import java.io.Serializable;
import java.util.ArrayList;

public class Directiva implements Serializable {

    Residente presidente;
    Residente secretario;
    Administrador administrador;

    ArrayList<Contrato> contratosAprobados;
    ArrayList<Contrato> contratosPorAprobar;

    public Directiva(Administrador administrador) {
        contratosPorAprobar = new ArrayList<Contrato>();
        contratosAprobados = new ArrayList<Contrato>();
        this.administrador = administrador;
        this.presidente = presidente;
        this.secretario = secretario;
    }

    public void agregarDirectiva(Residente presidente, Residente secretario) {
        setPresidente(presidente);
        setSecretario(secretario);
        presidente.setAprobacion(this);
        secretario.setAprobacion(this);
    }

    public void setPresidente(Residente presidente) {
        this.presidente = presidente;
    }

    public void setSecretario(Residente secretario) {
        this.secretario = secretario;
    }

    public ArrayList<Contrato> getContratosAprobados() {
        return contratosAprobados;
    }

    public Contrato getContratoAprobado(String descripcionContratoAPagar) {
        for (Contrato contrato : contratosAprobados) {
            if (contrato.compararDescripcion(descripcionContratoAPagar)) {
                return contrato;
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
        for (Contrato contrato : contratosPorAprobar) {
            System.out.println(descripcionContrato + '\t' + contrato.getDescripcion());
            if (contrato.compararDescripcion(descripcionContrato)) {
                System.out.println("DENTRO DEL IF" + this.getClass());
                contrato.darAprobacion();
                if (contrato.estaAprobado()) {
                    System.out.println("INGRESE A ESTA PROBADO");
                    System.out.println("Contratos por aprobar"+contratosPorAprobar.size());
                    contratosAprobados.add(contrato);
                    System.out.println("ENTRE AL IF DE CONTRATOS APORBADOS"+contratosAprobados.size());
                    //contrato.iniciar(); //TODO: IMPLEMENTAR
                    contratosPorAprobar.remove(contrato);
                    System.out.println(contratosPorAprobar.size());
                    break;
                }
            }
        }
        //verificarQueElContratoSeaAprobado(descripcionContrato);
    }

    private void verificarQueElContratoSeaAprobado(Contrato contrato) {
        if (contrato.estaAprobado()) {
            contratosPorAprobar.remove(contrato);
            contrato.iniciar();
            contratosAprobados.add(contrato);
        }
    }

    public boolean esParte(Residente residente) {

        return residente.getNombre().equals(presidente.getNombre()) || residente.getNombre().equals(secretario.getNombre());
    }

    public ArrayList<Contrato> getListaContratosPorApobar() {
        return contratosPorAprobar;
    }

}
