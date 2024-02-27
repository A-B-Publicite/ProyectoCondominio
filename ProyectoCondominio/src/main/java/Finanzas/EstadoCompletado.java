package Finanzas;

import java.io.Serializable;

public class EstadoCompletado implements EstadoObligacion, Serializable {

    @Override
    public void cambiarEstado(ObligacionFinanciera obligacionFinanciera, String senial) {
    }

    @Override
    public String toString() {
        return "completado";
    }
}
