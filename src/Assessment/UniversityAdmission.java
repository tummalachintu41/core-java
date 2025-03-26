package Assessment;
import java.util.Scanner;
public class UniversityAdmission {
        private String name;
        private int age;
        private double marks;
        private String course;

        public UniversityAdmission(String name, int age, double marks, String course) {
            this.name = name;
            this.age = age;
            this.marks = marks;
            this.course = course;
        }

        public void processAdmission() {
            if (age >= 17 && marks >= 50) {
                System.out.println("Admission Successful!");
            } else {
                System.out.println("Admission Denied!");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Marks (%): ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            UniversityAdmission admission = new UniversityAdmission(name, age, marks, course);
            admission.processAdmission();

            scanner.close();
        }
    }
