package Mueble;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Mueble> listaMuebles = new ArrayList<>();

    public Inventario() {

    }

    public void agregarMueble(Mueble mueble) {
        listaMuebles.add(mueble);
    }

//    public double verificarDisponibilidad(String tipoMueble, int cantidad) {
        double precioMueble = 0;
        switch (tipoMueble) {
            case "Carpa" ->  {
                int count = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Carpa) {
                        if (mueble.getEstado()) {
                            count++;
                            if (count == cantidad) {
                                precioMueble = mueble.getPrecio();
                            }
                        }
                    }
                }
            }
            case "Silla" ->  {
                int count = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Silla) {
                        if (mueble.getEstado()) {
                            count++;
                            if (count == cantidad) {
                                precioMueble = mueble.getPrecio();
                            }
                        }
                    }
                }
            }
            case "Mesa" ->  {
                int count = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Mesa) {
                        if (mueble.getEstado()) {
                            count++;
                            if (count == cantidad) {
                                precioMueble = mueble.getPrecio();
                            }
                        }
                    }
                }
            }

        }
        return precioMueble;
    }
    public void actualizarDisponibilidad(String tipoMueble, int cantidad, boolean devolucion) {
        switch (tipoMueble) {
            case "Carpa" ->  {
                int count = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Carpa) {
                        if (mueble.getEstado()) {
                            if (count < cantidad && devolucion==false) {
                                
                                mueble.setEstado(false);
                            }else{
                                if(devolucion){
                                    mueble.setEstado(true)
                                   };
                            count++;
                        }
                    }
                }
            }
            case "Silla" ->  {
                int count = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Silla) {
                          if (mueble.getEstado()) {
                            if (count < cantidad) {
                                mueble.setEstado(false);
                            }
                            count++;
                        }
                    }
                }
            }
            case "Mesa" ->  {
                int count = 0;
                for (Mueble mueble : listaMuebles) {
                    if (mueble instanceof Mesa) {
                           if (mueble.getEstado()) {
                            if (count < cantidad) {
                                mueble.setEstado(false);
                            }
                            count++;
                        }
                    }
                }
            }
        }
    }
}
