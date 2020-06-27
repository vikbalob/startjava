import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        char operation = scanner.next().charAt(0);
        float num2 = scanner.nextFloat();


        if (num1 < 0 || num2 < 0) {
            System.out.println("Введите положительное число!");
        } else if (operation == '+') {
            System.out.println("Сумма чисел = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Разность чисел = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("Произведение чисел = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println("Частное чисел = " + (num1 / num2));
        } else if (operation == '%') {
            System.out.println("Деление чисел по модулю = " + (num1 % num2));
        } else if (operation == '^') {
            float result = 1;
            for (int i = 1; i <= num2; i++) {
               result *= num1;
            }
            System.out.println(num1 + " в степени " + num2 + " = " + result);
        } else
            System.out.println("Введена неправильная операция");
    }
}
