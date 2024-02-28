package Finanzas;

import java.io.Serializable;

public class EstadoAtrasado extends EstadoObligacion implements Serializable {

    @Override
    public String toString() {
        return "atrasado";
    }

    @Override
    public void cambiarACompletado() {
        obligacionFinanciera.setEstado(new EstadoCompletado());
    }

    @Override
    public void cambiarAAtrasado() {

    }
}
