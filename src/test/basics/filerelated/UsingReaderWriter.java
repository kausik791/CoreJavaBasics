package test.basics.filerelated;

import java.io.*;

public class UsingReaderWriter {
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
        //try( FileWriter fw=new FileWriter(file)// it overwrites existing content

        //it appends to existing content
        try( FileWriter fw=new FileWriter(file,true)) {
          fw.write("first line");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}













