public class Vars {
    int i; //zadeklarowana zmienna egzemplarza (pole klasy)
    static int j = 2; //zmienna klasowa (pole statyczne)
    public int change() {
        int k = 7;
        return i + (k + j);
    }

    public static void main(String[] args) {
        int i = 77; //zmienna lokalna
        Vars v = new Vars();  //zmienna lokalna
    }
}
