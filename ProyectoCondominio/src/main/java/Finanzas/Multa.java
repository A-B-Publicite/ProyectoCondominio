/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
import java.io.Serializable;
import java.time.LocalDate;

public class Multa extends ObligacionFinanciera implements Serializable {
    public Multa(double valorAlicuotaAtrasada, String descripcion, String id) {
        super(valorAlicuotaAtrasada, LocalDate.now(), descripcion, id);
    }
    @Override
    public void cambiarEstado(String senial) {
        estado.cambiarEstado(this, senial);
    }
    @Override
    public double calcularMonto(double valorAlicuotaAtrasada) {
        return valorAlicuotaAtrasada * 0.25;
    }

}
