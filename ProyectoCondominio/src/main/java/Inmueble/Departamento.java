package Inmueble;

import Administracion.Perfil;

public class Departamento extends InmueblePrivado {
    ParqueaderoPrivado parqueaderPrivado;

    public Departamento(ParqueaderoPrivado parqueaderPrivado, double metrosCuadrados, Perfil propietario) {
        super(metrosCuadrados, propietario);
        this.parqueaderPrivado = parqueaderPrivado;
    }

    public Perfil getPropietario() {
        return propietario;
    }

    public void setPropietario(Perfil propietario) {
        this.propietario = propietario;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

}
