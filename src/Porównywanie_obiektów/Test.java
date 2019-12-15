package Porównywanie_obiektów;

import java.awt.*;

public class Test {

    public static void main(String[] args) {
        Integer i = 1;  //zmiena lokalna musi zostać zainicjowana
        System.out.println(i);

        Point point = new Point(3,4);
        System.out.println(point);

        Employee employee = new Employee("Kowalski", 34, 4500);
        System.out.println(employee);
    }
}
