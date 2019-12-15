package Lab14;

public class Mouse extends Animal {
    private static int licz;
    private static String type = "mysz";

    public Mouse() {
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
