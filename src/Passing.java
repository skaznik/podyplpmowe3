import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą ..." + i);
        changeIt(i);
        System.out.println("Po zmianie ..." + i);
        Point p = new Point(1,1);
        System.out.println("Przed zmianą p ..." + p);
        changeIt(p);
        System.out.println("Po zmianie ...." + p);
    }
    static void changeIt(int i) {
        System.out.println("Zmieniam i ...");
        i++;
    }
    static void changeIt(Point p) {
        p = new Point(4,4);
        System.out.println("p (lokalne) wskazuje  na " + p);
        p.x++;
        p.y++;
        System.out.println("Po zmianie p (lokalne) wskazuje  na " + p);
    }
}
