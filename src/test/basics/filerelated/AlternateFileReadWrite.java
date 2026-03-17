package test.basics.filerelated;

import java.io.*;

public class AlternateFileReadWrite {

    public static void main(String[] args) {
        File file1 = new File("folder/anotherFolder/file1.txt");
        File file2 = new File("folder/anotherFolder/file2.txt");
        File output = new File("folder/anotherFolder/output.txt");

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {
            String line1;
            String line2;

            // Read alternately
            while ((line1 = br1.readLine()) != null | (line2 = br2.readLine()) != null) {

                if (line1 != null) {
                    bw.write(line1);
                    bw.newLine();
                }

                if (line2 != null) {
                    bw.write(line2);
                    bw.newLine();
                }
            }

            System.out.println("Files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
