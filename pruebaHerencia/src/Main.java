import modelos.Gato;
import modelos.Pajaro;
import modelos.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("juan ");
        Gato gato = new Gato ("miguel ");
        Pajaro pajaro = new Pajaro("piolin" , 100);

        pajaro.volar();
        perro.ladrar();
        gato.maullar();

        pajaro.comer();
        perro.comer();
        gato.comer();
    }
}