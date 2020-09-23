package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer = 'Y';
        while (answer != 'N') {
            if (answer == 'Y') {
                System.out.println("\nTASK: Guess the number (from 0 to 100).");
                System.out.println("You have 10 attempts. \n");
                System.out.print("Enter name of the first player: ");
                Player player1 = new Player(sc.next());
                System.out.print("Enter name of the second player: ");
                Player player2 = new Player(sc.next());
                GuessNumber game = new GuessNumber(player1, player2);
                game.startGame();
            }
            System.out.print("Do you want to continue? [Y/N]: ");
            answer = sc.next().charAt(0);
            if (answer != 'N' && answer != 'Y') {
                System.out.println("Wrong answer! Try again!");
            }
        }
        System.out.println("Goodbye! Until next time!");
    }
}