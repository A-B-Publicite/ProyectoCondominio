package Finanzas;

import java.io.Serializable;

public abstract class MetodoRecarga implements Serializable {

    protected String descripcion;

    public MetodoRecarga() {
    }

    abstract void realizarTransaccion();

}
