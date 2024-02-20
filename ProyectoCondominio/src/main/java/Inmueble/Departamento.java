package Inmueble;

import Administracion.Perfil;

public class Departamento extends InmueblePrivado {
    ParqueaderoPrivado parqueaderoPrivado;
    int metrocuadradosP=12;
    //para departamentos vacios
    public Departamento(double metrosCuadrados) {
        super(metrosCuadrados,null);
        this.parqueaderoPrivado = new ParqueaderoPrivado(metrocuadradosP, null);
    }
    //para departamentos con propietario
    public Departamento(double metrosCuadrados, Perfil propietario) {
        super(metrosCuadrados, propietario);
        this.parqueaderoPrivado = new ParqueaderoPrivado(metrocuadradosP, propietario);
    }

    public Perfil getPropietario() {
        return propietario;
    }

    public void setPropietario(Perfil propietario) {
        this.propietario = propietario;
    }

    @Override
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

}
