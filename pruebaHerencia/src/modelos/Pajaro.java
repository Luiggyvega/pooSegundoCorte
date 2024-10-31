package modelos;

public class Pajaro extends Animal{
    private int cantidadPlumas;

    public Pajaro(String nombre, int cantidadPlumas) {
        super(nombre);
        this.cantidadPlumas = cantidadPlumas;
    }


    public void volar(){
        System.out.println(this.getNombre() + " esta volando " + " y tiene " + this.cantidadPlumas + " plumas");
    }
}
