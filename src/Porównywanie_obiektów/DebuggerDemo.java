package Porównywanie_obiektów;

import java.util.Random;

public class DebuggerDemo {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fill(numbers); //można użyć, gdyż jest to metoda statyczna
        show(numbers);
    }
    static void fill(int[] numbers) {
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10); //losujemy ze zbioru od 0 do 9
        }
    }

    static void show(int[] numbers) {
        for(int number : numbers) {
            System.out.print(number + ",");
        }

    }
}
