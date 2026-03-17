package test.basics.part1;

public class MyClass1 {
    int i;

    public MyClass1() {

    }

    public MyClass1(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        MyClass1 myClass = new MyClass1();

        myClass.initialize();
        System.out.println("Value of i: " + myClass.i);
        MyClass1 myClass1 = new MyClass1();
        System.out.println("Value of i in anotherClass: " + myClass1.i);

    }

    public void initialize() {
        i = 6;
    }
}
