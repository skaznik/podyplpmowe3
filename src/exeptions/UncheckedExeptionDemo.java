package exeptions;

public class UncheckedExeptionDemo {

    public static void main(String[] args) {
        UncheckedExeptionDemo ued = new UncheckedExeptionDemo();
        int i = ued.getNumberFormatString("6");
        if (i != -1) {
            System.out.println("To nasza liczba pomnożona przez 5 : " + i * 5);
        }
    }

    public int getNumberFormatString(String number) {
        try {
        return Integer.parseInt(number);
    } catch (NumberFormatException nfe){
            System.out.println("Upsss. Coś poszło nie tak - upewnij się, że przekazaywany string jest liczbą!");
        }
        return -1;
    }
}
