import ex02.View;
import ex02.ViewableResult;
import ex04.*;

public class Main {

    private View view = new ViewableResult().getView();
    private Menu menu = new Menu();

    public void run() {
        menu.add(new ViewConsoleCommand(view));
        menu.add(new GenerateConsoleCommand(view));
        menu.add(new ChangeConsoleCommand(view));
        menu.add(new ExecuteConsoleCommand(view));
        menu.execute();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
