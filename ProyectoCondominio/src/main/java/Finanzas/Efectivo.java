package Finanzas;

import java.io.Serializable;

public class Efectivo extends MetodoRecarga implements Serializable {
    public Efectivo() {
    }

    @Override
    void realizarTransaccion() {
        descripcion = "El método de recarga fue en efectivo";
    }


    @Override
    public String toString() {
        return "Descripcion= '" + descripcion + '\'';
    }
}
