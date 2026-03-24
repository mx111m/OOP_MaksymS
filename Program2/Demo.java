import java.io.*;
import java.util.Scanner;

/**
 * Демонстрація серіалізації та десеріалізації.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть швидкість v0: ");
        double v0 = scanner.nextDouble();

        System.out.print("Введіть кут α: ");
        double angle = scanner.nextDouble();

        BallisticData data = new BallisticData(v0, angle);
        Calculator calc = new Calculator(data);
        calc.calculate();

        System.out.println("Результат: " + data.result);

        // Серіалізація
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(data);
            System.out.println("Об'єкт збережено");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десеріалізація
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            BallisticData loaded = (BallisticData) ois.readObject();
            System.out.println("Відновлений результат: " + loaded.result);
            System.out.println("Transient поле: " + loaded.tempValue); // буде 0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
