package test.basics.part1;

public class StringRelated {

    int i = 5;
    String str = "Hello World";

    public StringRelated() {
        str= str.concat(" !!");
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
//        str=str.substring(6);
//        System.out.println(str);
        str=str.substring(6,11);
        System.out.println(str);
        boolean flag = str.equalsIgnoreCase("WORLD");
        System.out.println("Is str equal to WORLD (ignoring case)? " + flag);
        str="5";
        int num = Integer.parseInt(str);
        System.out.println("Converted string to integer: " + num);
        str=String.valueOf(num);
        System.out.println("Converted integer back to string: " + str);
    }

    public static void main(String[] args) {
        StringRelated stringRelated=new StringRelated();
        stringRelated.stringCheck();
    }

    public void stringCheck() {

    }

    public StringRelated initialize() {
        i = 6;
        return this;
    }
}
