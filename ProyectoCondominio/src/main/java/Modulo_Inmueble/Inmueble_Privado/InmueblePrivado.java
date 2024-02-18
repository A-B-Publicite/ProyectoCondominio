package Inmueble_Privado;
import Inmueble.Inmueble;
import Inmueble.TituloPropiedad;

public abstract class InmueblePrivado extends Inmueble{

    public InmueblePrivado(String tipo, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(tipo, metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
    }


}

