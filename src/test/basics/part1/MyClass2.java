package test.basics.part1;

public class MyClass2 {
    static int i;

    public MyClass2() {

    }

    public MyClass2(int i) {
        this.i = i;

    }

    public static void main(String[] args) {
        //MyClass2.initialize();
        initialize();
       // System.out.println("Value of i: " + MyClass2.i);
        System.out.println("Value of i: " +i);
    }

    public static void initialize() {
        i = 6;
    }
}
