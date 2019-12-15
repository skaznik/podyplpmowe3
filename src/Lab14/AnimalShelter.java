package Lab14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Animal[] kojce = new Animal[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int next = random.nextInt(3);
            switch (next) {
                case 0:
                    kojce[i] = new Dog();
                    break;
                case 1:
                    kojce[i] = new Cat();
                    break;
                case 2:
                    kojce[i] = new Mouse();
                    break;
            }

        }

        System.out.println(kojce[33].getType());
        System.out.println("Liczba " + kojce[33].getType() + " jest " + kojce[33].getInstanceNumber());

    }

}