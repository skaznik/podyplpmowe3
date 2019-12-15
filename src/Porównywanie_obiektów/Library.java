package Porównywanie_obiektów;

public class Library {

  static Book[] tablica = new Book[]{new Book("PHP&MySQL", "nieznany", "Helion", 2015),
           new Book("Delphi", "Pamuła", "Helion", 2018), new Book("Java", "Mickiewicz", "Helion", 2019),
           new Book("HTML5.0+CSS", "Ktoś", "Helion", 2012), new Book("Java", "Mickiewicz", "Helion", 2019)};

    public static void main(String[] args) {

        System.out.println(tablica[1].toString()+tablica[2].toString()+"równe : "+tablica[1].equals(tablica[2]));
        System.out.println(tablica[2].toString()+tablica[4].toString()+" równe : "+tablica[2].equals(tablica[4]));
    }

}
