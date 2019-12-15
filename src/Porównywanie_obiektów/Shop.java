package Porównywanie_obiektów;

public class Shop {
    public static void main(String[] args) {
        Product milk1 = new Product("Mleko", 2.78);
        Product milk2 = new Product("Mleko", 2.79);

        System.out.println(milk1==milk2); //false (dwa różne obiekty)
        System.out.println(milk1.equals(milk2)); //false (nie te same obiekty strukturalne), po zmianie ceny i wygenerowaniu (przykryciu) metody equels otrzymujemy true
    }
}
