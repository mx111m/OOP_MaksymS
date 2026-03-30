import java.util.*;

public class Menu implements Command {

    private List<ConsoleCommand> commands = new ArrayList<>();
    private Stack<Command> history = new Stack<>();

    public void add(ConsoleCommand c) {
        commands.add(c);
    }

    public Stack<Command> getHistory() {
        return history;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        String s;

        while (true) {
            System.out.println("g-generate v-view c-change u-undo q-exit");
            s = sc.nextLine();

            if (s.equals("q")) break;

            for (ConsoleCommand c : commands) {
                if (s.charAt(0) == c.getKey()) {
                    c.execute();
                    history.push(c);
                }
            }
        }
    }
}
