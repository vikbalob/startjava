package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1722f, 9, 8, 6);
        System.out.println(jaeger1);

        System.out.println();

        Jaeger jaeger2 = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7890f, 8, 4, 6);
        System.out.println(jaeger2);
    }
}