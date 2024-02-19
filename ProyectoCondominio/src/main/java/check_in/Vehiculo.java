/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {

    private String numeroPlaca;
    private String marca;
    private String color;
    private String tipo;
    private Pattern pattern;
    private Matcher matcher;

    public Vehiculo(String numeroPlaca, String marca, String color, String tipo) {

        pattern = Pattern.compile("[A-Z]{3}-[0-9]{3}");
        matcher = pattern.matcher(numeroPlaca);
        if (matcher.find()) {
            this.numeroPlaca = numeroPlaca;
            this.marca = marca.toLowerCase();
            this.color = color.toLowerCase();
            this.tipo = tipo.toLowerCase();
        } else {
            System.out.println("El número de placa no existe");
        }
    }

    public void parquear() {

    }

}
