
package ModuloMueble;


public class TipoMueble {
    private int idTipoMueble;
    private String nombre;

    
    
    
    public TipoMueble(int idTipoMueble, String nombre) {
        this.idTipoMueble = idTipoMueble;
        this.nombre = nombre;
    }
    
    
    

    public int getIdTipoMueble() {
        return idTipoMueble;
    }

    public void setIdTipoMueble(int idTipoMueble) {
        this.idTipoMueble = idTipoMueble;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}