public class Passer {
    void toUpperCase(String[] strings) {
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase();

        }
    }

    public static void main(String[] args) {
        Passer passer = new Passer();
        passer.toUpperCase(args);
        for (String string : args) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
