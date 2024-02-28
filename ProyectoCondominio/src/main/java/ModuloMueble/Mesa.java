package ModuloMueble;
import java.time.LocalDate;
import java.util.Date;
public class Mesa extends Mueble{
	public Mesa(int cantidad, LocalDate fechaInicio, LocalDate fechaFinal) {
        super("Mesa", cantidad, fechaInicio, fechaFinal);
    }

    Mesa(int cantidad, Date fechaInicio, Date fechaFinal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
