import java.util.ArrayList;

public class Postulante {
    private String DNI;
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String nacimiento;
    private ArrayList<Postulacion> postulaciones;

    public Postulante(String DNI, String email, String nombres, String apellidos, String direccion, String nacimiento) {
        this.DNI = DNI;
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.postulaciones = new ArrayList<>();
    }

    public void postular(Oferta oferta) {
        postulaciones.add(new Postulacion(oferta));
    }

    public ArrayList<Postulacion> getPostulaciones() {
        return postulaciones;
    }
    public String getDNI() {
        return DNI;
    }
}
