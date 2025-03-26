package methods;

public class Constructors {
    String name;
    int rollnum;
    int age;
    double grade;

    public Constructors(String name,int rollnum,int age,double grade) {
        this.name = name;
        this.rollnum = rollnum;
        this.age = age;
        this.grade = grade;
    }

    public String display() {
        System.out.println("Name:"+name+",Rollnum:"+rollnum+",Age:"+age+",Grade:"+grade);
        return "display";
    }

    public static void main(String[] args) {
        Constructors s1 = new Constructors("chintu",134,22,7.5);
        s1.display();
    }
}
