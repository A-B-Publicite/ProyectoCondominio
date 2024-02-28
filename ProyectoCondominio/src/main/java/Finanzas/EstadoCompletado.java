package Finanzas;

import java.io.Serializable;

public class EstadoCompletado extends EstadoObligacion implements Serializable {

    @Override
    public String toString() {
        return "completado";
    }

    @Override
    public void cambiarACompletado() {

    }

    @Override
    public void cambiarAAtrasado() {

    }
}
