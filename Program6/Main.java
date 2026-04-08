public class Main {

    public static void main(String[] args) throws InterruptedException {

        Data data = new Data(10);
        CommandQueue queue = new CommandQueue();

        queue.put(new AvgCommand(data));
        queue.put(new MaxCommand(data));
        queue.put(new MinMaxCommand(data));

        Thread.sleep(2000);

        queue.shutdown();
    }
}