import java.util.List;

public class AvgCommand implements Command {

    private Data data;
    private double result;

    public AvgCommand(Data data) {
        this.data = data;
    }

    @Override
    public void execute() {
        List<Double> list = data.getData();

        double sum = 0;
        for (double v : list) {
            sum += v;
        }

        result = sum / list.size();
        System.out.println("AVG = " + result);
    }
}