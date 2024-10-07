import java.util.ArrayList;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private ArrayList<Oferta> ofertas;
    private ArrayList<Contacto> contactos;

    public Cliente(String RUC, String nombre, String email, String telefono) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.ofertas = new ArrayList<>();
        this.contactos = new ArrayList<>();
    }

    public boolean agregarOferta(Oferta oferta) {
        return ofertas.add(oferta);
    }

    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        contactos.add(new Contacto(DNI, nombres, apellidos, puesto));
    }

    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getRUC() {
        return RUC;
    }
}
