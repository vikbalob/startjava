package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    public void start() {
        char answer = 'Y';
        while (answer != 'N') {
            if (answer == 'Y') {
                System.out.print("Enter the math expression on one line. (For example 2+2): ");
                String string = sc.nextLine();
                String text = string.replaceAll("\\s+", ""); //убрать все пробелы, не зависимо от их количества
                String[] numbs = text.split("\\D+"); //занести в массив только цифры
                String[] signs = text.split("\\d+"); //занести в массив только символы
                int num1 = Integer.parseInt(numbs[0]);
                char sign = signs[1].charAt(0);
                int num2 = Integer.parseInt(numbs[1]);
                System.out.println(calculate(num1, sign, num2));
            }
            System.out.print("Do you want to continue? [Y/N]: ");
            answer = sc.nextLine().charAt(0);
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
                return Math.multiplyExact(num1, num2);
            case '/':
                try {
                    return Math.floorDiv(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println("Error! You cannot divide by zero.");
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