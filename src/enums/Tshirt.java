package enums;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Polex");
        Tshirt tshirt1 = new Tshirt(TshirtSize.S, "Polex");
        Tshirt tshirt2 = new Tshirt(TshirtSize.XL, "Adidas");
        System.out.println(tshirt.getTshirtSizeDetails());
        System.out.println(tshirt1.getTshirtSizeDetails());
        System.out.println(tshirt2.getTshirtSizeDetails());

    }
    public String getTshirtSizeDetails() {
        return size + "(" + size.getChestWidth()+ " "+ size.getShirtLenght()+ " "+ size.getSleeveLenght()+" "+manufacturer+")";
    }
}
