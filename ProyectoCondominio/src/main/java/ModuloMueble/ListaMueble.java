
package ModuloMueble;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ModuloMueble.TipoMueble;


public class ListaMueble {
 
private static final String ARCHIVO_MUEBLES = "muebles.txt";
    private static final String ARCHIVO_TIPOS_MUEBLE = "tipos_mueble.txt";

    public List<Mueble> cargarMuebles() {
        List<Mueble> muebles = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_MUEBLES))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                int id = Integer.parseInt(partes[0]);
                int tipoId = Integer.parseInt(partes[1]);

                TipoMueble tipoMueble = obtenerTipoMueblePorId(tipoId);

                Mueble mueble = new Mueble();
                mueble.setIdMueble(id);
                mueble.setTipo(tipoMueble);

                muebles.add(mueble);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return muebles;
    }

    /*public void guardarMuebles(List<Mueble> muebles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_MUEBLES))) {
            for (Mueble mueble : muebles) {
                writer.write(mueble.getIdMueble() + "," + mueble.getTipo().getIdTipoMueble());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

     /*private TipoMueble obtenerTipoMueblePorId(int idTipoMueble) {
        List<TipoMueble> tiposMueble = cargarTiposMueble();
        for (TipoMueble tipoMueble : tiposMueble) {
            if (tipoMueble.getIdTipoMueble() == idTipoMueble) {
                return tipoMueble;
            }
        }
        return null;  // Si no se encuentra, devolver null (ajusta según tus necesidades)
    }}*/

    // Resto de la clase    
    
    
    
    
    
    
}