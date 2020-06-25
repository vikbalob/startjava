public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 26;
        if (age > 20) {
            System.out.println("Умудрен годами :)");
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("Мужской пол");
        }

        if (!isMan) {
            System.out.println("Женский пол");
        }

        double height = 1.85;
        if (height < 1.8) {
            System.out.println("Подрасти!");
        } else {
            System.out.println("Ишь, вымахал!");
        }

        char firstNameLetter = 'В';
        if (firstNameLetter == 'М') {
            System.out.println("Мммм...");
        } else if (firstNameLetter == 'И') {
            System.out.println("Ииихаа!!");
        } else {
            System.out.println("Виктор");
        }
    }
}
