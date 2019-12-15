package modyfikatory;

public class Tester {
    public static void main(String[] args) {
        A a = new A();
        a.number = 20;
        A b = new A();
       // b.number1 = 30  - brak dostępu z uwagi na private
        System.out.println(a.number);
    }

}

class A {
    public int number;
    private int number1;
}