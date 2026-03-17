package test.basics.exception;

public class example {

    static void test() {
        try {
            System.out.println("in Try");
            int x=10/0;
        } catch (Exception e) {
            System.out.println("in Catch");
        } finally {
            System.out.println("in Finally");
        }
    }

    public static void main(String[] args) {
        test();

    }
}
