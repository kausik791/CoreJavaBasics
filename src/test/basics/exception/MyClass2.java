package test.basics.exception;

import java.io.File;
import java.io.FileReader;

public class MyClass2 {

    public static void main(String[] args)  {
        File file = new File("C://myFile.txt");
        try (FileReader fr = new FileReader(file)) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after catch");
    }
}

















