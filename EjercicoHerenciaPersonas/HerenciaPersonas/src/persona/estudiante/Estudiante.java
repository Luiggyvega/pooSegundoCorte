package persona.estudiante;

import persona.Persona;

public class Estudiante extends Persona {
    private String estado;
    public Estudiante (){
        estado = "estudiante";
    }

    public Estudiante(String nombre, String direccion, String numeroTelefonico, String correo, String estado) {
        super(nombre, direccion, numeroTelefonico, correo);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void printEstudiante(){
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "estado='" + estado + '\'' +
                "nombre=" + getNombre() +
                '}';
    }
}
