package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);

    private Player playerOne;
    private Player playerTwo;
    private int compNumber;
    private int attempt = 0;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        compNumber = (int) (Math.random() * 101);

        while (attempt != 10) {
            System.out.println("Попытка: " + (attempt + 1));

            if (addAttempt(playerOne)) {
                break;
            }

            if (addAttempt(playerTwo)) {
                break;
            }
            attempt++;
        }
        gameResult(playerOne);
        gameResult(playerTwo);

        setUp(playerOne);
        setUp(playerTwo);
    }
    private boolean addAttempt(Player player) {
        inputNumber(player);
        checkNumber(player);
        return player.isWin();
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(attempt, scanner.nextInt());
    }

    private void checkNumber(Player player) {
        if (player.getNumber() == compNumber) {
            showWinner(player);
            player.setIsWin(true);
        } else if (player.getNumber() < compNumber) {
            System.out.println(player.getName() + ", ваше число меньше, чем загадал компьютер.");
        } else if (player.getNumber() > compNumber) {
            System.out.println(player.getName() + ", выше число больше, чем загадал компьютер.");
        }
        if (attempt == 9 && !player.isWin()) {
            System.out.println(player.getName() + ", ваши попытки закончились!");
        }
    }

    private void showWinner(Player player) {
        System.out.println(player.getName() + ", победил!");
        System.out.println(player.getName() + ", угадал число: " + player.getNumber() + " c " + (attempt + 1) + " попытки!");
    }

    private void gameResult(Player player) {
        if (attempt == 10) {
            playerNumbers(player, attempt);
        } else {
            playerNumbers(player, attempt + 1);
        }
    }

    private void playerNumbers(Player player, int attempt) {
        System.out.print(player.getName() + " ");
        int[] playerAttempts = player.getNumbers(attempt);
        System.out.println(Arrays.toString(playerAttempts));
    }

    private void setUp(Player player) {
        Arrays.fill(player.getNumbers(attempt), 0, attempt, 0);
        player.setIsWin(false);
    }
}