package test.basics.exception;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public void printException(){
        System.out.println(getMessage());
        System.out.println("user defined exception!");
    }

}
