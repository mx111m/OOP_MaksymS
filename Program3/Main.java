import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private View view;

    public Main(View view) {
        this.view = view;
    }

    public void menu() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cmd = "";

        try {
            while (!cmd.equals("q")) {
                System.out.println("q-exit | v-view | g-generate | s-save | r-restore");
                cmd = reader.readLine();

                if (cmd.equals("v")) view.viewShow();
                if (cmd.equals("g")) view.viewInit();
                if (cmd.equals("s")) view.viewSave();
                if (cmd.equals("r")) view.viewRestore();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Main app = new Main(new ViewableResult().getView());
        app.menu();
    }
}
