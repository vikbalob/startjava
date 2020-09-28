package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    private final Player player1;
    private final Player player2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        randomNumber = (int) (Math.random() * 101);
        while (makeMove(player2)) {
            if (makeMove(player1)) { //
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }
        showNumbers(player1); //показать все набранные игроками числа
        showNumbers(player2);
        player1.clearNumbers(); //очистить массив чисел каждого игрока по окончании игры
        player2.clearNumbers();
    }

    public boolean makeMove(Player player) {
        if (player.getAttempt() > 9) {
            System.out.println("Attempts is ended.");
            System.out.println("Computer`s number was " + randomNumber);
            return false;
        }
        enterNumber(player);
        return checkNumber(player);
    }

    private void enterNumber(Player player) {
        System.out.print("\n" + player.getName() + ", enter the number: ");
        player.setNumber(sc.nextInt());
    }

    private boolean checkNumber(Player player) {
        if (player.getLastNumber() == randomNumber) {
            System.out.println("\n" + player.getName() + " guessed the number " + randomNumber +
                    " on " + player.getAttempt() + " attempts.");
            return true;
        }
        System.out.println("The number is " + (player.getLastNumber() < randomNumber ? "greater " : "less ") + "than yours!");
        return false;
    }

    private void showNumbers(Player player) {
        System.out.println("\nNumbers of " + player.getName());
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}