import java.util.*;

public class UndoCommand implements ConsoleCommand {

    public char getKey() { return 'u'; }

    public void execute() {
        System.out.println("undo (simple demo)");
    }
}
