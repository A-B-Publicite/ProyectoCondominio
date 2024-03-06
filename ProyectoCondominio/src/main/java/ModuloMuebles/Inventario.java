package ModuloMuebles;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Grupo3
 */
public class Inventario implements Serializable {

    ArrayList<Mueble> listaMuebles;

    public Inventario() {
        listaMuebles = new <Mueble>ArrayList();
    }

    public Inventario(ArrayList<Mueble> listaMuebles) {
        this.listaMuebles = listaMuebles;
    }

    public void agregarMueble(Mueble mueble, int cantidad, double precio) {
        mueble.setPrecio(precio);
        for (int i = 0; i < cantidad; i++) {
            listaMuebles.add(mueble);
        }
    }

    public ArrayList<Mueble> getListaMuebles() {
        return listaMuebles;
    }

    public void setListaMuebles(ArrayList<Mueble> listaMuebles) {
        this.listaMuebles = listaMuebles;
    }

    public boolean estaVacia() {
        return listaMuebles.isEmpty();
    }

    public boolean verificarDisponibilidad(String tipoMueble, int cantidad) {
        int count = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble) && mueble.isEstado() == true) {
                System.out.println("/nContador de verificar "+count);
                count++;
                
                if (count == cantidad) {
                    return true;
                }
            }
        }
        return false;
    }

    public void actualizarDisponibilidad(String tipoMueble, int cantidad, boolean finalizacion) {
        int count = 0;
        switch (tipoMueble) {
            
            case "Carpa" -> {
                for (int i = 0; i < listaMuebles.size(); i++) {
                    if (listaMuebles.get(i) instanceof Carpa && count < cantidad) {
                        System.out.println("/nContador de actualizar Carpa " + count);
                        count++;
                        listaMuebles.remove(i);
                    }
                }
            }
            case "Silla" -> {
                for (int i = 0; i < listaMuebles.size(); i++) {
                    if (listaMuebles.get(i) instanceof Silla && count < cantidad) {
                        System.out.println("/nContador de actualizar Silla " + count);
                        count++;
                        listaMuebles.remove(i);
                    }
                }
            }
            case "Mesa" -> {
                for (int i = 0; i < listaMuebles.size(); i++) {
                    if (listaMuebles.get(i) instanceof Mesa && count < cantidad) {
                        System.out.println("/nContador de actualizar Mesa " + count);
                        count++;
                        listaMuebles.remove(i);
                    }
                }
            }
        }
    }
    
    public void actualizarDevolucion(String tipoMueble, int cantidad, boolean finalizacion) {
        int count = 0;
        switch (tipoMueble) {
            
            case "Carpa" -> {
                Carpa carpa=new Carpa(5);
                for (int i = 0; i < listaMuebles.size(); i++) {
                    if (listaMuebles.get(i) instanceof Carpa && count < cantidad) {
                        System.out.println("/nContador de actualizar Carpa " + count);
                        count++;
                        listaMuebles.add(carpa);
                    }
                }
            }
            case "Silla" -> {
                Silla silla=new Silla(3);
                for (int i = 0; i < listaMuebles.size(); i++) {
                    if (listaMuebles.get(i) instanceof Silla && count < cantidad) {
                        System.out.println("/nContador de actualizar Silla " + count);
                        count++;
                        listaMuebles.add(silla);
                    }
                }
            }
            case "Mesa" -> {
                Mesa mesa=new Mesa(4);
                for (int i = 0; i < listaMuebles.size(); i++) {
                    if (listaMuebles.get(i) instanceof Mesa && count < cantidad) {
                        System.out.println("/nContador de actualizar Mesa " + count);
                        count++;
                        listaMuebles.add(mesa);
                    }
                }
            }
        }
    }

    public double consultarPrecio(String tipoMueble) {

        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble)) {
                return mueble.getPrecio();
            }
        }
        return 0.0;
    }
    
    public void repararMuebles(String tipoMueble, int cantidad){
        int count = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble) && mueble.isNecesitaMantenimiento()== true) {
                count++;
                mueble.setNecesitaMantenimiento(false);
                if (count == cantidad) {
                    return;
                }
            }
        }
    }
    
    public void necesitanReparacion(String tipoMueble, int cantidad){//Esto coloca quien envia el mensaje: inventario.necesitanreparacion(tipoMueble,cantidad)
        int count = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble.esTipo(tipoMueble) && mueble.isNecesitaMantenimiento()== false) {
                count++;
                mueble.setNecesitaMantenimiento(true);
                if (count == cantidad) {
                    return;
                }
            }
        }
    }
    
    public int contarMesas() {
        int cantidadMesas = 0;
        System.out.println("Lista de Muebles tiene: " + listaMuebles.size() + " elementos.");
        for (Mueble mueble : listaMuebles) {
            //System.out.println("Revisando mueble: " + mueble.getClass().getSimpleName());
            if (mueble instanceof Mesa && mueble.isEstado()==true) {
                cantidadMesas++;
            }
        }
        //System.out.println("Cantidad de Mesas encontradas: " + cantidadMesas);
        return cantidadMesas;
    }
    
    public int contarSillas() {
        int cantidadSillas = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Silla && mueble.isEstado()==true) { 
                cantidadSillas++;
            }
        }
        return cantidadSillas;
    }

    public int contarCarpas() {
        int cantidadCarpas = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Carpa && mueble.isEstado()==true) {
                cantidadCarpas++;
            }
        }
        return cantidadCarpas;
    }
        
    public int contarMesasReparar() {
        int cantidadMesasR = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Mesa && mueble.isNecesitaMantenimiento()==true) { 
                cantidadMesasR++;
            }
        }
        return cantidadMesasR;
    }

    public int contarSillasReparar() {
        int cantidadSillasR = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Silla && mueble.isNecesitaMantenimiento()==true) {
                cantidadSillasR++;
            }
        }
        return cantidadSillasR;
    }

    public int contarCarpasReparar() {
        int cantidadCarpasR = 0;
        for (Mueble mueble : listaMuebles) {
            if (mueble instanceof Carpa && mueble.isNecesitaMantenimiento()==true) {
                cantidadCarpasR++;
            }
        }
        return cantidadCarpasR;
    }

}
