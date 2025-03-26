package methods;

public class Mathproblems {
    //Static method
    public static int add(int a,int b,int c,int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int sum = Mathproblems.add(5,3,10,2);
        System.out.println("sum:"+sum);
    }

//    public static void main(String[] args) {
//        int sum = Mathproblems.add(5,3,10,2);
//        System.out.println("sum:" + Mathproblems.add(5,3,10,2));
//    }
}
