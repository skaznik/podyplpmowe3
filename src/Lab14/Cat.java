package Lab14;

public class Cat extends Animal {
    private static int licz;
    private static String type = "kot";

    public Cat() {
        licz++;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceNumber() {
        return licz;
    }
}
