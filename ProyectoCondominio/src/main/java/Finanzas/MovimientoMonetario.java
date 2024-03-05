/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

import java.time.LocalDate;

/**
 *
 * @author alejo
 */
public abstract class MovimientoMonetario {

    protected final String id;
    protected MetodoRecarga metodoRecarga;
    protected LocalDate fechaRealizacion;
    private Cuenta cuenta;
    protected double cantidadDinero;

    public MovimientoMonetario(double cantidadDinero, String id, MetodoRecarga metodoDeRecarga) {
        this.cantidadDinero = cantidadDinero;
        this.metodoRecarga = metodoDeRecarga;
        this.id = id;
    }

    public abstract void realizarMovimiento(Cuenta cuentaARecargar);
}
