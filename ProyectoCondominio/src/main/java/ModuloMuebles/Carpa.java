package ModuloMuebles;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Carpa extends Mueble implements Serializable{


    public Carpa(double precio) {
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
