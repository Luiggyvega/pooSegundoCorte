import objets.Circle;
import objets.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle1 = new Circle();
        circle1.printCircle();
        System.out.println("ingrese el radio del circulo");
        double radio = sc.nextDouble();
        Circle circle2 = new Circle(radio);
        System.out.println("ingrese el color del ciruclo");
        String color = sc.next();
        System.out.println("ingrese si el ciruclo esta lleno o vacio, true o false");
        boolean filled = sc.nextBoolean();
        System.out.println("ingrese el radio del otro circulo");
        double radio2 = sc.nextDouble();
        circle2.printCircle();
        Circle circle3 = new Circle(color,filled,radio2);
       circle3.printCircle();
        System.out.println("-----------------------");
        Rectangle rectangle1 = new Rectangle();
        rectangle1.printRectangle();
        Rectangle rectangle2 = new Rectangle(20,30);
        rectangle2.printRectangle();
        Rectangle rectangle3 = new Rectangle("blue",true,30,40);
        rectangle3.printRectangle();

    }

}