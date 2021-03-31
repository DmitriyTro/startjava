package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;
    private int secretNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        secretNumber = (int) (Math.random() * 101);
        System.out.println("У вас 10 попыток");

        do {
            if (makeMove(playerOne) || makeMove(playerTwo)) {
                break;
            }
        } while (true);

        showNumbers(playerOne);
        showNumbers(playerTwo);

        playerOne.clear();
        playerTwo.clear();
    }

    private boolean makeMove(Player player) {
        boolean isContinue = false;
        inputNumber(player);
        if (checkNumber(player) || checkAttempts(player)) {
            isContinue = true;
        }
        return isContinue;
    }

    private void inputNumber(Player player) {
        System.out.println("Попытка игрока " + player.getName() + " номер: "  + (player.getAttempt() + 1));
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean checkNumber(Player player) {
        boolean isCheck = false;
        if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + ", угадал число: " + secretNumber + " c " + player.getAttempt() + " попытки!");
            isCheck = true;
        } else {
            String compare = player.getNumber() > secretNumber ? "больше" : "меньше";
            System.out.println("Игрок: " + player.getName() + " ввел число " + compare  + " того, что загадал компьютер.");
        }
        return isCheck;
    }

    private boolean checkAttempts(Player player) {
        boolean isGameOver = false;
        if (player.getAttempt() >= 10) {
            System.out.println(player.getName() + ", ваши попытки закончились!");
            isGameOver = true;
        }
        return isGameOver;
    }

    private void showNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
}