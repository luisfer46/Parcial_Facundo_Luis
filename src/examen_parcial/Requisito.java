package examen_parcial;

public class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = true; // habilitado por defecto
    }

    public void habilitar() {
        this.estado = true;
    }

    public void deshabilitar() {
        this.estado = false;
    }

    public int getOrden() {
        return orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }
}
