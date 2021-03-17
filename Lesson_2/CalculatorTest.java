import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.println("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());

            System.out.println("Введите знак мат. операции: ");
            calculator.setOperation(scanner.next().charAt(0));

            System.out.println("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());

            calculator.calculate();

            do {
                System.out.println("Хотите продолжить? [Yes/No]: ");
                answer = scanner.next();
            } while (answer.equals("Yes") && answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
