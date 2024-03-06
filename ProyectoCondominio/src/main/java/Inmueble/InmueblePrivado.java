package Inmueble;

import Administracion.Perfil;
import java.io.*;


public abstract class InmueblePrivado implements Serializable{
    double metrosCuadrados;
    private boolean necesitaMantenimiento;
    Perfil propietario;
    
    public InmueblePrivado(double metrosCuadrados, Perfil propietario) {
        this.metrosCuadrados = metrosCuadrados;
        this.propietario = propietario;
    }
    
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setResidente(Perfil propietario) {
        this.propietario = propietario;
    }

    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }
        
    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }   

}

