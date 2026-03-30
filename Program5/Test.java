public class Test {
    public static void main(String[] args) {
        GenerateCommand g = new GenerateCommand();
        g.execute();

        ViewCommand v = new ViewCommand();
        v.execute();

        System.out.println("test ok");
    }
}
