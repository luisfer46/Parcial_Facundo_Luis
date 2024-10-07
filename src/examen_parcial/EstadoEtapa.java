public class EstadoEtapa {
    private String nombre;
    private boolean estado;

    public EstadoEtapa(String nombre) {
        this.nombre = nombre;
        this.estado = true; // Habilitado por defecto
    }

    public void habilitar() {
        this.estado = true;
    }

    public void deshabilitar() {
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstado() {
        return estado;
    }
}
