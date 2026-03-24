import java.io.Serializable;

/**
 * Клас для зберігання параметрів і результатів обчислень.
 */
public class BallisticData implements Serializable {
    private static final long serialVersionUID = 1L;

    public double v0; // початкова швидкість
    public double angle; // кут у градусах
    public double result; // дальність польоту

    public transient double tempValue; // не серіалізується

    public BallisticData(double v0, double angle) {
        this.v0 = v0;
        this.angle = angle;
    }
}
