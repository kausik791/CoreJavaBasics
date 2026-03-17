package test.basics.fullabstraction;

public interface ParentInterface {
   //int value; // by default interface fields are implicitly public static final so we have to initialize it
   int value=10;
    public void myMethod();

    public static void parentStaticMethod(){
        System.out.println("Parent Static Method");
    }
    public default void MyDefaultMethod(){
        System.out.println("Interface Default Method");
    }

}
