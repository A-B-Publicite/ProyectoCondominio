package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.time.Duration;


public class Alicuota extends ObligacionFinanciera implements Serializable {
    protected LocalDateTime fechaLimite;

    public Alicuota(double metrosCuadrados, String descripcion, String idObligacion) {
        super(metrosCuadrados, LocalDate.now(), descripcion, idObligacion);
        //fechaLimite = LocalDateTime.now().plusDays(30);
        fechaLimite = LocalDateTime.now().plusMinutes(2);
        verificarFechaLimite();
    }

    public void verificarFechaLimite() {
        LocalDateTime ahora = LocalDateTime.now();
        long delay = Duration.between(ahora, fechaLimite.plusMinutes(1)).toMillis();
        if (delay > 0) { // Solo programar si la fecha limite más 3 minutos está en el futuro
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (Alicuota.this.estado instanceof EstadoPendiente) {
                        cambiarEstado("atrasado");
                        timer.cancel();
                    }
                }
            }, delay);
        }
    }

    @Override
    public double calcularMonto(double metrosCuadrados) {
        return metrosCuadrados * 0.25;
    }

    @Override
    public void cambiarEstado(String senial) {
        if ("atrasado".equals(senial)) {
            this.estado = new EstadoAtrasado(); // Asumiendo que existe esta clase de estado
            notificarCambioEstado(this); // Notificar a los observadores sobre el cambio de estado
        }
    }

    @Override
    public String toString() {
        return "[Obligacion N. " + idObligacion +
                "] | Alicuota = (" +
                "fechaLimite= " + fechaLimite.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")) +
                ", estado= " + estado +
                ", monto= " + monto +
                ", fechaCreacion= " + fechaCreacion +
                ", descripcion= '" + descripcion + "')";
    }
}
