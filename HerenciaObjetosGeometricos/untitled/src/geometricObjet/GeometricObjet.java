package geometricObjet;

import java.util.Date;

public abstract class GeometricObjet {
    private String color ;
    private boolean fillend ;
    private final Date date = new Date();

    public GeometricObjet(){
        color="white";
        fillend=true;
    }

    public GeometricObjet(String color, boolean fillend) {
        this.color = color;
        this.fillend = fillend;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillend() {
        return fillend;
    }

    public void setFillend(boolean fillend) {
        this.fillend = fillend;
    }

    @Override
    public String toString() {
        return "GeometricObjet{" +
                "color='" + color + '\'' +
                ", fillend=" + fillend +
                ", date=" + date +
                '}';
    }
}
