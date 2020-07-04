public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Jack");
        wolfOne.setWeight(12f);
        wolfOne.setAge(-200);
        System.out.println("Wolf`s age = " + wolfOne.getAge());
        System.out.println("Wolf`s name = " + wolfOne.getName());
        System.out.println("Wolf`s weight = " + wolfOne.getWeight());
    }
}