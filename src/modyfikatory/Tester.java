package modyfikatory;

public class Tester {
    public static void main(String[] args) {
        A a = new A();
        a.number = 20;
        A b = new A();
        b.setNumber1(30); // brak dostępu z uwagi na private
        System.out.println(a.number);
    }

}

class A {
    public int number;
    private int number1;
    //pola zazwyczaj opisuje się jako prywatne (private) - z pola korzystają metody, po ustawieniu getterów i setterów

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }
}