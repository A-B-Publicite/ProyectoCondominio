package Inmueble;

import Administracion.Perfil;

public abstract class Inmueble {
    String nombreInmueble;
    double metrosCuadrados;
    boolean necesitaMantenimiento;
    double alicuota;
    Perfil propietario;

    public Inmueble() {
    }

// Constructor con parámetros  

    public Inmueble(String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        this.nombreInmueble = nombre;
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

    public Perfil getPropietario() {
        return propietario;
    }

    
    public void setPropietario(Perfil propietario) {
        this.propietario = propietario;
    }
    
}