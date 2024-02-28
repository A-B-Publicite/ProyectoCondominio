package Finanzas;

import java.io.Serializable;

public class EstadoPendiente implements EstadoObligacion, Serializable {

    @Override
    public void cambiarEstado(ObligacionFinanciera obligacionFinanciera, String senial) {
        if (senial.equals("completado")) {
            obligacionFinanciera.setEstado(new EstadoCompletado());
        }
        if (senial.equals("atrasado")) {
            obligacionFinanciera.setEstado(new EstadoAtrasado());
        }

    }

    @Override
    public String toString() {
        return "pendiente";
    }
}
