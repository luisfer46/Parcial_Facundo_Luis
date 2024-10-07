import java.util.ArrayList;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private String fechaInicio;
    private String fechaTermino;
    private ArrayList<Requisito> requisitos;

    public Oferta(String puesto, String descripcion, String area, String fechaInicio, String fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.requisitos = new ArrayList<>();
    }

    public void agregarRequisito(int orden, String descripcion) {
        requisitos.add(new Requisito(orden, descripcion));
    }

    public void eliminarRequisito(int orden) {
        requisitos.removeIf(r -> r.getOrden() == orden);
    }

    public ArrayList<Requisito> getRequisitos() {
        return requisitos;
    }
}
