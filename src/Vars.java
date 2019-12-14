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
        v.i = 9;
        System.out.println("Wyświetlamy zmienną egzemplarza dla v : "+v.i);
        Vars vv = new Vars();
        vv.i = 5;
        System.out.println("Wyświetlamy zmienną egzemparza dla vv : "+vv.i);
        System.out.println("Wyświetlamy zmienną klasową : "+j);
        System.out.println("Wyświetlamy zmienną lokalną : "+i);
    }

    void show() {
        System.out.println("-----------------------------");
    }
}
