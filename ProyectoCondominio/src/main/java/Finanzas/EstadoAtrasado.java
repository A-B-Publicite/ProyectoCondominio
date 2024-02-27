package Finanzas;

import java.io.Serializable;

public class EstadoAtrasado implements EstadoObligacion, Serializable {
    @Override
    public void cambiarEstado(ObligacionFinanciera obligacionFinanciera, String senial) {
        obligacionFinanciera.setEstado(new EstadoCompletado());
    }

    @Override
    public String toString() {
        return "atrasado";
    }
}
