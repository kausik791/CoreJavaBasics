package test.basics.exception;

public class example {

    static void test() {
        try {
            System.out.println("in Try block");
            int x=10/0;
        } catch (Exception e) {
            System.out.println("in Catch block");
        } finally {
            System.out.println("in Finally block");
        }
    }

    public static void main(String[] args) {
        test();

    }
}
