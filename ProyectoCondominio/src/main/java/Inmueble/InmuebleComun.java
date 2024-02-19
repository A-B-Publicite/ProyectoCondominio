package Inmueble;

import java.util.Date;

public abstract class InmuebleComun extends Inmueble{

    Date fechaInicio;
    Date fechaFin;

    public InmuebleComun(Date fechaInicio, Date fechaFin, String tipo, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(tipo, metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}

