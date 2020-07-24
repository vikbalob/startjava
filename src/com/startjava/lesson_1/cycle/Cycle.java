package com.startjava.lesson_1.cycle;

public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int j = 6;
        while (j >= -6) {
            System.out.print(j + " ");
            j -= 2;
        }

        System.out.println();

        int num = 10;
        int sum = 0;
        do {
            if (num % 2 != 0) {
                sum += num;
            }
            num++;
        } while (num <= 20);
        System.out.println(sum);
    }
}

