package core;

public class Car {
    public static void main(String[] args) {
        Carbrand carbrand = new Carbrand();
        carbrand.brands = ("BMW"+"Toyota");
        carbrand.models = ("X5"+"camry");
        carbrand.year = 2020+2024;
        carbrand.price = 6000000+9000000;
        carbrand.km = ("59000"+"1500");
        carbrand.color = ("red");

        System.out.println(carbrand.brands);
        System.out.println(carbrand.models);
        System.out.println(carbrand.year);
        System.out.println(carbrand.price);
        System.out.println(carbrand.km);
        System.out.println(carbrand.color);
    }
}
