package Inmueble;

import Administracion.Perfil;


public abstract class InmueblePrivado extends Inmueble{
    public InmueblePrivado(String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }

}

