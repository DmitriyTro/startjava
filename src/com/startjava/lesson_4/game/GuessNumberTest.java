package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scanner.next());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String answer;
        do {
            guessNumber.start();
            do {
                System.out.print("Хотите продолжить? [Yes/No]: ");
                answer = scanner.next();
            } while (!answer.equals("Yes") && !answer.equals("No"));
        } while (answer.equals("Yes"));
    }
}
