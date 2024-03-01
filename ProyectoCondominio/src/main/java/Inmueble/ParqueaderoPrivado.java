package Inmueble;

import java.io.Serializable;


public class ParqueaderoPrivado extends InmueblePrivado implements Serializable  {
    private boolean ocupado;
    private static final double M2PARQUEADERO = 3;
    public ParqueaderoPrivado() {
        super(M2PARQUEADERO, null);
        ocupado = false;
    }

    public void usar(){
        ocupado = true;
    }
    
    public void desocupar(){
        ocupado = false;
    }   
}
