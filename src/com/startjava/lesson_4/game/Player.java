package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public void setNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempt + 1, 0);
        attempt = 0;
    }
}