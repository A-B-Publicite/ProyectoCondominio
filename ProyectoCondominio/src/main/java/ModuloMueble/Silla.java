package ModuloMueble;
import java.time.LocalDate;
import java.util.Date;
public class Silla extends Mueble{
	public Silla(int cantidad, LocalDate fechaInicio, LocalDate fechaFinal) {
        super("Silla", cantidad, fechaInicio, fechaFinal);
    }

    Silla(int cantidad, Date fechaInicio, Date fechaFinal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
