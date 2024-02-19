package Inmueble;

import Administracion.Perfil;

public abstract class Inmueble {
    double metrosCuadrados;
    boolean necesitaMantenimiento;
    double alicuota;
    Perfil propietario;


// Constructor con parámetros  
    public Inmueble(double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        this.metrosCuadrados = metrosCuadrados;
        this.necesitaMantenimiento = necesitaMantenimiento;
        this.alicuota = alicuota;
        this.propietario = propietario;
    }

// Getters y Setters 

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }
        
}