package Inmueble;

import Administracion.Perfil;
import java.util.ArrayList;

public class Departamento extends InmueblePrivado {
    private Residente propietario;
    private ArrayList<InmueblesPrivado> inmueblesPrivados;
    int metrocuadradosP=12;
    
    public Departamento(double metrosCuadrados) {
        super(metrosCuadrados);
        inmueblesPrivados = new ArrayList<InmueblesPrivado>();
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
        setPropietarioATodosLosInmueblesPrivados();
    }

    @Override
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    private void setPropietarioATodosLosInmueblesPrivados() {
        
    }

}
