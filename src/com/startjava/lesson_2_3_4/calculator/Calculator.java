package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    void start() {
        Scanner sc = new Scanner(System.in);
        char answer = 'Y';
        while (answer != 'N') {
            if (answer == 'Y') {
                System.out.print("Enter the math expression on one line. (For example 2+2): ");
                String string = sc.nextLine();
                String text = string.replaceAll("\\s+", ""); //remove all spaces, regardless of their number
                String[] numbs = text.split("\\D+"); //add to array only digits
                String[] signs = text.split("\\d+"); //add to array only symbols
                int num1 = Integer.parseInt(numbs[0]);
                char sign = signs[1].charAt(0);
                int num2 = Integer.parseInt(numbs[1]);
                calculate(num1, sign, num2);
            }
            System.out.print("Do you want to continue? [Y/N]: ");
            answer = sc.nextLine().charAt(0);
            if (answer != 'N' && answer != 'Y') {
                System.out.println("Wrong answer! Try again!");
            }
        }
    }

    // Overloaded and overrided Math.floorDiv method. Replaced the return operator with "int" on "double".
    private double floorDiv(double x, double y) {
        return x / y;
    }

    // Overloaded and overrided Math.pow method. Replaced the return operator with "double" on "long".
    private long pow(int x, int y) {
        long r = 1;
        while (y > 0) {
            r *= x;
            y--;
        }
        return r;
    }

    private void calculate(int num1, char sign, int num2) {
        switch (sign) {
            case '+':
                System.out.println(Math.addExact(num1, num2));
                break;
            case '-':
                System.out.println(Math.subtractExact(num1, num2));
                break;
            case '*':
                System.out.println(Math.multiplyExact(num1, num2));
                break;
            case '/':
                try {
                    if (Math.floorMod(num1, num2) == 0) {
                        System.out.println(Math.floorDiv(num1, num2));
                    } else {
                        System.out.printf("%.5f\n", floorDiv(num1, num2));
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error! You cannot divide by zero.");
                }
                break;
            case '%':
                try {
                    System.out.println(Math.floorMod(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println("Error! You cannot divide by zero.");
                }
                break;
            case '^':
                System.out.println(pow(num1, num2));
                break;
            default:
                System.out.println("Wrong operation! Try again.");
                break;
        }
    }
}