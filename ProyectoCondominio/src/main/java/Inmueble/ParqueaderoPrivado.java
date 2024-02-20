package Inmueble;

import Administracion.Perfil;

public class ParqueaderoPrivado extends InmueblePrivado {

    public ParqueaderoPrivado(double metrosCuadrados, Perfil propietario) {
        super(metrosCuadrados, propietario);
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
}
