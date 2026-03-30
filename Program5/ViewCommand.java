public class ViewCommand implements ConsoleCommand {

    public char getKey() { return 'v'; }

    public void execute() {
        System.out.println(Data.list);
    }
}
