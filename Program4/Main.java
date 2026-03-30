public class Main extends Main3 {

    public Main(View view) {
        super(view);
    }

    public static void main(String[] args) {
        Main app = new Main(new ViewableTable().getView());
        app.menu();
    }
}
