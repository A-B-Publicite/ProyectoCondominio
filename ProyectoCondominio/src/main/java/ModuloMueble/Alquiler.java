
package ModuloMueble;

import java.util.Date;


public class Alquiler {
   

    private String diaInicio;
    private String diaFin;
    private int cantidadDias;
    private double montoTotal;
    private Date fechaRegistro;
    private Mueble mueble; 

    public Alquiler(int idReserva, String diaInicio, String diaFin, int cantidadDias, double montoTotal, Date fechaRegistro, Mueble mueble) {
      
        this.diaInicio = diaInicio;
        this.diaFin = diaFin;
        this.cantidadDias = cantidadDias;
        this.montoTotal = montoTotal;
        this.fechaRegistro = fechaRegistro;
        this.mueble = mueble;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getDiaInicio() {
        return diaInicio;
    }

    public String getDiaFin() {
        return diaFin;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Mueble getMueble() {
        return mueble;
    }


    public void setDiaInicio(String diaInicio) {
        this.diaInicio = diaInicio;
    }

    public void setDiaFin(String diaFin) {
        this.diaFin = diaFin;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
