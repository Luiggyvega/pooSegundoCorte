package persona.empleado;

public class Administrativo extends Empleado {
    public String horario;
    public Administrativo() {
        horario = "todo el dia";
    }

    public Administrativo(String nombre, String direccion, String numeroTelefonico, String correo, String cargo, double salario, String fechaContratacion, String horario) {
        super(nombre, direccion, numeroTelefonico, correo, cargo, salario, fechaContratacion);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void printAdministrativo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "horario='" + horario + '\'' +
                "nombre= " + getNombre() +
                '}';
    }
}
