package Inmueble;

import java.io.Serializable;

public class EspacioDeParqueadero extends InmuebleComun implements Serializable{
    private boolean ocupado;
    
    public EspacioDeParqueadero(double metrosCuadrados) {
        super(metrosCuadrados);
        ocupado = false;
    }
    
    public void ocupar(){
        ocupado = true;
    }
    
    public void desocupar(){
        ocupado = false;
    }

    public boolean estaLibre() {
        return ocupado;
    }
}
