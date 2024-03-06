package Finanzas;

import java.io.Serializable;
import java.time.ZoneId;
import java.util.*;

public class GestorObligaciones implements Serializable {

    private final Cuenta cuenta;
    private double valorInicialAlicuota;
    private int contadorObligaciones = 1;
    private ArrayList<ObligacionFinanciera> obligacionesFinancieras = new ArrayList<>();

    public GestorObligaciones(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public ObligacionFinanciera aniadirObligacion(double valor, String descripcion, String tipo) {
        ObligacionFinanciera nuevaObligacion = null;
        switch (tipo.toLowerCase(Locale.ROOT)) {
            case "alicuota":
                if (contadorObligaciones == 1) {
                    valorInicialAlicuota = valor;
                }
                nuevaObligacion = new Alicuota(valor, descripcion, String.valueOf(contadorObligaciones++));
                break;
            case "multa":
                nuevaObligacion = new Multa(valor, descripcion, String.valueOf(contadorObligaciones++));
                break;
            default:
                nuevaObligacion = null;
        }
        if (nuevaObligacion != null) {
            obligacionesFinancieras.add(nuevaObligacion);
            nuevaObligacion.agregarObservador(this);
            if (nuevaObligacion instanceof Alicuota) {
                programarSiguienteAlicuota((Alicuota) nuevaObligacion/*, cuenta*/);
            }
        }
        return nuevaObligacion;

    }

    public void eliminarObligacion(ObligacionFinanciera obligacion) {

        Iterator<ObligacionFinanciera> iterator = obligacionesFinancieras.iterator();

        while (iterator.hasNext()) {
            ObligacionFinanciera obligacionFinanciera = iterator.next();
            if (Objects.equals(obligacionFinanciera.getIdObligacion(), obligacion.getIdObligacion())) {
                iterator.remove();
                break;
            }
        }

    }

    public String mostrarObligaciones() {
        String salida = "";

        for (ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            salida += obligacionFinanciera.toString() + "\n";
        }
        return salida;
    }

    public void programarSiguienteAlicuota(Alicuota alicuota/*, Cuenta cuenta*/) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String descripcion = alicuota.descripcion; // Usa la descripción de la alicuota actual o actualízala según sea necesario
                // Utiliza valorInicialAlicuota para la nueva Alicuota
                aniadirObligacion(valorInicialAlicuota, descripcion, "alicuota");
            }
        }, Date.from(alicuota.fechaLimite.atZone(ZoneId.systemDefault()).toInstant()));
    }

    public void crearNuevaAlicuota(ObligacionFinanciera obligacionAtrasada) {
        if (obligacionAtrasada instanceof Alicuota && obligacionAtrasada.getEstado() instanceof EstadoAtrasado) {
            double valorAlicuotaAtrasa = obligacionAtrasada.getMonto();
            aniadirObligacion(valorAlicuotaAtrasa, "Multa de la alicuota atrasada numero " + obligacionAtrasada.idObligacion, "multa");
        }
    }

    public ObligacionFinanciera getObligacion(String idObligacion) {
        for (Finanzas.ObligacionFinanciera obligacionFinanciera : obligacionesFinancieras) {
            if (Objects.equals(obligacionFinanciera.getIdObligacion(), idObligacion)) {
                return obligacionFinanciera;
            }
        }
        return null;
    }

    public ArrayList<ObligacionFinanciera> getObligacionesFinancieras() {
        return obligacionesFinancieras;
    }

}
