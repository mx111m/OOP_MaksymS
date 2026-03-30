package ex05;

import java.util.concurrent.TimeUnit;
import ex02.ViewResult;
import ex04.Command;

public class MaxCommand implements Command {

    private int result = -1;
    private int progress = 0;
    private ViewResult viewResult;

    public MaxCommand(ViewResult viewResult) {
        this.viewResult = viewResult;
    }

    public int getResult() {
        return result;
    }

    public boolean running() {
        return progress < 100;
    }

    @Override
    public void execute() {
        progress = 0;

        int size = viewResult.getItems().size();
        result = 0;

        for (int i = 1; i < size; i++) {
            if (viewResult.getItems().get(i).getY() >
                viewResult.getItems().get(result).getY()) {
                result = i;
            }

            progress = i * 100 / size;

            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }

        progress = 100;
    }
}
