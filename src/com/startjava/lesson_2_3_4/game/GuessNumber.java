package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    private void numbersPlayers() {
        System.out.println("Numbers of " + player1.getName());
        for (int numbers : player1.getNumbers()) {
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println("Numbers of " + player2.getName());
        for (int numbers : player2.getNumbers()) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }
    public void startGame() {
        int compNum = (int) (Math.random() * 101);
        do {
            System.out.print(player1.getName() + ", enter the number: ");
            player1.setNumbers(sc.nextInt());
            if (player1.getNumbers()[player1.getAttempts()] < compNum) {
                System.out.println("The number is greater than yours!");
            } else if (player1.getNumbers()[player1.getAttempts()] > compNum) {
                System.out.println("The number less than yours!");
            } else if (player1.getNumbers()[player1.getAttempts()] == compNum) {
                System.out.println("Player " + player1.getName() + " guesses the number " + compNum +
                        " on " + player1.getAttempts() + " attempts.");
                break;
            }
            System.out.print(player2.getName() + ", enter the number: ");
            player2.setNumbers(sc.nextInt());
            if (player2.getNumbers()[player2.getAttempts()] < compNum) {
                System.out.println("The number is greater than yours!");
            } else if (player2.getNumbers()[player2.getAttempts()] > compNum) {
                System.out.println("The number less than yours!");
            } else if (player2.getNumbers()[player2.getAttempts()] == compNum) {
                System.out.println("Player " + player2.getName() + " guesses the number " + compNum +
                        " on " + player2.getAttempts() + " attempts.");
                break;
            }
            player1.setAttempts(player1.getAttempts() + 1);
            player2.setAttempts(player2.getAttempts() + 1);
        } while (player1.getAttempts() < 10 || player2.getAttempts() < 10);
        if (player1.getAttempts() == 10 || player2.getAttempts() == 10) {
            System.out.println("Attempts is ended.");
            System.out.println("Computer`s number was " + compNum);
        }
        numbersPlayers();
        Arrays.fill(player1.getNumbers(), 0, player1.getAttempts(), 0);
        Arrays.fill(player2.getNumbers(), 0, player2.getAttempts(), 0);
    }
}