package Inmueble;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
//        Residente r1= new Residente("Juan", esPropietario);
//        Departamento d1 = new Departamento(r1);
//        condominio.getDepartamento();
        Condominio condominio=new Condominio();
        condominio.crearCondominio("condominio.txt");
    }
    
}
