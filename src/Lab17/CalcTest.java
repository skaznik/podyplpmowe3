package Lab17;

import exeptions.CheckExceptionDemo;

public class CalcTest {
    public static void main(String[] args) {
        System.out.println("Add " + Computation.ADD.perform(5,6));
        System.out.println("Multiply " + Computation.MULTIPLY.perform(3,5));
    }
}
