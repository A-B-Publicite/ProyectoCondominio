package Inmueble;

import Administracion.Perfil;
import java.util.ArrayList;

public class Departamento extends InmueblePrivado {
    private Residente propietario;
    private ArrayList<InmueblePrivado> inmueblesPrivados;
    private final double M2DEPARTAMENTO=12;
    
    public Departamento() {
        super(M2DEPARTAMENTO, null);
        inmueblesPrivados = new ArrayList<InmueblePrivado>();
        inmueblesPrivados.add(new ParqueaderoPrivado());
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
        for (InmueblePrivado inmueblePrivado : inmueblesPrivados) {
            inmueblePrivado.setPropietario();
        }
    }

}
