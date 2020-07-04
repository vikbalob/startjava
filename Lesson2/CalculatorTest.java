import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter first number");
            calc.setNum1(sc.nextFloat());
            System.out.println("Enter char of the math operation");
            calc.setOperation(sc.next().charAt(0));
            System.out.println("Enter second number");
            calc.setNum2(sc.nextFloat());
            System.out.println(calc.getResult());
            System.out.println("Do you want to continue? [Y/N]: ");
            sc.nextLine();
        } while (sc.nextLine().equalsIgnoreCase("Y"));

















    }
}
