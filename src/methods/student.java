package methods;

public class student {
    public String name;
    public int age;
    public String num;
    public String idnum;

    public String studentDetails(){
        System.out.println("student name is:" + name);
        System.out.println("student age is:" + age);
        System.out.println("student num is:" + num);
        System.out.println("student idnum is:" + idnum);
        return "name" + age + "num" + "idnum";
    }

    public static void main(String[] args) {
        student student = new student();
        student.name = "chintu";
        student.age = 22;
        student.num = "9100173554";
        student.idnum = "21BBS0134";
        student.studentDetails();
    }
}
