package Inmueble;

import Administracion.Perfil;

public class ParqueaderoPrivado extends InmueblePrivado {
    
    public ParqueaderoPrivado(double metrosCuadrados, Perfil propietario) {
        super(metrosCuadrados, propietario);
    }

    @Override
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setPropietario(Perfil propietario) {
        this.propietario = propietario;
    }
    
}
