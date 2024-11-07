package objets;

public class Rectangle extends GeometrycObjet {
    private double height;
    private double width;
    public Rectangle(){}
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width+2*height;
    }
    public void printRectangle(){
        System.out.println(super.toString());
        System.out.println("area " + getArea());
        System.out.println("perimetro" + getPerimeter());
    }

}
