package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;

    private int compNumber = (int) (Math.random() * 101);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        do {
            if (makeMove(playerOne) || makeMove(playerTwo)) {
                break;
            }
        } while (true);

        playerNumbers(playerOne);
        playerNumbers(playerTwo);

        setUp(playerOne);
        setUp(playerTwo);
    }
    private boolean makeMove(Player player) {
        boolean isContinue = false;
        inputNumber(player);
        if (checkNumber(player) || gameResult(player)) {
            isContinue = true;
        }
        return isContinue;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scanner.nextInt());
        System.out.println("Попытка игрока " + player.getName() + " номер: "  + (player.getAttempt()));
    }

    private boolean checkNumber(Player player) {
        boolean isCheck = false;
        if (player.getNumber() == compNumber) {
            System.out.println("Игрок " + player.getName() + ", угадал число: " + compNumber + " c " + player.getAttempt() + " попытки!");
            isCheck = true;
        } else {
            String compare = player.getNumber() > compNumber ? "больше" : "меньше";
            System.out.println("Игрок: " + player.getName() + " ввел число " + compare  + " того, что загадал компьютер.");
        }
        return isCheck;
    }

    private boolean gameResult(Player player) {
        boolean isGameOver = false;
        if (player.getAttempt() >= 10) {
            System.out.println(player.getName() + ", ваши попытки закончились!");
            isGameOver = true;
        }
        return isGameOver;
    }

    private void playerNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }

    private void setUp(Player player) {
        Arrays.fill(player.getNumbers(), 0, player.getAttempt(), 0);
    }
}