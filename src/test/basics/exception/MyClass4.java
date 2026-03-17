package test.basics.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass4 {

    public static void main(String[] args) {
        File file = new File("C://myFile.txt");
        try(FileReader fr= new FileReader(file)) {

        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println("after catch");
    }
}

















