package objets;

public class Circle extends GeometrycObjet {
    private double radius;
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getDiameter() {
        return 2 * Math.PI * radius;
    }
    public void printCircle(){
        System.out.println(super.toString());
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
