public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1722f, 9, 8, 6);
        System.out.println("ModelName: " + jaeger1.getModelName());
        System.out.println("Mark: " + jaeger1.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight());
        System.out.println("Weight: " + jaeger1.getWeight());
        System.out.println("Speed: " + jaeger1.getSpeed());
        System.out.println("Strength: " + jaeger1.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor());

        System.out.println();

        Jaeger jaeger2 = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7890f, 8, 4, 6);
        System.out.println("ModelName: " + jaeger2.getModelName());
        System.out.println("Mark: " + jaeger2.getMark());
        System.out.println("Origin: " + jaeger2.getOrigin());
        System.out.println("Height: " + jaeger2.getHeight());
        System.out.println("Weight: " + jaeger2.getWeight());
        System.out.println("Speed: " + jaeger2.getSpeed());
        System.out.println("Strength: " + jaeger2.getStrength());
        System.out.println("Armor: " + jaeger2.getArmor());
    }
}