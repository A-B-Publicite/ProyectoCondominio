package Administracion;

import Inmueble.Mantenimiento;
import java.io.Serializable;

public class Servicio implements Serializable {

    private Mantenimiento mantenimiento;

    public Servicio() {
    }

    public void ejecutar(Object objeto) {
        notificar(objeto);
    }

    private void notificar(Object objeto) {
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.actualizar(objeto);
    }

}
