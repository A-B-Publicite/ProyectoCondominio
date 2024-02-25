package Inmueble;

import Administracion.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Departamento extends InmueblePrivado implements Serializable {
    private Residente propietario;
    private ArrayList<InmueblePrivado> inmueblesPrivados;
    private static final double M2DEPARTAMENTO=12;
    
    public Departamento() {
        super(M2DEPARTAMENTO, null);
        inmueblesPrivados = new ArrayList<InmueblePrivado>();
        inmueblesPrivados.add(new ParqueaderoPrivado()); 
    }


    public Perfil getPropietario() {
        return propietario;
    }

    public void setPropietario(Perfil propietario) {
        this.propietario = (Residente) propietario;
        setPropietarioATodosLosInmueblesPrivados();
    }

    @Override
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    private void setPropietarioATodosLosInmueblesPrivados() {
        for (InmueblePrivado inmueblePrivado : inmueblesPrivados) {
            inmueblePrivado.setPropietario(propietario);
        }
    }

    public ParqueaderoPrivado getParqueaderoPrivado() {
        for (InmueblePrivado inmueble : inmueblesPrivados) {
                if (inmueble instanceof ParqueaderoPrivado) {
                    return (ParqueaderoPrivado) inmueble;                 
                }
            }
        return new ParqueaderoPrivado();
    }

}
