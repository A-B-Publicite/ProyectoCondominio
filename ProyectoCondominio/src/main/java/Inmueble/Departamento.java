package Inmueble;

import Administracion.Perfil;

public class Departamento extends InmueblePrivado {
    ParqueaderoPrivado parqueaderPrivado;

    public Departamento(String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
        this.parqueaderPrivado = new ParqueaderoPrivado(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }

    
    public Departamento(String nombre, double metrosCuadrados) {
        super(nombre, metrosCuadrados,false, 0, null);
        this.parqueaderPrivado = new ParqueaderoPrivado(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }

    public Departamento(double metrosCuadrados) {
        super(null, metrosCuadrados,false, 0, null);
        this.parqueaderPrivado = new ParqueaderoPrivado(null,metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }
}
