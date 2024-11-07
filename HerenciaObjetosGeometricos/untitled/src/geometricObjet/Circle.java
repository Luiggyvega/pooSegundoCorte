package geometricObjet;

public class Circle extends GeometricObjet{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean fillend, double radius) {
        super(color, fillend);
        this.radius = radius;
    }

    public void circle(double area) {
        area=20;
    }

    double area;

    public double getRadius() {
        return radius = Math.sqrt(area / Math.PI) ;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area ;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
