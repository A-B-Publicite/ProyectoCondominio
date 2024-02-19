package Inmueble;

import Administracion.Perfil;


public abstract class InmueblePrivado extends Inmueble{

    public InmueblePrivado(double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }

}

