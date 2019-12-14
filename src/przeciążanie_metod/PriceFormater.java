package przeciążanie_metod;

public class PriceFormater {
 String currency = "zł";

 String formatPrice(int value) {
     return String.format("%d,00 %s",value,currency);
 }

 String formatPrice(double value) {
     return String.format("%.2f %s", value, currency);
 }

 String formatPrice(String value) {
     return String.format("%.2f %s", Double.parseDouble(value), currency);
 }
    public static void main(String[] args) {
        PriceFormater pf = new PriceFormater();
        pf.currency = "PLN";
        System.out.println(pf.formatPrice(7));
        System.out.println(pf.formatPrice(12.56789));
        System.out.println(pf.formatPrice("3.78"));
    }
}
