package Mueble;

import java.time.LocalDate;
import java.util.Date;

public class Carpa extends Mueble {

    public Carpa(int cantidad, LocalDate fechaInicio, LocalDate fechaFinal) {
        super("Carpa", cantidad, fechaInicio, fechaFinal);
    }

}
