/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;


/**
 *
 * @author alejo
 */
public class Tarjeta extends MetodoRecarga  {

    private  String numeroCuenta;
    private  String pinTarjeta;

    public Tarjeta(double abono, String numeroTarjeta,String pinTarjeta) {
        super (abono);
        this.numeroCuenta = numeroTarjeta;
        this.pinTarjeta = pinTarjeta;
        realizarTransaccion();
    }

    @Override
    void realizarTransaccion() {
        descripcion = "El método de recarga fue con tarjeta";
    }
}
