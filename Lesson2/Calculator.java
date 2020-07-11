public class Calculator {
    private float num1;
    private float num2;
    private char operation;

    void setNum1(float num1) {
        this.num1 = num1;
    }

    void setNum2(float num2) {
        this.num2 = num2;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public float calculate() {
        float result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! You cannot divide by zero.");
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Wrong operation! Try again.");
        }
        return result;
    }
}