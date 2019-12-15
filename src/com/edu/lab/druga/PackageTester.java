package com.edu.lab.druga;

public class PackageTester {
   public void introduce() {
        System.out.print("To jest obiekt clasy : " +this.getClass().getName());
        System.out.println( ", w pakiecie : " + this.getClass().getPackage());
    }
}
