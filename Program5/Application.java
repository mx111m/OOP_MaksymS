public class Application {

    private static Application instance = new Application();

    private Application() {}

    public static Application getInstance() {
        return instance;
    }

    public void run() {
        Menu menu = new Menu();

        menu.add(new GenerateCommand());
        menu.add(new ViewCommand());
        menu.add(new ChangeCommand());
        menu.add(new UndoCommand());

        menu.execute();
    }
}
