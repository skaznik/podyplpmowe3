package przeciążanie_metod;

public class Printer {
    int x = 0;
    int y = 1;

    void printMe() {
        System.out.println("x wynosi " + x + "a y wynosi " + y);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getName());
    }

}
