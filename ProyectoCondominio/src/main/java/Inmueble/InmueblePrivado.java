package Inmueble;

import Administracion.Perfil;


public abstract class InmueblePrivado{
    double metrosCuadrados;
    Perfil propietario;
    
    public InmueblePrivado() {
    }

    public InmueblePrivado(double metrosCuadrados, Perfil propietario) {
        this.metrosCuadrados = metrosCuadrados;
        this.propietario = propietario;
    }
    
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }


}

