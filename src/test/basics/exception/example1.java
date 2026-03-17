package test.basics.exception;

public class example1 {

//    static int test() {
//        try {
//            System.out.println("In try block");
//            return 1;
//        } finally {
//            return 2;
//        }
//    }
//
//    public static void main(String[] args) {
//        int returnValue = test();
//        System.out.println(test());
//
//    }
 int test() {
    try {
        System.out.println("In try block");
        return 1;
    } finally {
        return 2;
    }
}

    public static void main(String[] args) {
        example1 ex= new example1();
        int returnValue = ex.test();
        System.out.println(returnValue);
        System.out.println(ex.test());

    }
}
