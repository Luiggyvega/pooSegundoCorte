package geometricObjet;

import java.awt.geom.Area;

public class Rectangle extends GeometricObjet {
    private double whidth;
    private double heigth;

    public Rectangle(double whidth, double heigth) {
        this.whidth = whidth;
    }

    public double getWhidth() {
        return whidth;
    }

    public void setWhidth(double whidth) {
        this.whidth = whidth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getArea(){
        double area;
        return area = whidth * heigth;
    }
    public double getPerimetro(){
        double perimetro;
        return perimetro = (2*whidth)+(2*heigth);
    }
}
