package examen_parcial;

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

    // Agregar requisito a la oferta
    public void agregarRequisito(int orden, String descripcion) {
        Requisito requisito = new Requisito(orden, descripcion);
        requisitos.add(requisito);
    }

    // Eliminar requisito por su orden
    public void eliminarRequisito(int orden) {
        requisitos.removeIf(r -> r.getOrden() == orden);
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Requisito> getRequisitos() {
        return requisitos;
    }
}
