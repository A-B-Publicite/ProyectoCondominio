package ModuloMueble;
import java.time.LocalDate;
import java.util.Date;
public class Mesa extends Mueble{
	public Mesa(int cantidad, LocalDate fechaInicio, LocalDate fechaFinal) {
        super("Mesa", cantidad, fechaInicio, fechaFinal);
    }

}
