package Finanzas;

import java.io.Serializable;

public class EstadoAtrasado extends EstadoObligacion implements Serializable {


    public EstadoAtrasado(ObligacionFinanciera obligacionFinanciera) {
        super(obligacionFinanciera);
    }

    @Override
    public String toString() {
        return "atrasado";
    }

    @Override
    public void cambiarACompletado() {
        obligacionFinanciera.setEstado(new EstadoCompletado(obligacionFinanciera));
    }

    @Override
    public void cambiarAAtrasado() {

    }
}
