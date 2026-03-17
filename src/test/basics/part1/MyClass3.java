package test.basics.part1;

import static test.basics.part1.EnumConstants.MONDAY;
import static test.basics.part1.MyConstants.LONG_WAIT;

public class MyClass3 {

    public static void main(String[] args) {
        //System.out.println(MyConstants.LONG_WAIT);
        System.out.println(LONG_WAIT);// Static import allows to use the constant directly without class name
        //System.out.println(EnumConstants.MONDAY);
        System.out.println(MONDAY);// Static import allows to use the enum constant directly without class name
    }

}
