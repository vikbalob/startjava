package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts + 1);
    }

    public void setNumbers(int numbers) {
        this.numbers[attempts] = numbers;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
}