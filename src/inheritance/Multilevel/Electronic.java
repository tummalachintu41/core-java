package inheritance.Multilevel;

public class Electronic extends product{
    public String brand;

    public Electronic(String name, int price) {
        super(name, price);
        this.brand=brand;
    }

    @Override
    public void getDetails(String currency) {
        super.getDetails(currency);
        System.out.println("brand"+brand);
    }
}
