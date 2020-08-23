package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

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
            case '%':
                return Math.floorMod(num1, num2);
            case '^':
                return (int) Math.pow(num1, num2);
            default:
                System.out.println("Wrong operation! Try again.");
        }
        return result;
    }
}