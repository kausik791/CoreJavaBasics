package test.basics.partialabstaction;

public class Square extends Shape{
    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }

    @Override
    String info() {
        //Because info() is an instance method, Java implicitly uses the current object (this) when you call other instance members. So the call to area() is equivalent to this.area() and doesn't need an explicit object.
        return "I'm a " + super.color + " Square and my area is " + area();
    }
}
