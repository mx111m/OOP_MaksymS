/**
 * Клас для обчислення дальності польоту.
 */
public class Calculator {
    private BallisticData data;

    public Calculator(BallisticData data) {
        this.data = data;
    }

    public void calculate() {
        double g = 9.81;
        double angleRad = Math.toRadians(data.angle);

        data.result = (data.v0 * data.v0 * Math.sin(2 * angleRad)) / g;
    }
}
