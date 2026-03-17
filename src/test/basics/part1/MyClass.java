package test.basics.part1;

public class MyClass {
    int i;

    public MyClass() {
        i = 5;
    }

    public MyClass(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("Value of i: " + myClass.i);
        myClass.initialize();
        System.out.println("Value of i: " + myClass.i);
        MyClass myClass1 = new MyClass(10);
        System.out.println("Value of i in anotherClass: " + myClass1.i);

    }

    public void initialize() {
        i = 6;
    }
}
