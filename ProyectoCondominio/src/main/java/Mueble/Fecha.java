package Mueble;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }
    
    public Fecha(String fecha) { //constructor que recibe y tokeniza la fecha
        StringTokenizer tokens= new StringTokenizer(fecha,"/");
        this.dia=Integer.parseInt(tokens.nextToken());
        this.mes=Integer.parseInt(tokens.nextToken());
        this.anio=Integer.parseInt(tokens.nextToken());
    }

//    public Fecha(int dia, int mes, int anio) {
//        this.dia = dia;
//        this.mes = mes;
//        this.anio = anio;
//    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public boolean comprobacion(String fecha)
    {
        //para la fecha
        String febBisiesto = "^(0[1-9]|[1][0-9]|[2][0-9])\\/(0[2])\\/([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]|[0-9][1-9][0-9]{2}|[1-9][0-9]{3})$";
        String febNoBisiesto = "^(0[1-9]|[1][0-9]|[2][0-8])\\/(0[2])\\/([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]|[0-9][1-9][0-9]{2}|[1-9][0-9]{3})$";
        String mesTreinta = "^(0[1-9]|[12][0-9]|3[0])\\/(0[469]|1[1])\\/([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]|[0-9][1-9][0-9]{2}|[1-9][0-9]{3})$";
        String mesTreintaUno = "^(0[1-9]|[12][0-9]|3[01])\\/(0[13578]|1[02])\\/([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]|[0-9][1-9][0-9]{2}|[1-9][0-9]{3})$";

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) { //para el año bisiesto
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                Pattern pat = Pattern.compile(mesTreinta);
                Matcher mat = pat.matcher(fecha);
                if (mat.matches()) {
                    return true;
                }         
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    Pattern pat = Pattern.compile(mesTreintaUno);
                    Matcher mat = pat.matcher(fecha);
                    if (mat.matches()) {
                        return true;
                    }
                } else {
                    Pattern pat = Pattern.compile(febBisiesto);
                    Matcher mat = pat.matcher(fecha);
                    if (mat.matches()) {
                        return true;
                    }
                }
            }
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                Pattern pat = Pattern.compile(mesTreinta);
                Matcher mat = pat.matcher(fecha);
                if (mat.matches()) {
                    return true;
                }
            } else {

                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    Pattern pat = Pattern.compile(mesTreintaUno);
                    Matcher mat = pat.matcher(fecha);
                    if (mat.matches()) {
                        return true;
                    }
                } else {
                    Pattern pat = Pattern.compile(febNoBisiesto);
                    Matcher mat = pat.matcher(fecha);
                    if (mat.matches()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
        
    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + anio ;
    }
    
}
