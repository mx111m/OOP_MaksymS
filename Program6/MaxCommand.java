import java.util.List;

public class MaxCommand implements Command {

    private Data data;
    private double result;

    public MaxCommand(Data data) {
        this.data = data;
    }

    @Override
    public void execute() {
        List<Double> list = data.getData();

        result = list.get(0);
        for (double v : list) {
            if (v > result) result = v;
        }

        System.out.println("MAX = " + result);
    }
}