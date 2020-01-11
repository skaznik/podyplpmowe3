public class Rectangle {
    public int dlugosc;
    public int szerokosc;

    public Rectangle() {

    }

    public Rectangle(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public Rectangle(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5,7);
        Rectangle rectangle2 = new Rectangle(5);
        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        //System.out.println(pole(5,6));
        //System.out.println(pole(5));
    }
}
