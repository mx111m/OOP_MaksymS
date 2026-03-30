import java.util.*;

public class GenerateCommand implements ConsoleCommand {

    public char getKey() { return 'g'; }

    public void execute() {
        Data.list.clear();
        for (int i = 0; i < 5; i++) {
            Data.list.add((int)(Math.random()*100));
        }
        System.out.println("generated");
    }
}
