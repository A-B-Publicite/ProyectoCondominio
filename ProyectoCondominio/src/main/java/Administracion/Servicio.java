package Administracion;

import Inmueble.Mantenimiento;
import java.io.Serializable;

public class Servicio implements Serializable {

    private String nombreDelServicio;
    private Mantenimiento mantenimiento;

    public Servicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }

    public void ejecutar(Object objeto) {
        notificar(objeto);
    }

    private void notificar(Object objeto) {
        mantenimiento.actualizar(objeto);
    }

}
