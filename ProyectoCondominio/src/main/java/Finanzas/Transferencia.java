/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
public class Transferencia extends MetodoRecarga {
    private  String numeroCuentaOrigen;
    private final String numeroCuentaDestino;

    public Transferencia(double abono, String numeroCuentaOrigen, String numeroCuentaDestino) {
        super(abono);
        this.numeroCuentaOrigen = numeroCuentaOrigen;
        this.numeroCuentaDestino = numeroCuentaDestino;
        realizarTransaccion();
    }

    @Override
    void realizarTransaccion() {
        descripcion = "El método de recarga fue con transferencia";
    }
}
