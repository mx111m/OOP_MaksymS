/**
 * Клас для тестування.
 */
public class Test {
    public static void main(String[] args) {
        BallisticData data = new BallisticData(10, 45);
        Calculator calc = new Calculator(data);
        calc.calculate();

        if (data.result > 0) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Помилка");
        }
    }
}
