import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {
    private List<Double> data = new ArrayList<>();

    public Data(int n) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            data.add(-100 + r.nextDouble() * 200);
        }
    }

    public List<Double> getData() {
        return data;
    }
}