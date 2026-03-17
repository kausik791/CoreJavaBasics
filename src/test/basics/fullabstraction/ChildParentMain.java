package test.basics.fullabstraction;

public class ChildParentMain {
    public static void main(String[] args) {
        ParentInterface parent = new ChildtoParent();
        parent.myMethod();
        parent.MyDefaultMethod();
        // parent.parentStaticMethod();//Static method may only be called on its containing interface
        ChildtoParent child = new ChildtoParent();
        child.myMethod();
        child.MyDefaultMethod();
        //static method won't be inherited in implemented class so we can't call it either with class or object
        //child.parentStaticMethod();
        //ChildParentMain.parentStaticMethod();

        // we cannot invoke  MyDefaultMethod() from ParentInterface, only possible way is calling it from ChildtoParent MyDefaultMethod() method using super keyword.








    }
}
