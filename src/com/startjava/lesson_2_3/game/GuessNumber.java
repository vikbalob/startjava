package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int compNum = (int) (Math.random() * 101);
        do {
            System.out.println("Enter the number (" + player1.getName() + "):");
            player1.setNumber(sc.nextInt());
            if (player1.getNumber() < compNum) {
                System.out.println("The number is greater than yours!");
            } else if (player1.getNumber() > compNum) {
                System.out.println("The number less than yours!");
            } else if (player1.getNumber() == compNum) {
                System.out.println("Winner is " + player1.getName());
                break;
            }

            System.out.println("Enter the number (" + player2.getName() + "):");
            player2.setNumber(sc.nextInt());
            if (player2.getNumber() < compNum) {
                System.out.println("The number is greater than yours!");
            } else if (player2.getNumber() > compNum) {
                System.out.println("The number less than yours!");
            } else if (player2.getNumber() == compNum) {
                System.out.println("Winner is " + player2.getName());
                break;
            }
        } while (true);
    }
}