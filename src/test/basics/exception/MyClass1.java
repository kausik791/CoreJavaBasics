package test.basics.exception;

public class MyClass1 {

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("new exception!");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}

















