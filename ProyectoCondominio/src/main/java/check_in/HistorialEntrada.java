
package check_in;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HistorialEntrada implements Serializable{
    private List<RegistroEntrada> registros = new ArrayList<>();

    public HistorialEntrada() {
    }
    
    public HistorialEntrada(List<RegistroEntrada> registros) {
        this.registros = registros;
    }

    public List<RegistroEntrada> getRegistros() {
        return registros;
    }   
    
    public void aniadirRegistro(RegistroEntrada registro){
        registros.add(registro);
    }

    @Override
    public String toString() {
        return "HistorialEntrada \n" + "===========" + registros.toString();
    }
    //AÑADIDO
}
