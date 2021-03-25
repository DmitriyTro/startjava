package com.startjava.lesson_4.calculator;

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
                System.out.println("Remainder of number: " +  Math.IEEEremainder(firstNumber, secondNumber));
                break;
            case '^':
                System.out.println("Degree of number: " +  Math.pow(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Unknown operation.");
        }
    }
}
