package Lab14;

public class Dog extends Animal {
    private static int licz;
    private static String type = "pies";

    public Dog() {
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
