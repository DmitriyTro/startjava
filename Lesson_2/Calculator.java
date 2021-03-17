public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                System.out.println("Addition of numbers: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Subtraction of numbers: " + (firstNumber - secondNumber));
                break;
            case '/':
                System.out.println("Division of numbers: " + (firstNumber / secondNumber));
                break;
            case '*':
                System.out.println("Multiplication of numbers: " + (firstNumber * secondNumber));
                break;
            case '%':
                if (firstNumber % secondNumber != 0) {
                    System.out.println("Remainder of the division: " + (firstNumber % secondNumber));
                } else {
                    System.out.println("Division without remainder.");
                }
                break;
            case '^':
                int result = 1;
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("Degree of number: " + result);
                break;
            default:
                System.out.println("Unknown operation.");
        }
    }
}
