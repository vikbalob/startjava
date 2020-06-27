import java.util.Scanner;

public class MyFirstGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int compNum = 93;
        int userNum = 0;
        int attempts = 0;

        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
        System.out.println("Введите число: ");

        do {
            attempts++;
            userNum = scanner.nextInt();
            if (userNum > compNum) {
                System.out.println("Ваше число больше");
            } else if (userNum < compNum) {
                System.out.println("Ваше число меньше");
            }
        } while (userNum != compNum);
        System.out.println("Вы угадали с " + attempts + " попытки");
    }
}
