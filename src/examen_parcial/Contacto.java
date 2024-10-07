package examen_parcial;

public class Contacto {
    private String DNI;
    private String nombres;
    private String apellidos;
    private String puesto;

    public Contacto(String DNI, String nombres, String apellidos, String puesto) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }
}
