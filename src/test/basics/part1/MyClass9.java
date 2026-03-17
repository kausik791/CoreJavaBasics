package test.basics.part1;

public class MyClass9 {
    public static void main(String[] args) {
        MyClass9 obj = new MyClass9();
        obj.myTestMethod();
    }
    public void myTestMethod() {
      MyClass8 myClass8=new MyClass8();
      System.out.println("Value of i in MyClass8 before initialize: "+myClass8.i);
      System.out.println("Value of i in MyClass8: "+myClass8.initialize().i);

    }
}
