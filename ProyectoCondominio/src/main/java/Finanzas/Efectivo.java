package Finanzas;

public class Efectivo extends MetodoRecarga {
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
