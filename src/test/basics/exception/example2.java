package test.basics.exception;

public class example2 {

    static int test() {
        try {
            System.out.println("Try");
            return 1;
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());

    }
}
