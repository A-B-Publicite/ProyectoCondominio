package Finanzas;

public abstract class EstadoObligacion {

    protected ObligacionFinanciera obligacionFinanciera;

    public abstract void cambiarACompletado();

    public abstract void cambiarAAtrasado();
}
