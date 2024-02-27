package Finanzas;

public class Transferencia extends MetodoRecarga  {
    private  String numeroCuentaOrigen;
    private final String numeroCuentaDestino;

    public Transferencia(String numeroCuentaOrigen, String numeroCuentaDestino) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
        this.numeroCuentaDestino = numeroCuentaDestino;
    }

    @Override
    void realizarTransaccion() {
        descripcion = "El método de recarga fue con transferencia";
    }

    @Override
    public String toString() {
        return "Numero de cuenta origen= " + numeroCuentaOrigen +
                ", Numero de cuenta destino= " + numeroCuentaDestino +
                ", descripcion= '" + descripcion + '\'';
    }
}
