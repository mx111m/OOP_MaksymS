package ex05;

import java.util.Vector;
import ex04.Command;

public class CommandQueue implements Queue {

    private Vector<Command> tasks = new Vector<>();
    private boolean waiting = false;
    private boolean shutdown = false;

    public CommandQueue() {
        new Thread(new Worker()).start();
    }

    public void shutdown() {
        shutdown = true;
    }

    @Override
    public synchronized void put(Command cmd) {
        tasks.add(cmd);
        notify();
    }

    @Override
    public synchronized Command take() {
        while (tasks.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        return tasks.remove(0);
    }

    private class Worker implements Runnable {
        @Override
        public void run() {
            while (!shutdown) {
                Command cmd = take();
                cmd.execute();
            }
        }
    }
}
