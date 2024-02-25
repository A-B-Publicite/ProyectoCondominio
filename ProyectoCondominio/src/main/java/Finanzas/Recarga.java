/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

import java.io.Serializable;

/**
 *
 * @author alejo
 */

public class Recarga implements Serializable {
    private final String id;
    private MetodoRecarga metodoRecarga;

    public Recarga(double abono, String id) {
        metodoRecarga = new Efectivo(abono);
        this.id = id;
    }

    public Recarga(double abono, String numeroTarjeta, String pinTarjeta, String id) {
        this.id = id;
        metodoRecarga = new Tarjeta(abono, numeroTarjeta, pinTarjeta);
    }

    public Recarga(double abono, String numeroCuentaOrigen, String id) {
        metodoRecarga = new Transferencia(abono, numeroCuentaOrigen, "1712240");
        this.id = id;

    }

    @Override
    public String toString() {
        return "[Recarga N. " + id +
                "] | ("+ metodoRecarga + ")";
    }
}

