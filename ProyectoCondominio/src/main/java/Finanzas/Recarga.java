package Finanzas;

import java.io.Serializable;

public class Recarga implements Serializable {
    private final String id;
    private MetodoRecarga metodoRecarga;
    private Cuenta cuenta;
    private double abono;

    public Recarga(double abono, String id, MetodoRecarga metodoDeRecarga) {
        this.abono = abono;
        this.metodoRecarga = metodoDeRecarga;
        this.id = id;
        metodoRecarga.realizarTransaccion();
    }

    public void recargar(Cuenta cuentaARecargar){
        cuentaARecargar.actualizarSaldo(abono);
    }

    @Override
    public String toString() {
        return "[Recarga N. " + id +
                "] | ("+ metodoRecarga + ")";
    }

}
