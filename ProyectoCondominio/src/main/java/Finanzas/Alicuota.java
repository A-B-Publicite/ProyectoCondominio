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
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.time.Duration;


public class Alicuota extends ObligacionFinanciera {
    protected LocalDateTime fechaLimite;

    public Alicuota(double metrosCuadrados, String descripcion, String id) {
        super(metrosCuadrados, LocalDate.now(), descripcion, id);
        //fechaLimite = LocalDateTime.now().plusDays(30);
        fechaLimite = LocalDateTime.now().plusMinutes(5);
        verificarFechaLimite();
    }

    public void verificarFechaLimite() {
        // Obtener el momento actual
        LocalDateTime ahora = LocalDateTime.now();
        // Calcular la diferencia en milisegundos desde ahora hasta 3 minutos después de la fecha límite
        long delay = Duration.between(ahora, fechaLimite.plusMinutes(3)).toMillis();
        if (delay > 0) { // Solo programar si la fecha limite más 3 minutos está en el futuro
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (Alicuota.this.estado instanceof EstadoPendiente) {
                        estado.cambiarEstado(Alicuota.this, "atrasado");
                        // Es opcional cancelar el timer si solo se va a usar una vez para este propósito
                        timer.cancel();
                        generarMulta(); // Llamar al método para generar la multa
                    }
                }
            }, delay);
        }
    }

    private void generarMulta() {
        // Suponiendo que el valor de la multa es un valor fijo o calculado basado en algún criterio
        double valorMultaBase = calcularValorMulta();
        Multa multa = new Multa(valorMultaBase, "Multa por atraso en pago de alicuota", "ID_MULTA");

        System.out.println("Multa generada: " + multa);
    }


    private double calcularValorMulta() {
        // Implementar lógica para calcular el valor de la multa
        return 50; // Valor de ejemplo
    }

    @Override
    public double calcularMonto(double metrosCuadrados) {
        return metrosCuadrados * 0.25;
    }

    @Override
    public void cambiarEstado(String senial) {
        estado.cambiarEstado(this, senial);
    }


    @Override
    public String toString() {
        return "[Obligacion N. " + idObligacion +
                "] | Alicuota = (" +
                "fechaLimite= " + fechaLimite +
                ", estado= " + estado +
                ", monto= " + monto +
                ", fechaCreacion= " + fechaCreacion +
                ", descripcion= '" + descripcion + "')";
    }
}
