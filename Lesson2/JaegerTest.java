public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1722f, 9, 8, 6);
        System.out.println("ModelName: " + jaeger1.modelName);
        System.out.println("Mark: " + jaeger1.mark);
        System.out.println("Origin: " + jaeger1.origin);
        System.out.println("Height: " + jaeger1.height);
        System.out.println("Weight: " + jaeger1.weight);
        System.out.println("Speed: " + jaeger1.speed);
        System.out.println("Strength: " + jaeger1.strength);
        System.out.println("Armor: " + jaeger1.armor);

        System.out.println();

        Jaeger jaeger2 = new Jaeger("Horizon Brave", "Mark-1", "China", 72.54f, 7890f, 8, 4, 6);
        System.out.println("ModelName: " + jaeger2.modelName);
        System.out.println("Mark: " + jaeger2.mark);
        System.out.println("Origin: " + jaeger2.origin);
        System.out.println("Height: " + jaeger2.height);
        System.out.println("Weight: " + jaeger2.weight);
        System.out.println("Speed: " + jaeger2.speed);
        System.out.println("Strength: " + jaeger2.strength);
        System.out.println("Armor: " + jaeger2.armor);
    }
}