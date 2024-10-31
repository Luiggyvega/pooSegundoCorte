package modelos;

public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre);
    }

   public void maullar(){
       System.out.println(this.getNombre() + " esta maullando");
   }
}
