package test.basics.oops;

public class ParentChild {
    public static void main(String[] args) {
        Child child = new Child();
        child.circle();
        /* if you wanted to call the parent's circle() method,
         you would have to do it from inside the Child class. For example:
         */
        /* // ... existing code ...
     @Override
     public void circle() {
        super.circle(); // This calls ParentAbstract's circle()
        System.out.println("Child circle");
    }
}*/
        //child.super.circle();// error

        ParentAbstract parent = new Child();
        parent.circle();
    }

}
