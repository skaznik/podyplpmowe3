package modyfikatory;

public class InstanceNumber {
    static private int numberInstances; //kolejność modyfikatorów nie ma znaczenia

    public static int getNumberInstances() {
        return numberInstances;
    }
    // konstruktor incrementuje numberInstances ...

    public InstanceNumber() {
        numberInstances++;
    }

    public static void setNumberInstances(int numberInstances) {
        InstanceNumber.numberInstances = numberInstances;
    }

    public static void main(String[] args) {
        for(int i = 1; i < 500; i++) {
            new InstanceNumber();
        }
        System.out.println("Utworzono obiektów : " + getNumberInstances());
    }
}
