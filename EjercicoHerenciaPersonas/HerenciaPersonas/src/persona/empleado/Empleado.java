package persona.empleado;

import persona.Persona;

public class Empleado extends Persona {
    private String cargo;
    private double salario;
    private String fechaContratacion;

    public Empleado(){
        cargo = "administrativo";
        salario = 0;
        fechaContratacion = "el 30 de febrero";
    }

    public Empleado(String nombre, String direccion, String numeroTelefonico, String correo, String cargo, double salario, String fechaContratacion) {
        super(nombre, direccion, numeroTelefonico, correo);
        this.cargo = cargo;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public void printEmpleado(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", salario=" + salario +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                '}';
    }
}
