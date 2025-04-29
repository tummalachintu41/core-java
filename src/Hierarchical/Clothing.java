package Hierarchical;

public class Clothing extends Product{
    public String size;

    public Clothing(String name, int price, String size) {
        super(name, price);
        this.size=size;
    }

    public void ClothingDetails(){
        ProductDetails();
        System.out.println("size:"+size);
    }
}
