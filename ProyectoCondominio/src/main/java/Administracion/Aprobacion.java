/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administracion;

import java.util.ArrayList;
import Administracion.Contrato;

/**
 *
 * @author jeanp
 */
public class Aprobacion {

    private boolean aprobado = false;
    private Directiva directiva;

    public void aprobar(Contrato contrato) {
        aprobado = true;

    }

    public void notificarAprobacion(String descripcionContrato) {
        directiva.actualizarAprobacion(descripcionContrato);
    }

}
