package Administracion;
import Comunicacion.Directo;
import Comunicacion.Global;
import java.util.ArrayList;
import java.util.List;

public class Administrador extends Perfil{
    public Administrador(String correo, String contrasena, String nombre){
        super(correo, contrasena, nombre);
    }
    public void crearCondominio(){
        
    }
    public void registrarResidente(){
        
    }
    public void recaudarAlicuota(){
        
    }
    public void pagarContrato(ArrayList<Contrato> contratos){
        
    }
    
    public void accionar(int tipo, Perfil origen, Perfil destino, List<Perfil> destinos) {
        switch (tipo) {
            case 1:
                mensaje = new Global(origen, destinos,"","");
                mensaje.crear();
                for (Perfil destinatario : destinos) {
                    destinatario.bandejaDeEntrada.recibirMensaje(mensaje);
                }
            break;
            case 2:
                mensaje = new Directo(origen, destino,"","");
                mensaje.crear();
                destino.bandejaDeEntrada.recibirMensaje(mensaje);
            break;
            case 3:
                mensaje = new Directo(origen, destino,"","");
                mensaje.crear();
                destino.bandejaDeEntrada.recibirMensaje(mensaje);
            break;
        }
    }
    
    
    
}
