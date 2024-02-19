package Inmueble;

import Administracion.Perfil;

public class ParqueaderoPrivado extends InmueblePrivado {

    public ParqueaderoPrivado(String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }

}
