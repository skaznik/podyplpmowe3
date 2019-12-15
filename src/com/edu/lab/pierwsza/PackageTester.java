package com.edu.lab.pierwsza;

public class PackageTester {
    void introduce() {
        System.out.print("To jest obiekt clasy : " +this.getClass().getName());
        System.out.println( ", w pakiecie : " + this.getClass().getPackage());
    }
}
