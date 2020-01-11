package pl.edu.wszib.jwe;

public class LettersApp {
    public static void main(String[] args) {
        A a = new A();
        a.introduce();;
        B b = new B();
        b.introduce();
        System.out.println("Po interface");

        Letter a1 = new A();
        a1.introduce();

        Letter b1 = new B();
        b1.introduce();

        System.out.println("Inny przykład");

        A aaa = new B();
        aaa.introduce();
    }

}

interface Letter {
    void introduce();
}

class A implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem A");
    }
}

class B extends A implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem B");
    }
}

