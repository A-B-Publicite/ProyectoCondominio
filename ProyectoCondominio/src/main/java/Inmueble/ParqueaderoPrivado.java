package Inmueble;

import java.io.Serializable;


public class ParqueaderoPrivado extends InmueblePrivado implements Serializable  {
    private static final double M2PARQUEADERO = 3;
    public ParqueaderoPrivado() {
        super(M2PARQUEADERO, null);
    }

    
}
