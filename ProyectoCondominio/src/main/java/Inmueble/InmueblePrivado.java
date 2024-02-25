package Inmueble;

import Administracion.Perfil;


public abstract class InmueblePrivado{
    double metrosCuadrados;
    Perfil propietario;
    
    public InmueblePrivado(double metrosCuadrados, Perfil propietario) {
        this.metrosCuadrados = metrosCuadrados;
        this.propietario = propietario;
    }
    
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setPropietario(Perfil propietario) {
        this.propietario = propietario;
    }
    
    

}

