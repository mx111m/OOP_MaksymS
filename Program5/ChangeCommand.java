public class ChangeCommand implements ConsoleCommand {

    public char getKey() { return 'c'; }

    public void execute() {
        for (int i = 0; i < Data.list.size(); i++) {
            Data.list.set(i, Data.list.get(i) * 2);
        }
        System.out.println("changed");
    }
}
