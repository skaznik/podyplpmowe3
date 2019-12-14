package przeciążanie_metod;

public class Boy extends Human {
String a = "mleko";
void eat() {
    System.out.println(" Piję " + a);
}

    public static void main(String[] args) {
        Boy b = new Boy();
        b.eat();
    }
}
