package farm;

public class Pig  extends Animal{
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "świnka "+ name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}

