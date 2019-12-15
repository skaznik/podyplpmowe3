package pakiety;

import java.awt.*;

public class PackageColorTester {
    public static void main(String[] args) {
        java.lang.System.out.println("DZeń dobry!"); //import kwalifikowany domyślnej klasy java.lang (nie trzeba dopisywać!!!!)
        java.awt.Point point = new java.awt.Point(1,1) //pełny import kwalifikowany klasy awt
        Color color = new Color(255,0,0);
    }
}
