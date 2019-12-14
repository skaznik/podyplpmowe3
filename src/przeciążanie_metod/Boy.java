package przeciążanie_metod;

public class Boy extends Human {
String a = "mleko";
void eat() {
    System.out.println(" Jestem chłopczykiem i piję " + a);
}

    public static void main(String[] args) {
        Boy b = new Boy();
        b.eat();
        Human c = new Human();
        c.eat();
    }
}
