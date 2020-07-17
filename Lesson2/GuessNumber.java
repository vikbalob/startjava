import java.util.Scanner;
public class GuessNumber {

    Scanner sc = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int compNum = (int) (Math.random() * 101);
        do {
            System.out.println("Enter the number (" + player1.getName() + "):");
            Player numPlayer1 = new Player(sc.nextInt());
            if (numPlayer1.getNumber() < compNum) {
                System.out.println("The number is greater than yours!");
            } else if (player1.getNumber() > compNum) {
                System.out.println("The number less than yours!");
            } else {
                break;
            }
            System.out.println("Enter the number (" + player2.getName() + "):");
            Player numPlayer2 = new Player(sc.nextInt());
            if (numPlayer2.getNumber() < compNum) {
                System.out.println("The number is greater than yours!");
            } else if (player2.getNumber() > compNum) {
                System.out.println("The number less than yours!");
            } else {
                break;
            }
        } while (player1.getNumber() != compNum || player2.getNumber() != compNum);

        if (player1.getNumber() == compNum) {
            System.out.println("Winner is " + player1.getName());
        } else {
            System.out.println("Winner is " + player2.getName());
        }
    }
}