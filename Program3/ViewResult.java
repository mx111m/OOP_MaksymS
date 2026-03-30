import java.io.*;
import java.util.ArrayList;

public class ViewResult implements View {

    private ArrayList<Item> items = new ArrayList<>();
    private static final String FILE = "data.bin";

    private double calc(double v0, double angle) {
        double g = 9.81;
        double rad = Math.toRadians(angle);
        return (v0 * v0 * Math.sin(2 * rad)) / g;
    }

    public void viewInit() {
        items.clear();

        for (int i = 0; i < 3; i++) {
            double v0 = 10 + i * 5;
            double angle = 30 + i * 10;
            double res = calc(v0, angle);

            items.add(new Item(v0, angle, res));
        }
    }

    public void viewShow() {
        System.out.println("Results:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void viewSave() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
        oos.writeObject(items);
        oos.close();
    }

    public void viewRestore() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
        items = (ArrayList<Item>) ois.readObject();
        ois.close();
    }
}
