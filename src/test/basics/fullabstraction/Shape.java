package test.basics.fullabstraction;

interface Shape {
    //In a Java interface all fields are implicitly public static final.
    //Equivalent declaration: public static final int i = 5;
    int i = 5;

    String color();
    double area();
    String info();
//In a Java interface all methods are implicitly public and abstract (except default and static methods).
    //when ever we are not sure about the implementation of method we can use default method in interface
    // we are not forced to override it in the implementing class
    //once we are sure about the implementation we can override it in the implementing class by removing default keyword from interface method
    default void defaultMethodWithoutImplementaion(){
        System.out.println("default method in interface");
    }
    //we are removing default keyword to force implementing class to override this method
    void defaultMethod();

    static void staticMethod(){
        System.out.println("static method");
    }
}
