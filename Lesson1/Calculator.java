import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        char operation = scanner.next().charAt(0);
        float num2 = scanner.nextFloat();
        if (operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else if (operation == '%') {
            System.out.println(num1 % num2);
        } else if (operation == '^') {
            System.out.println(Math.pow(num1, num2));
        } else
            System.out.println("Введена неправильная операция");
    }
