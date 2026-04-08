import java.util.List;

public class MinMaxCommand implements Command {

    private Data data;
    private double min;
    private double max;

    public MinMaxCommand(Data data) {
        this.data = data;
    }

    @Override
    public void execute() {
        List<Double> list = data.getData();

        min = list.get(0);
        max = list.get(0);

        for (double v : list) {
            if (v < min) min = v;
            if (v > max) max = v;
        }

        System.out.println("MIN = " + min + " | MAX = " + max);
    }
}