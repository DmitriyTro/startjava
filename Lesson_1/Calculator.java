public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;
        char operation = '^';

        if (operation == '+') {
            System.out.println("Addition of numbers: " + (firstNumber + secondNumber));
        } else if (operation == '-') {
            System.out.println("Subtraction of numbers: " + (firstNumber - secondNumber));
        } else if (operation == '/') {
            System.out.println("Division of numbers: " + (firstNumber / secondNumber));
        } else if (operation == '*') {
            System.out.println("Multiplication of numbers: " + (firstNumber * secondNumber));
        } else if (operation == '%') {
            if (firstNumber % secondNumber != 0) {
                System.out.println("Remainder of the division: " + (firstNumber % secondNumber));
            } else {
                System.out.println("Division without remainder.");
            }
        } else if (operation == '^') {
            int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println("Degree of number: " + result);
        }
    }
}