package Administracion;

import java.io.Serializable;

public class Servicio implements Serializable {

    private String nombreDelServicio;

    public Servicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }

    public void ejecutar(Object objeto) {
        notificar(objeto);
    }

    private void notificar(Object objeto) {
        //mantenimiento.actualizar(objeto);
    }

}
