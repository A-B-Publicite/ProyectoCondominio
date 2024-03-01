package ModuloMueble;
import java.time.LocalDate;
import java.util.Date;
public class Silla extends Mueble{
	public Silla(int cantidad, LocalDate fechaInicio, LocalDate fechaFinal) {
        super("Silla", cantidad, fechaInicio, fechaFinal);
    }

}
