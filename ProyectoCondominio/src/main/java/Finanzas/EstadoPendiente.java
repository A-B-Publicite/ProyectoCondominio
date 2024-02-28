package Finanzas;

import java.io.Serializable;

public class EstadoPendiente extends EstadoObligacion implements Serializable {

    public EstadoPendiente(ObligacionFinanciera obligacionFinanciera) {
        this.obligacionFinanciera = obligacionFinanciera;
    }


    @Override
    public String toString() {
        return "pendiente";
    }

    @Override
    public void cambiarACompletado() {
        obligacionFinanciera.setEstado(new EstadoCompletado());
    }

    @Override
    public void cambiarAAtrasado() {
        obligacionFinanciera.setEstado(new EstadoAtrasado());

    }
}
