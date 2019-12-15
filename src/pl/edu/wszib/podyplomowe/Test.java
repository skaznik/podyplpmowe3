package pl.edu.wszib.podyplomowe;

import java.awt.*;


public class Test {
    public static void main(String[] args) {
        System.out.println("Pakiet: " + Test.class.getPackage());   //pobieranie nazwy pakietu z clasy (this. nie działa);
        pl.edu.wszib.java.PackagePresenter javaPackagePresenter = new pl.edu.wszib.java.PackagePresenter(); //clasy o tej samej nazwie ALE!!!! z innych pakietów+
        PackagePresenter podyplomowePackagePresenter = new PackagePresenter();

        javaPackagePresenter.showPackage();
        podyplomowePackagePresenter.showPackage();
    }
}
