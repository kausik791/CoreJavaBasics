package test.basics.StringRelated;

public class Practice2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 ="Java";
        System.out.println(s1 == s3);  // false
        s1=s1.intern();
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s3);// true
        System.out.println(s1.equals(s3));// true

    }
}
