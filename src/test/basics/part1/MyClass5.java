package test.basics.part1;

public class MyClass5 {
    public static void main(String[] args) {
        MyClass5 obj = new MyClass5();
        obj.myTestMethod();
    }
    public void myTestMethod() {
      MyClass4 myClass4=new MyClass4();
      MyClass4.initialize();
      System.out.println("Value of i in MyClass4: "+myClass4.i);

    }
}
