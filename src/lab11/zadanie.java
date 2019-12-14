package lab11;

import org.w3c.dom.ls.LSOutput;

public class zadanie {

    static class A {
   public A() {
        System.out.println("Konstruktor A");
    }
    public A(boolean a) {
        if (a ==  false) {
            System.out.println("Konstruktor A");
        }
    }
    }

    static class B extends A {
    public B() {
        System.out.println("Konstruktor B");
    }
    public B(boolean a ){
        super(true);
        if (a == false) {
            System.out.println("Konstruktor B");
        }
    }
    }

    static class C extends B {
        public C() {
            System.out.println("Konstruktor C");
        }
        public C(boolean a) {
            super(true);
            if (a==false) {
                System.out.println("Konstruktor C");
            }
        }
    }

    public static void main(String[] args) {
        new C();
        new B(true);
        new C(false);


    }
}


