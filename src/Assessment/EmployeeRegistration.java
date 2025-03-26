package Assessment;

import java.util.Scanner;

public class EmployeeRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();


        if (age < 21) {
            System.out.println("Error: Employee age must be at least 21 years.");
        } else if (salary <= 20000) {
            System.out.println("Error: Employee salary must be greater than 20,000.");
        } else {
            Employee employee = new Employee(name, age, department, salary);
            employee.displayDetails();
        }

        scanner.close();
    }
}
