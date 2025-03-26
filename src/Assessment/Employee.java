package Assessment;

public class Employee {
        private String name;
        private int age;
        private String department;
        private double salary;

        public Employee(String name, int age, String department, double salary) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Employee Registered Successfully! ");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }
    }

