import java.util.Formatter;

public class ViewTable extends ViewResult {

    private int width = 20;

    public ViewTable() {}

    public ViewTable(int width) {
        this.width = width;
    }

    // оверлоад
    public void init(int width) {
        this.width = width;
        viewInit();
    }

    public void init(int width, double step) {
        this.width = width;
        init(step);
    }

    // оверрайд
    @Override
    public void init(double step) {
        System.out.println("init...");
        super.init(step);
    }

    // таблиця
    private void line() {
        for (int i = 0; i < width; i++) System.out.print("-");
        System.out.println();
    }

    @Override
    public void viewShow() {
        line();

        System.out.printf("%-10s | %-10s | %-10s\n", "v0", "angle", "s");
        line();

        for (Item item : getItems()) {
            System.out.printf("%-10.2f | %-10.2f | %-10.2f\n",
                    item.v0, item.angle, item.result);
        }

        line();
    }
}
