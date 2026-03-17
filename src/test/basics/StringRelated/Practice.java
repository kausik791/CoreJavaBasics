package test.basics.StringRelated;

public class Practice {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        
        String s4="Hi";
        s4.concat("world");
        System.out.println(s4); // Hi
        
        StringBuilder sb = new StringBuilder("Hi");
        //sb.append("world");
        sb.append(new StringBuilder("world"));
        System.out.println(sb); // Hiworld
        
    }
}
