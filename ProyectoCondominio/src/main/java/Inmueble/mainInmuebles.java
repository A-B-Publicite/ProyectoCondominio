/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

import Inmueble.EspacioDeParqueadero;
import Inmueble.Cancha;

import java.io.*;

public class mainInmuebles {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Inmuebles.txt"))) {
            Object obj;
            int lineNumber = 1;

            while ((obj = objectInputStream.readObject()) != null) {
                if (lineNumber == 1 && obj instanceof EspacioDeParqueadero) {
                    EspacioDeParqueadero estacionamiento = (EspacioDeParqueadero) obj;
                    // Puedes agregar el estacionamiento a tu Condominio o hacer algo más con él
                } else if (lineNumber == 2 && obj instanceof Cancha) {
                    Cancha cancha = (Cancha) obj;
                    // Puedes agregar la cancha a tu Condominio o hacer algo más con ella
                }

                lineNumber++;
            }

        } catch (EOFException e) {
            // Se alcanzó el final del archivo
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
