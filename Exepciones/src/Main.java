import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        try{
            System.out.println("introdusca un numero entero");
            int numerador = scaner.nextInt();
            System.out.println("intrdusca un denominador entero");
            int denominador = scaner.nextInt();
            int resultado = cociente(numerador,denominador);
            System.out.println("resultado: "+ numerador + "/" + denominador +"="+resultado);
        }catch (ArithmeticException arithmeticException){
            System.err.println("axepcion: " + arithmeticException);
            System.out.println("cero es un denominador invalido. intente de nuevo");
        }
        catch (InputMismatchException inputMismatchException){
            System.err.println("exepcion" + inputMismatchException);
            System.out.println("ingrese un numero entereo");
        }
    }
    public static int cociente (int numerador, int denominador){
        return numerador /denominador;
    }
}