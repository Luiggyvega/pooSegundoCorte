package modelos;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }
    public void ladrar(){
        System.out.println(this.getNombre() + "esta ladrando");
    }
}
