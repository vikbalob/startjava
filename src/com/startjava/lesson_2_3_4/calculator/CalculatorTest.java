package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

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
                System.out.println(calc.calculate(num1, sign, num2));
            }
            System.out.println("Do you want to continue? [Y/N]:");
            answer = sc.nextLine().charAt(0);
            if (answer != 'N' && answer != 'Y') {
                System.out.println("Wrong answer! Try again!");
            }
        }
    }
}