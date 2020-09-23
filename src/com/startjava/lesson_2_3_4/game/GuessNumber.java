package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    private final Player player1;
    private final Player player2;
    private int randomNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        randomNum = (int) (Math.random() * 101);
        for (int i = 0; i < 11; i++) {
            if (game(player1)) {
                break;
            }
            if (game(player2)) {
                break;
            }
        }
        showNumbers(player1);
        showNumbers(player2);
        player1.zeroArray();
        player2.zeroArray();
    }

    public boolean game(Player player) {
        if (player.getAttempt() > 9) {
            System.out.println("Attempts is ended.");
            System.out.println("Computer`s number was " + randomNum);
            return false;
        }
        enterNumber(player);
        return checkNumber(player);
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + ", enter the number: ");
        player.setNumber(sc.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.returnLastNum() == randomNum) {
            System.out.println(player.getName() + " guessed the number " + randomNum +
                    " on " + player.getAttempt() + " attempts.\n");
            return true;
        }
        System.out.println("The number is " + (player.returnLastNum() < randomNum ? "greater than yours!\n" : "less than yours!\n"));
        return false;
    }

    private void showNumbers(Player player) {
        System.out.println("Numbers of " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}