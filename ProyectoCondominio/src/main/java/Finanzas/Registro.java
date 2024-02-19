/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
import java.util.ArrayList;

public class Registro {
    private ArrayList<ObligacionFinanciera> obligacionesFinancierasCompletadas = new ArrayList<>();

    public void registrar(ObligacionFinanciera obligacionFinancieraCompletada) {
        obligacionesFinancierasCompletadas.add(obligacionFinancieraCompletada);
    }

    public String consultarRegistros() {
        String salida = "================  REGISTRO  ==================\n";

        for (ObligacionFinanciera obligacionFinanciera : obligacionesFinancierasCompletadas) {
            salida += obligacionFinanciera + "\n";
        }
        return salida;

    }
}
