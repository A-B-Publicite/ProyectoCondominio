package Finanzas;

import java.io.Serializable;

public class EstadoPendiente extends EstadoObligacion implements Serializable {

    public EstadoPendiente(ObligacionFinanciera obligacionFinanciera) {

        super(obligacionFinanciera);
    }

    @Override
    public String toString() {
        return "pendiente";
    }

    @Override
    public void cambiarACompletado() {
        obligacionFinanciera.setEstado(new EstadoCompletado(obligacionFinanciera));
    }

    @Override
    public void cambiarAAtrasado() {
        obligacionFinanciera.setEstado(new EstadoAtrasado(obligacionFinanciera));

    }
}
