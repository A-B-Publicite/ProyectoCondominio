package Inmueble;

import Administracion

public class ParqueaderoPrivado extends InmueblePrivado {
    private final double M2PARQUEADERO = 3;
    public ParqueaderoPrivado() {
        super(M2PARQUEADERO, null);
    }

    @Override
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    
}
