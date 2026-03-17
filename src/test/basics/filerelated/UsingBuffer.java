package test.basics.filerelated;

import java.io.*;

public class UsingBuffer {

    public static void main(String[] args) {

        String dirPath = "folder" + File.separator + "anotherFolder";
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(dirPath + File.separator + "MyFile.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //try (PrintWriter pw = new PrintWriter(file)) {// it overwrites existing content
        try (PrintWriter pw = new PrintWriter(new FileWriter((file),true))) {  // it appends to existing content
            pw.println("My 2nd Buffer line");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
