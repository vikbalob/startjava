package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.util.Arrays;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    public void start() {
        char answer = 'Y';
        while (answer != 'N') {
            if (answer == 'Y') {
                System.out.print("Enter the math expression on one line. (For example 2+2): ");
                String text = sc.nextLine();
                text.replaceAll("\\s", "");

                String[] numbers = text.split("[\\Q^*/+-%\\E]");
                
                int num1 = Integer.parseInt(members[0]);
                char sign = members[1].charAt(0);
                int num2 = Integer.parseInt(members[2]);
                System.out.println(calculate(num1, sign, num2));
            }
            System.out.println("Do you want to continue? [Y/N]:");
            answer = sc.next().charAt(0);
            if (answer != 'N' && answer != 'Y') {
                System.out.println("Wrong answer! Try again!");
            }
        }
    }

    public int calculate(int num1, char sign, int num2) {
        int result = 0;
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num2, num1);
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! You cannot divide by zero.");
                } else {
                    return Math.floorDiv(num1, num2);
                }
                break;
            case '%':
                return Math.floorMod(num1, num2);
            case '^':
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Wrong operation! Try again.");
                break;
        }
        return result;
    }
}