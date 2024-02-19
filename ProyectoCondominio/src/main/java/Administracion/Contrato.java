package Administracion;

public class Contrato {

    private String fechaContrato;
    private String precioContrato;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;

    public Contrato(String fechaContrato, String precioContrato, String descripcion, String fechaInicio, String fechaFin) {
        this.fechaContrato = fechaContrato;
        this.precioContrato = precioContrato;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void iniciar() {
        System.out.print("Se inicio el contrato");
    }

    public void terminar() {
        System.out.print("Se termino el contrato");
    }
}
