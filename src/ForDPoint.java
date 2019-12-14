import java.awt.*;

public class ForDPoint extends Point {
    int z;
    int t;
 public static ForDPoint create (int x, int y, int z, int t) {
     ForDPoint fpoint = new ForDPoint();
     fpoint.x = x;
     fpoint.y = y;
     fpoint.z = z;
     fpoint.t = t;
     return fpoint;
 }
 public void show() {
     System.out.println(this.x);
     System.out.println(this.y);
     System.out.println(this.z);
     System.out.println(this.t);
 }

    public static void main(String[] args) {
        ForDPoint p;
        p = create(5,4,7,9);
        p.show();
    }
}
