package methods;

public class Employe {
    public String name;
    public int age;
    public String department;
    public String email;
    public double salary;
    public String num;

    public String EmployeDetails(){
        System.out.println("Employe name is:" + name);
        System.out.println("Employe age is:" + age);
        System.out.println("Employe department is:" + department);
        System.out.println("Employe email is:" + email);
        System.out.println("Employe salary is:" + salary);
        System.out.println("Employe num is:" + num);
        return "name" + "age" + "department" + "email" + "salary" + "num";
    }

    public static void main(String[] args) {
        Employe employe = new Employe();
        employe.name = "Chintu";
        employe.age = 22;
        employe.department = "IT";
        employe.email = "tummala.rohith15@gmail.com";
        employe.salary = 60000;
        employe.num = "9100173554";
        employe.EmployeDetails();
    }
}