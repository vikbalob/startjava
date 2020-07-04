public class Calculator {
    float num1, num2;
    char operation;

    public float getNum1() {
        return num1;
    }

    void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    void setNum2(float num2) {
        this.num2 = num2;
    }

    public char getOperation() {
        return operation;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public float result() {
        float result = 1;
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
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
            case '^':
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Wrong operation! Try again.");
        }
        return result;
    }
    public float getResult() {
        return result();
    }
}
