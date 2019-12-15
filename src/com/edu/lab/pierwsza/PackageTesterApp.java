package com.edu.lab.pierwsza;

public class PackageTesterApp {

    public static void main(String[] args) {
        System.out.println("Pakiet : "+PackageTesterApp.class.getPackage());
        PackageTester packageTester = new PackageTester();
        com.edu.lab.druga.PackageTester packageTester1 = new com.edu.lab.druga.PackageTester();
        com.edu.lab.trzecia.PackageTester packageTester2 = new com.edu.lab.trzecia.PackageTester();

        packageTester.introduce();
        packageTester1.introduce();
        packageTester2.introduce();
    }
}
