package modyfikatory;

public class Rectangle extends Shape {
    private int lenght;
    private int width;

    @Override
    double getArea() {
        return lenght * width;
    }

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }
}
