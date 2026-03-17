package test.basics.fullabstraction;

public class ChildtoParent implements ParentInterface{
    @Override
    public void myMethod() {
        System.out.println("Child overloaded Method");

    }

    @Override
    public void MyDefaultMethod() {// this method is not mandatory to override
        System.out.println("Child Default Method");
        //ParentInterface.super.parentDefaultMethod();
    }
}
