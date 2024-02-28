package Finanzas;

public abstract class EstadoObligacion {

    protected ObligacionFinanciera obligacionFinanciera;

    public EstadoObligacion(ObligacionFinanciera obligacionFinanciera) {
        this.obligacionFinanciera = obligacionFinanciera;
    }

    public abstract void cambiarACompletado();

    public abstract void cambiarAAtrasado();
}
