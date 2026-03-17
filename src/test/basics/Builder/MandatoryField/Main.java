package test.basics.Builder.MandatoryField;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1 = Employee.builder("kausik")// without providing name it will give error
                .age(30)
                .build();
        Employee e2 = Employee.builder("John Doe")
                .age(30)
                .email("kausik")
                .phone("1234567890")
                .build();
        System.out.println("Employee 1: " + e1.getName() + ", " + e1.getAge());
        System.out.println("Employee 2: " + e2.getName() + ", " + e2.getAge() + ", " + e2.getEmail() + ", " + e2.getPhone());
    }
}