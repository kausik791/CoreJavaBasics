package test.basics.filerelated;

import java.io.*;

public class UsingStream {
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

        FileOutputStream os = null;
        try {
            //os = new FileOutputStream(file);// it overwrites existing content
            os = new FileOutputStream(file,true);// it appends to existing content
            String str = "My String";
            os.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null)
                    os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}













