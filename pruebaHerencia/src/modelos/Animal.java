package modelos;

public class Animal {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre){
        this.nombre= nombre;
    }
    public void comer(){
        System.out.println(this.nombre + "esta comiendo");

    }
}
