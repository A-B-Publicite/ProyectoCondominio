package Finanzas;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.time.Duration;

public class Alicuota extends ObligacionFinanciera implements Serializable{

    protected LocalDateTime fechaLimite;

    public Alicuota(double metrosCuadrados, String descripcion, String idObligacion) {
        super(metrosCuadrados, LocalDate.now(), descripcion, idObligacion);
        //fechaLimite = LocalDateTime.now().plusDays(30);
        fechaLimite = LocalDateTime.now().plusMinutes(1);
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
                        estado.cambiarAAtrasado();
                        notificarCambioEstado(Alicuota.this);
                        timer.cancel();
                    }
                }
            }, delay);
        }
    }

    @Override
    public double calcularMonto(double metrosCuadrados) {
        return metrosCuadrados * 0.35;
    }

    @Override
    public String toString() {
        return "[N. " + idObligacion
                + "] | [Alicuota] ("
                + "Fecha limite= " + fechaLimite.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"))
                + ", Estado= " + estado
                + ", Monto= " + monto
                + ", Fecha de creacion= " + fechaCreacion
                + ", Descripcion= '" + descripcion + "')";
    }
}
