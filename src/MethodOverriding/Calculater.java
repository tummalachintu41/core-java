package MethodOverloding;

public class Calculater {
    public int add(int n1,int n2){
        return n1 + n2;
    }

    public int add2(int n1, int n2, int n3){
        return n1 + n2 +n3;
    }

    public static void main(String[] args) {
        Calculater obj = new Calculater();
        int r1=obj.add(7,18);
        int r2=obj.add2(20,30,7);
        System.out.println(r1);
        System.out.println(r2);
    }
}
