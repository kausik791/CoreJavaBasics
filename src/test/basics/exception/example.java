package test.basics.exception;

public class example {

    static void test() {
        try {
            System.out.println("Try");
            int x=10/0;
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        test();

    }
}
