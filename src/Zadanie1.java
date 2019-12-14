public class Zadanie1 {
    void sqrt (Double liczba) {
        System.out.println(Math.sqrt(liczba));
    }

    public static void main(String[] args) {
    Zadanie1 pierwiastek = new Zadanie1();
        for (int i=0;i<args.length;i++)
    {
        System.out.print(" pierwiastek z " + args[i] + " = ");
        pierwiastek.sqrt(Double.parseDouble(args[i]));
    }

}
}