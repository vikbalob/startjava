package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    private final Player player1;
    private final Player player2;
    private int randomNum;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void numbersOfPlayer(Player player) {
        System.out.println("Numbers of " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void checkNumber(Player player) {
        System.out.print(player.getName() + ", enter the number: ");
        player.setNumbers(sc.nextInt());
        if (player.getNumbers()[player.getAttempt()] < randomNum) {
            System.out.println("The number is greater than yours!");
        } else if (player.getNumbers()[player.getAttempt()] > randomNum) {
            System.out.println("The number less than yours!");
        } else if (player.getNumbers()[player.getAttempt()] == randomNum) {
            System.out.println();
            System.out.println(player.getName() + " guessed the number " + randomNum +
                    " on " + player.getAttempt() + " attempts.");
        }
    }

    private void addAttempt(Player player) {
        player.setAttempt(player.getAttempt() + 1);
    }

    public boolean checkEquals(Player player) {
        if (player.getNumbers().equals(randomNum)) {
            return true;
        } else {
            return false;
        }
    }
    public void startGame() {
        randomNum = (int) (Math.random() * 101);
        do {
            while (player1.getAttempt() < 10 || player2.getAttempt() < 10) {
                addAttempt(player1);
                checkNumber(player1);

                if (!checkEquals(player1)) {
                    addAttempt(player2);
                    checkNumber(player2);
                }
            }
        } while (!checkEquals(player1) || !checkEquals(player2));

        if (player1.getAttempt() == 10 || player2.getAttempt() == 10) {
            System.out.println("Attempts is ended.");
            System.out.println("Computer`s number was " + randomNum);
        }
        numbersOfPlayer(player1);
        numbersOfPlayer(player2);
        Arrays.fill(player1.getNumbers(), 0, player1.getAttempt(), 0);
        Arrays.fill(player2.getNumbers(), 0, player2.getAttempt(), 0);
    }
}