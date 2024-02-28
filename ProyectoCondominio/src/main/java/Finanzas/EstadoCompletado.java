package Finanzas;

import java.io.Serializable;

public class EstadoCompletado extends EstadoObligacion implements Serializable {


    public EstadoCompletado(ObligacionFinanciera obligacionFinanciera) {
        super(obligacionFinanciera);
    }

    @Override
    public String toString() {
        return "completado";
    }

    @Override
    public void cambiarACompletado() {

    }

    @Override
    public void cambiarAAtrasado() {

    }
}
