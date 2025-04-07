public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("tupa");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        sheep1.makeSound();
        cow1.makeSound();
        horse1.makeSound();


        System.out.println();
        System.out.println(sheep1);
        System.out.println(cow1);
        System.out.println(horse1);
    }
}
