package test.basics.oops;

public class Employee {
    int id;
    String name;
    double salary;

//we can have parameterized constructor even with extra parameters like age .
    public Employee(int id, String name, double salary,int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
