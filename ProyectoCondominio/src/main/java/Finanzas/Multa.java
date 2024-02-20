/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
import java.time.LocalDate;

public class Multa extends ObligacionFinanciera {
    public Multa(double valorMultaBase, String descripcion, String id) {
        super(valorMultaBase, LocalDate.now(), descripcion, id);
    }

    @Override
    public void cambiarEstado(String senial) {
        estado.cambiarEstado(this, senial);
    }

    @Override
    public double calcularMonto(double monto) {
        return 0;
    }
}
