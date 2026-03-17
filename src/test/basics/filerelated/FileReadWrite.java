package test.basics.filerelated;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        File file1 = new File("folder/anotherFolder/file1.txt");
        File file2 = new File("folder/anotherFolder/file2.txt");
        File output = new File("folder/anotherFolder/merge.txt");

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {
            String line;

            // Read first file
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Optional separator
            bw.write("----- File 2 Content -----");
            bw.newLine();

            // Read second file
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
