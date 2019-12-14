public class StaticMetod {
    public static void main(String[] args) {
        B b = new B();
        b.print(); //Tożsame z wywyołeniem B.print() - metoda statyczna;

        A a = b; //tworzenie zmiennej typu a;
        a.print(); //Tożsame z wywołaniem A.print();
    }
}

class A {
    static void print() {
        System.out.println("A");
    }
}

class B extends A {
    static void print() {
        System.out.println("B");
    }

}