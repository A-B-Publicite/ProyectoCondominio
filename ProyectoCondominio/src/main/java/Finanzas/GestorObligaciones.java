package Finanzas;

import java.io.Serializable;
import java.time.ZoneId;
import java.util.*;

public class GestorObligaciones implements Serializable {

    private final Cuenta cuenta;
    private double valorBase;
    private int contadorObligaciones = 1;
    private ArrayList<ObligacionFinanciera> obligacionesFinancieras = new ArrayList<>();

    public GestorObligaciones(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void aniadirObligacion(double valor, String descripcion, String tipo) {

        switch (tipo.toLowerCase(Locale.ROOT)) {
            case "alicuota":
                if (contadorObligaciones == 1) { // Asumiendo que es la primera obligación añadida
                    valorBase = valor; // Almacena el valor inicial
                }
                Alicuota alicuota = new Alicuota(valor, descripcion, String.valueOf(contadorObligaciones++));
                obligacionesFinancieras.add(alicuota);
                alicuota.agregarObservador(this);
                programarSiguienteAlicuota(alicuota, cuenta);
                break;
            case "multa":
                ObligacionFinanciera multa = new Multa(valor, descripcion, String.valueOf(contadorObligaciones++));
                obligacionesFinancieras.add(multa);
                break;

            default:
                break;
        }
    }

    public void programarSiguienteAlicuota(Alicuota alicuota, Cuenta cuenta) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String descripcion = alicuota.getDescripcion(); // Usa la descripción de la alicuota actual o actualízala según sea necesario
                // Utiliza valorInicialAlicuota para la nueva Alicuota
                aniadirObligacion(valorBase, descripcion, "alicuota");
            }
        }, Date.from(alicuota.getFechaLimite().atZone(ZoneId.systemDefault()).toInstant()));
    }

    public void crearNuevaAlicuota(ObligacionFinanciera obligacionAtrasada) {
        if (obligacionAtrasada instanceof Alicuota && obligacionAtrasada.getEstado() instanceof EstadoAtrasado) {
            double valorAlicuotaAtrasa = obligacionAtrasada.getMonto();
            aniadirObligacion(valorAlicuotaAtrasa, "Multa de la alicuota atrasada numero " + obligacionAtrasada.idObligacion, "multa");
        }
    }

    public void eliminarObligacion(ObligacionFinanciera obligacion) {
        ObligacionFinanciera encontrada = null;

        for (ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            if (Objects.equals(obligacionFinanciera.getIdObligacion(), obligacion.getIdObligacion())) {
                encontrada = obligacionFinanciera;
                break;
            }
        }

        obligacionesFinancieras.remove(encontrada);
    }

    public ObligacionFinanciera getObligacion(String idObligacion) {
        for (Finanzas.ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            if (Objects.equals(obligacionFinanciera.getIdObligacion(), idObligacion)) {
                return obligacionFinanciera;
            }
        }
        return null;
    }

    public String mostrarObligaciones() {
        String salida = "";
//        if (cuenta.getCuentaAdministrador() != null) {
//            salida = "================  OBLIGACION RESIDENTE ==================\n";
//        } else {
//            salida = "================  OBLIGACION ADMINISTRADOR ==================\n";
//        }
        for (ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            salida += obligacionFinanciera.toString() + "\n";
        }
        return salida;
    }

    public ArrayList<ObligacionFinanciera> getObligacionesFinancieras() {
        return obligacionesFinancieras;
    }

}
