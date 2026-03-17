package test.basics.Builder.MandatoryField;

import java.util.Objects;

public class Employee {
    private final String name; // mandatory
    private final int age;
    private final String email;
    private final String phone;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static EmployeeBuilder builder(String name) {
        return new EmployeeBuilder(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // ---------- BUILDER ----------
    public static class EmployeeBuilder {

        private final String name; // mandatory
        private int age;
        private String email;
        private String phone;

        private EmployeeBuilder(String name) {
            this.name = Objects.requireNonNull(name, "Name must not be null");
        }

        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
