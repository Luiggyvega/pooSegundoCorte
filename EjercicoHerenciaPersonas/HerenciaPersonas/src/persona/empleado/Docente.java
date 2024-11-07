package persona.empleado;

public class Docente extends Empleado {
    private String titulo;
    public Docente(){
        titulo = "licenciado en español";
    }

    public Docente(String nombre, String direccion, String numeroTelefonico, String correo, String cargo, double salario, String fechaContratacion, String titulo) {
        super(nombre, direccion, numeroTelefonico, correo, cargo, salario, fechaContratacion);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void printDocente(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulo='" + titulo + '\'' +
                "nombre= " + getNombre() + '\'' +
                '}';
    }
}
