package newfeature.funtional_interfaces;

public class MyTask {
    public static void main(String[] args) {
        //MyFunctionalInterface myFunctionalInterface = (x) -> x*x;
        MyFunctionalInterface myFunctionalInterface = x -> x*x;
        System.out.println(myFunctionalInterface.execute(5)); //25
    }
}
