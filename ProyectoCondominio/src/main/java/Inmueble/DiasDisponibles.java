/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

import java.util.ArrayList;

/**
 *
 * @author bejar
 */

public class DiasDisponibles {
    ArrayList<String> diasDisponibles = new ArrayList<>();

    public DiasDisponibles() {
        diasDisponibles.add("Lunes");
        diasDisponibles.add("Martes");
        diasDisponibles.add("Miercoles");
        diasDisponibles.add("Jueves");
        diasDisponibles.add("Viernes");
    }

    public ArrayList<String> getDiasDisponibles() {
        return diasDisponibles;
    } 
}