package Finanzas;

/**
 * @author alejo
 */
import java.io.Serializable;
import java.time.LocalDate;

public class Pago implements Serializable {

    private double precioPagado;
    private LocalDate fechaPago;
    private ObligacionFinanciera obligacionFinanciera;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    public Pago(Cuenta cuenta) {
        this.cuentaOrigen = cuenta;
        this.fechaPago = LocalDate.now();
    }

    public void pagarObligacionFinanciera(ObligacionFinanciera obligacionFinancieraAPagar, Cuenta cuentaAdministrador) {
        System.out.println("entró a pagar obligacion financiera");
        double monto = obligacionFinancieraAPagar.getMonto();
        precioPagado = monto;

        cuentaOrigen.actualizarSaldo(-monto);

        cuentaAdministrador.actualizarSaldo(monto);
        cuentaDestino = cuentaAdministrador;
        obligacionFinancieraAPagar.getEstado().cambiarACompletado();

        cuentaOrigen.getGestorObligaciones().eliminarObligacion(obligacionFinancieraAPagar);

        obligacionFinanciera = obligacionFinancieraAPagar;

    }

    public void pagarContrato(double precioContrato) {
        precioPagado = precioContrato;
        cuentaOrigen.actualizarSaldo(-precioContrato);
    }

    @Override
    public String toString() {
        String salida = "";

        if (cuentaDestino != null) {
            String id = obligacionFinanciera.getIdObligacion();
            String descripcion = obligacionFinanciera.getDescripcion();

            salida += "PAGO REALIZADO: Fecha:" + fechaPago + " Monto: " + precioPagado
                    + " ID: " + id + ", DESCRIPCION = " + descripcion;
        } else {
            salida += "PAGO REALIZADO: (Contrato) Fecha:" + fechaPago + " Monto: " + precioPagado ;
        }

        return salida;
    }
}
