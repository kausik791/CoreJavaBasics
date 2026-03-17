package test.basics.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass3 {

    public static void main(String[] args) {
        File file = new File("C://myFile.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } finally {
            try {
                if (fr == null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing the file reader");
                e.printStackTrace();
            }
        }
        System.out.println("after catch");
    }
}

















