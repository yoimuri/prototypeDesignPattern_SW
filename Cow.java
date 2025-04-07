public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "MoooaAAaaaAAA";
        this.food = "Grass";
    }

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String toString() {
        return "Cow{sound='" + sound + "', food='" + food + "', legs=" + legs + "}";
    }
}
