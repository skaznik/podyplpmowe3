package pl.edu.wszib.java;

public class PackagePresenter {
    public PackagePresenter() {
        System.out.println("Dzień dobry!");
    }

    public void showPackage() {
        System.out.print("To jest obiekt clasy : " +this.getClass().getName());
        System.out.println( ", w pakiecie : " + this.getClass().getPackage());
    }
}
