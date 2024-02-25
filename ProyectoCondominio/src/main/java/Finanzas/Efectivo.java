/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
public class Efectivo extends MetodoRecarga {
    public Efectivo(double abono) {
        super(abono);
        realizarTransaccion();
    }

    @Override
    void realizarTransaccion() {
        descripcion = "El método de recarga fue en efectivo";
    }
}
