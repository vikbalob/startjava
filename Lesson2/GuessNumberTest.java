import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer = 'Y';

        while (answer != 'N') {
            if (answer == 'Y') {
                System.out.println("TASK: Guess the number (from 0 to 100).");
                System.out.println("Enter name of the first player:");
                Player user1 = new Player();
                user1.setName(sc.next());
                Player user2 = new Player();
                System.out.println("Enter name of the second player:");
                user2.setName(sc.next());
                GuessNumber gn = new GuessNumber();
                do {
                    System.out.println("Enter the number (" + user1.getName() + "):");
                    user1.setNumber(sc.nextInt());
                    if (user1.getNumber() < gn.getCompNum()) {
                        System.out.println("The number is greater than yours!");
                    } else if (user1.getNumber() > gn.getCompNum()) {
                        System.out.println("The number less than yours!");
                    } else {
                        break;
                    }
                    System.out.println("Enter the number (" + user2.getName() + "):");
                    user2.setNumber(sc.nextInt());
                    if (user2.getNumber() < gn.getCompNum()) {
                        System.out.println("The number is greater than yours!");
                    } else if (user2.getNumber() > gn.getCompNum()) {
                        System.out.println("The number less than yours!");
                    } else {
                        break;
                    }
                } while (user1.getNumber() != gn.getCompNum() || user2.getNumber() != gn.getCompNum());

                if (user1.getNumber() == gn.getCompNum()) {
                    System.out.println("Winner is " + user1.getName());
                } else {
                    System.out.println("Winner is " + user2.getName());
                }
            }
            System.out.println("Do you want to continue? [Y/N]:");
            answer = sc.next().charAt(0);
            if (answer != 'N' && answer != 'Y') {
                System.out.println("Wrong answer! Try again!");
            }
        }
    }
}