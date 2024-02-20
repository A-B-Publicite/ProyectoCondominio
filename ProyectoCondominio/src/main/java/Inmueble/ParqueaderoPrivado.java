package Inmueble;

import Administracion

public class ParqueaderoPrivado extends InmueblePrivado {
    
    public ParqueaderoPrivado(double metrosCuadrados) {
        super(metrosCuadrados, null);
    }

    @Override
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    
}
