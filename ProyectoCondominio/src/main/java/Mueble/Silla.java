package Mueble;
import java.time.LocalDate;
import java.util.Date;
public class Silla extends Mueble{


    public Silla(double precio) {
        super(precio);
    }


    public Silla(float precio) {
        super(precio);
    }
    
    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio); 
    }

    @Override
    public void setEstado(boolean estado) {
        super.setEstado(estado); 
    }

    @Override
    public double getPrecio() {
        return super.getPrecio(); 
    }

    @Override
    public boolean getEstado() {
        return super.getEstado();
    }
     
}
