package objets;

import java.util.Date;

public class GeometrycObjet {
    private String color;
    private boolean filled;
    private final Date date = new Date();

    public GeometrycObjet() {
        color="white";
        filled=false;
    }

    public GeometrycObjet(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "GeometrycObjet{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", date=" + date +
                '}';
    }
}
