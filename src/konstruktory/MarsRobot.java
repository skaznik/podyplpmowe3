package konstruktory;

public class MarsRobot {
    String status;
    int speed;
    int power;

    MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }
    MarsRobot() {} //konstruktor domyśłny - bezargumentowy

    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("Exploracja", 3, 20);
    }
}
