package ModuloMueble;
import java.time.LocalDate;
public class Mesa extends Mueble{
	public Mesa(int cantidad, LocalDate fechaInicio, LocalDate fechaFinal) {
        super("Mesa", cantidad, fechaInicio, fechaFinal);
    }
}
