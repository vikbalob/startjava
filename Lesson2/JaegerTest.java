public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setModelName("Crimson Typhoon");
        jaeger1.setMark("Mark-4");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(76.2f);
        jaeger1.setWeight(1722f);
        jaeger1.setSpeed(9);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        System.out.println("ModelName: " + jaeger1.getModelName());
        System.out.println("Mark: " + jaeger1.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight());
        System.out.println("Weight: " + jaeger1.getWeight());
        System.out.println("Speed: " + jaeger1.getSpeed());
        System.out.println("Strength: " + jaeger1.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor());

        System.out.println();

        jaeger2.setModelName("Horizon Brave");
        jaeger2.setMark("Mark-1");
        jaeger2.setHeight(72.54f);
        jaeger2.setWeight(7890f);
        jaeger2.setSpeed(8);
        jaeger2.setStrength(4);

        System.out.println("ModelName: " + jaeger2.getModelName());
        System.out.println("Mark: " + jaeger2.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin()); //значение совпадает с jaeger1
        System.out.println("Height: " + jaeger2.getHeight());
        System.out.println("Weight: " + jaeger2.getWeight());
        System.out.println("Speed: " + jaeger2.getSpeed());
        System.out.println("Strength: " + jaeger2.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor()); //значение совпадает с jaeger1
    }
}