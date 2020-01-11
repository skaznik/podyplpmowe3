package Lab16;

import java.util.Scanner;

public class Squert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        Double d = Double.parseDouble(scanner.nextLine());

        if (d < 0 ) {
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));
    }
}
