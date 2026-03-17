package test.basics.accessmodifier.dev;

//import qa.QaClass;

import test.basics.accessmodifier.qa.QaClass;

public class MyClass extends QaClass {

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.myClassMethod();
    }

    public void myClassMethod(){
        myMethod();
    }
}
