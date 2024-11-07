package persona;

public class Persona {
    private String nombre;
    private String direccion;
    private String numeroTelefonico;
    private String correo;

    public Persona() {
        nombre = "pepito";
        direccion = "Madrid";
        numeroTelefonico = "123456789";
        correo = "pepito@gmail.com";
    }

    public Persona(String nombre, String direccion, String numeroTelefonico, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
