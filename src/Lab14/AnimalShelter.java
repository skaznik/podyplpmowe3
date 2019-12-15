package Lab14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Animal[] box = new Animal[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int next = random.nextInt(3);
            switch (next) {
                case 0:
                    box[i] = new Dog();
                    break;
                case 1:
                    box[i] = new Cat();
                    break;
                case 2:
                    box[i] = new Mouse();
                    break;
            }

        }

        System.out.println(box[33].getType());
        System.out.println("Liczba zwierząt rodzaju (" + box[33].getType() + ") w schronisku  wynosi " + box[33].getInstanceNumber());

    }

}