package Finanzas;

import java.io.Serializable;

public abstract class EstadoObligacion implements Serializable {

    protected ObligacionFinanciera obligacionFinanciera;

    public EstadoObligacion(ObligacionFinanciera obligacionFinanciera) {
        this.obligacionFinanciera = obligacionFinanciera;
    }

    public abstract void cambiarACompletado();

    public abstract void cambiarAAtrasado();
}
