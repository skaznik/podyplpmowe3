package konstruktory;

import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(String name) {
        this.name = name;
    }

    public NamedPoint(Point p, String name) {
        super(p);
        this.name = name;
    }

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }
    void show() {
        System.out.println(name + "("+x+","+y+")");
    }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5,5,"A");
        System.out.println("x wynosi : "+ np.x);
        System.out.println("y wynosi :" + np.y);
        System.out.println("nazywa się : " + np.name);
        np.show();
    }
}
