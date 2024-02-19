/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
public class Recarga {
    private final int abono;

    private MetodoRecarga metodoRecarga = null;

    public Recarga(int abono, String numeroCuenta) {
        this.abono = abono;
        eligirMetodoRecarga(numeroCuenta);
    }

    private void eligirMetodoRecarga(String numeroTarjeta) {
        metodoRecarga = new Tarjeta(numeroTarjeta);
    }
}


