package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.print("Введите математическое выражение: ");
            String expression = scanner.next();
            String[] expressionElements = expression.split("");
            calculator.setFirstNumber(Integer.parseInt(expressionElements[0]));
            calculator.setOperation(expressionElements[1].charAt(0));
            calculator.setSecondNumber(Integer.parseInt(expressionElements[2]));

            calculator.calculate();

            do {
                System.out.println("Хотите продолжить? [Yes/No]: ");
                answer = scanner.next();
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
