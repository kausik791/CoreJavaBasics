package test.basics.part1;

public class MyClass7 {
    public static void main(String[] args) {
        MyClass7 obj = new MyClass7();
        obj.myTestMethod();
    }
    public void myTestMethod() {
      MyClass6 myClass6=new MyClass6();
      System.out.println("Value of i in MyClass6: "+myClass6.initialize());

    }
}
