package Finanzas;

public class Tarjeta extends MetodoRecarga {

    private String numeroTarjeta;
    private String pinTarjeta;

    public Tarjeta(String numeroTarjeta, String pinTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.pinTarjeta = pinTarjeta;
    }

    @Override
    void realizarTransaccion() {
        descripcion = "El método de recarga fue con tarjeta";
    }

    @Override
    public String toString() {
        return "Numero de cuenta= " + numeroTarjeta +
                ", descripcion= '" + descripcion + '\'';
    }
}
