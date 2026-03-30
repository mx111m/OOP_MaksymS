import java.io.Serializable;

public class Item implements Serializable {
    double v0;
    double angle;
    double result;

    public Item(double v0, double angle, double result) {
        this.v0 = v0;
        this.angle = angle;
        this.result = result;
    }

    public String toString() {
        return "v0=" + v0 + ", angle=" + angle + ", s=" + result;
    }
}
