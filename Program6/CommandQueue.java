import java.util.LinkedList;

public class CommandQueue {

    private final LinkedList<Command> tasks = new LinkedList<>();

    private boolean running = true;

    public CommandQueue() {
        Thread worker = new Thread(() -> {
            while (running) {
                Command cmd = take();
                if (cmd != null) {
                    cmd.execute();
                }
            }
        });

        worker.start();
    }

    public synchronized void put(Command cmd) {
        tasks.add(cmd);
        notify();
    }

    public synchronized Command take() {
        while (tasks.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        return tasks.poll();
    }

    public void shutdown() {
        running = false;
    }
}