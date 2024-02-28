package Administracion;

import Finanzas.Cuenta;
import Finanzas.ObligacionFinanciera;
import Inmueble.Departamento;
import check_in.RegistroEntrada;
import java.io.Serializable;
import java.util.Scanner;

public class Residente extends Perfil implements Serializable {

    private boolean esPropietario;
    private Departamento departamento;

    public Residente(String nombre, String apellido, Boolean esPropietario) {
        super(nombre, apellido);
        this.esPropietario = esPropietario;

    }

    public void darCuentaDePago(Cuenta cuentaAdministrador) {
        cuentaBancaria.setCuentaDePago(cuentaAdministrador);
    }

    public void reservarAreaComun() {
        // Hagan los de Reserva
    }

    public void pagarAlicuota() {
        // Hagan los de financieros
    }

    public Cuenta getCuenta() {
        return cuentaBancaria;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Boolean esPropietario() {
        return esPropietario;
    }

    public void pagar(ObligacionFinanciera obligacionAPagar) {
        cuentaBancaria.pagarObligacionFinanciera(obligacionAPagar);
    }

    public Boolean compararCorreoNombre(String correo) {
        return correo.equals(this.correo);
    }

    public boolean compararNombre(String nombreResidente) {
        return nombreResidente.equals(this.nombre);
    }

    public void realizarCheckIn(String fechaLlegada, String horaLlegada, boolean estacionarse) {
        RegistroEntrada registro = new RegistroEntrada();
        registro.setAutorizacion(this.autorizacion);
        if (estacionarse) {
            registro.usarParqueaderoAsignado(fechaLlegada, departamento.getParqueaderoPrivado());
        }
        registro.registrarEntrada(fechaLlegada, horaLlegada);
    }

    @Override
    public String toString() {
        return "Residente{" + "esPropietario=" + esPropietario + ", departamento=" + departamento + '}';
    }

    public void setAprobacion() {
        aprobacionDeContrato = new AdministracionContrato();
    }

    
    public void aprobar(Contrato contrato){
        aprobacionDeContrato.aprobar(contrato);
    }


}
