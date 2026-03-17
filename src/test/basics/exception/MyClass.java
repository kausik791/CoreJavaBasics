package test.basics.exception;

import java.io.File;

public class MyClass {

    public static void main(String[] args) {
        try {
            System.out.println("random");
            throw new MyException("throwing my own exception");
        } catch (MyException e) {
            e.printException();
            //System.out.println(e.getMessage());
        }
        System.out.println("after exception");
    }
}

















